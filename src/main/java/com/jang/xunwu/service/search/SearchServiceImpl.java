package com.jang.xunwu.service.search;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jang.xunwu.entity.House;
import com.jang.xunwu.repository.HouseRepository;
import com.jang.xunwu.service.ServiceMultiResult;
import com.jang.xunwu.service.ServiceResult;
import com.jang.xunwu.web.form.MapSearch;
import com.jang.xunwu.web.form.RentSearch;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.index.reindex.DeleteByQueryRequestBuilder;
import org.elasticsearch.rest.RestStatus;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * title SearchServiceImpl
 * projectName xunwu
 * desc 检索接口实现
 *
 * @author Jang
 * @date 2020/1/11 18:39
 */
@Service
public class SearchServiceImpl implements ISearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    private static final String INDEX_NAME = "xunwu";

    private static final String INDEX_TYPE = "house";

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TransportClient esClient;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void index(Long houseId) {
        House house = houseRepository.findOne(houseId);
        if (house == null) {
            logger.error("Index house {} dose not exist!", houseId);
            return;
        }

        HouseIndexTemplate indexTemplate = new HouseIndexTemplate();
        modelMapper.map(house, indexTemplate);

        // create

        // update

        // delete & create
    }

    private boolean create(HouseIndexTemplate indexTemplate) {
        try {
            IndexResponse response = this.esClient
                    .prepareIndex(INDEX_NAME, INDEX_TYPE)
                    .setSource(objectMapper.writeValueAsBytes(indexTemplate), XContentType.JSON).get();

            logger.debug("Create index with house: " + indexTemplate.getHouseId());
            return response.status() == RestStatus.CREATED;
        } catch (JsonProcessingException e) {
            logger.error("Error to index house: " + indexTemplate.getHouseId(), e);
            return false;
        }
    }

    private boolean update(String esId, HouseIndexTemplate indexTemplate) {
        try {
            UpdateResponse response = this.esClient
                    .prepareUpdate(INDEX_NAME, INDEX_TYPE, esId)
                    .setDoc(objectMapper.writeValueAsBytes(indexTemplate), XContentType.JSON).get();

            logger.debug("Create index with house: " + indexTemplate.getHouseId());
            return response.status() == RestStatus.OK;
        } catch (JsonProcessingException e) {
            logger.error("Error to index house: " + indexTemplate.getHouseId(), e);
            return false;
        }
    }

    private boolean deleteAndCreate(int totalHit, HouseIndexTemplate indexTemplate) {
        DeleteByQueryRequestBuilder builder = DeleteByQueryAction.INSTANCE
                .newRequestBuilder(esClient)
                .filter(QueryBuilders.termQuery(HouseIndexKey.HOUSE_ID, indexTemplate))
                .source(INDEX_NAME);

        logger.debug("Delete by query for house: " + builder);

        BulkByScrollResponse response = builder.get();
        long deleted = response.getDeleted();
        if (deleted != totalHit) {
            logger.warn("Need delete {}, but {} was deleted!", totalHit, deleted);
            return false;
        } else {
            return create(indexTemplate);
        }
    }

    @Override
    public void remove(Long houseId) {

    }

    @Override
    public ServiceMultiResult<Long> query(RentSearch rentSearch) {
        return null;
    }

    @Override
    public ServiceResult<List<String>> suggest(String prefix) {
        return null;
    }

    @Override
    public ServiceResult<Long> aggregateDistrictHouse(String cityEnName, String regionEnName, String district) {
        return null;
    }

    @Override
    public ServiceMultiResult<HouseBucketDTO> mapAggregate(String cityEnName) {
        return null;
    }

    @Override
    public ServiceMultiResult<Long> mapQuery(String cityEnName, String orderBy, String orderDirection, int start, int size) {
        return null;
    }

    @Override
    public ServiceMultiResult<Long> mapQuery(MapSearch mapSearch) {
        return null;
    }
}
