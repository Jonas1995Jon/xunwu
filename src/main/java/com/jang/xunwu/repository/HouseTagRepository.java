package com.jang.xunwu.repository;

import com.jang.xunwu.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title HouseTagRepository
 * projectName xunwu
 * desc 房源标签映射信息接口
 *
 * @author Jang
 * @date 2020/1/4 18:34
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {

    /**
     * 根据标签名和房源编号获取房源标签映射信息
     *
     * @param name    标签名
     * @param houseId 房源编号
     * @return HouseTag
     */
    HouseTag findByNameAndHouseId(String name, Long houseId);

    /**
     * 根据房源编号获取所有房源标签映射信息
     *
     * @param id 房源编号
     * @return List<HouseTag>
     */
    List<HouseTag> findAllByHouseId(Long id);

    /**
     * 根据房源编号集合获取所有对应的房源标签映射信息
     *
     * @param houseIds 房源编号集合
     * @return List<HouseTag>
     */
    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);

}
