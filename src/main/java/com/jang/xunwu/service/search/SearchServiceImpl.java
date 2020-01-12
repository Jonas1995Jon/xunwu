package com.jang.xunwu.service.search;

import com.jang.xunwu.service.ServiceMultiResult;
import com.jang.xunwu.service.ServiceResult;
import com.jang.xunwu.web.form.MapSearch;
import com.jang.xunwu.web.form.RentSearch;
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
    @Override
    public void index(Long houseId) {

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
