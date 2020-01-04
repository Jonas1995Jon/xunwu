package com.jang.xunwu.repository;

import com.jang.xunwu.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title SubwayStationRepository
 * projectName xunwu
 * desc 地铁站接口
 *
 * @author Jang
 * @date 2020/1/4 17:20
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {

    /**
     * 根据地铁编号获取所有地铁站信息
     *
     * @param subwayId 地铁编号
     * @return List<SubwayStation>
     */
    List<SubwayStation> findAllBySubwayId(Long subwayId);

}
