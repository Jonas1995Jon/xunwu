package com.jang.xunwu.repository;

import com.jang.xunwu.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title SubwayRepository
 * projectName xunwu
 * desc 地铁线路接口
 *
 * @author Jang
 * @date 2020/1/4 17:18
 */
public interface SubwayRepository extends CrudRepository<Subway, Long> {

    /**
     * 根据城市英文简写获取所有的地铁线路信息
     *
     * @param cityEnName 城市英文简写
     * @return List<Subway>
     */
    List<Subway> findAllByCityEnName(String cityEnName);

}
