package com.jang.xunwu.repository;

import com.jang.xunwu.entity.SupportAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title SupportAddressRepository
 * projectName xunwu
 * desc 地址接口
 *
 * @author Jang
 * @date 2020/1/4 13:57
 */
public interface SupportAddressRepository extends CrudRepository<SupportAddress, Long> {

    /**
     * 获取所有对应行政级别的信息
     *
     * @param level 行政级别
     * @return List<SupportAddress>
     */
    List<SupportAddress> findAllByLevel(String level);

    /**
     * 根据上一级行政单位获取所有的行政级别信息
     *
     * @param level    行政级别
     * @param belongTo 上一级行政单位
     * @return List<SupportAddress>
     */
    List<SupportAddress> findAllByLevelAndBelongTo(String level, String belongTo);

    /**
     * 根据城市英文简写获取城市详细信息
     * @param enName 城市英文简写
     * @param level 行政级别
     * @return SupportAddress
     */
    SupportAddress findByEnNameAndLevel(String enName, String level);

    /**
     * 根据英文简写获取具体区域的信息
     * @param enName 地区英文简写
     * @param belongTo 上一级行政单位
     * @return SupportAddress
     */
    SupportAddress findByEnNameAndBelongTo(String enName, String belongTo);

}
