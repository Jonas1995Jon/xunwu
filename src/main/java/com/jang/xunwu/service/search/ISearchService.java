package com.jang.xunwu.service.search;

import com.jang.xunwu.service.ServiceMultiResult;
import com.jang.xunwu.service.ServiceResult;
import com.jang.xunwu.web.form.MapSearch;
import com.jang.xunwu.web.form.RentSearch;

import java.util.List;

/**
 * title ISearchService
 * projectName xunwu
 * desc 检索接口
 *
 * @author Jang
 * @date 2020/1/11 18:34
 */
public interface ISearchService {

    /**
     * 索引目标房源
     *
     * @param houseId
     */
    void index(Long houseId);

    /**
     * 移除房源索引
     *
     * @param houseId
     */
    void remove(Long houseId);

    /**
     * 查询房源接口
     *
     * @param rentSearch
     * @return
     */
    ServiceMultiResult<Long> query(RentSearch rentSearch);

    /**
     * 获取补全建议关键词
     *
     * @param prefix
     * @return
     */
    ServiceResult<List<String>> suggest(String prefix);

    /**
     * 聚合特定小区的房间数
     *
     * @param cityEnName
     * @param regionEnName
     * @param district
     * @return
     */
    ServiceResult<Long> aggregateDistrictHouse(String cityEnName, String regionEnName, String district);

    /**
     * 聚合城市数据
     *
     * @param cityEnName
     * @return
     */
    ServiceMultiResult<HouseBucketDTO> mapAggregate(String cityEnName);

    /**
     * 城市级别查询
     *
     * @param cityEnName
     * @param orderBy
     * @param orderDirection
     * @param start
     * @param size
     * @return
     */
    ServiceMultiResult<Long> mapQuery(String cityEnName, String orderBy,
                                      String orderDirection, int start, int size);

    /**
     * 精确范围数据查询
     *
     * @param mapSearch
     * @return
     */
    ServiceMultiResult<Long> mapQuery(MapSearch mapSearch);

}
