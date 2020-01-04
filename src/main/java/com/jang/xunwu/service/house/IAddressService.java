package com.jang.xunwu.service.house;

import com.jang.xunwu.entity.SupportAddress;
import com.jang.xunwu.service.ServiceMultiResult;
import com.jang.xunwu.service.ServiceResult;
import com.jang.xunwu.web.dto.SubwayDTO;
import com.jang.xunwu.web.dto.SubwayStationDTO;
import com.jang.xunwu.web.dto.SupportAddressDTO;

import java.util.List;
import java.util.Map;

/**
 * title IAddressService
 * projectName xunwu
 * desc 地址服务
 *
 * @author Jang
 * @date 2020/1/4 14:02
 */
public interface IAddressService {

    /**
     * 获取所有对应行政级别的信息
     *
     * @return ServiceMultiResult<SupportAddress>
     */
    ServiceMultiResult<SupportAddressDTO> findAllCities();

    /**
     * 根据英文简写获取具体区域的信息
     *
     * @param cityEnName   城市英文简写
     * @param regionEnName 地区英文简写
     * @return Map<SupportAddress.Level, SupportAddressDTO>
     */
    Map<SupportAddress.Level, SupportAddressDTO> findCityAndRegion(String cityEnName, String regionEnName);

    /**
     * 根据城市英文简写获取该城市所有支持的区域信息
     *
     * @param cityName 城市名
     * @return ServiceMultiResult
     */
    ServiceMultiResult findAllRegionsByCityName(String cityName);

    /**
     * 获取该城市所有的地铁线路
     *
     * @param cityEnName 城市名
     * @return List<SubwayDTO>
     */
    List<SubwayDTO> findAllSubwayByCity(String cityEnName);

    /**
     * 获取地铁线路所有的站点
     *
     * @param subwayId 地铁编号
     * @return List<SubwayStationDTO>
     */
    List<SubwayStationDTO> findAllStationBySubway(Long subwayId);

    /**
     * 获取地铁线信息
     *
     * @param subwayId 地铁编号
     * @return ServiceResult<SubwayDTO>
     */
    ServiceResult<SubwayDTO> findSubway(Long subwayId);

    /**
     * 获取地铁站点信息
     *
     * @param stationId 地铁站编号
     * @return ServiceResult
     */
    ServiceResult<SubwayStationDTO> findSubwayStation(Long stationId);

    /**
     * 根据城市英文简写获取城市详细信息
     *
     * @param cityEnName 城市英文简写
     * @return ServiceResult<SupportAddressDTO>
     */
    ServiceResult<SupportAddressDTO> findCity(String cityEnName);

}
