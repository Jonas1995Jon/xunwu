package com.jang.xunwu.repository;

import com.jang.xunwu.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title HouseDetailRepository
 * projectName xunwu
 * desc 房源详情接口
 *
 * @author Jang
 * @date 2020/1/4 18:12
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long> {

    /**
     * 根据房源编号获取房源详情
     *
     * @param houseId 房源编号
     * @return HouseDetail
     */
    HouseDetail findByHouseId(Long houseId);

    /**
     * 根据房源编号集合获取房源详情集合
     *
     * @param houseIds 房源编号集合
     * @return List<HouseDetail>
     */
    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);

}
