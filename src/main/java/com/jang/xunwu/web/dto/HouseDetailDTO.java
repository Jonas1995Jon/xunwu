package com.jang.xunwu.web.dto;

import lombok.Data;

/**
 * title HouseDetailDTO
 * projectName xunwu
 * desc 房源详情数据传输对象
 *
 * @author Jang
 * @date 2020/1/5 13:43
 */
@Data
public class HouseDetailDTO {

    private String description;

    private String layoutDesc;

    private String traffic;

    private String roundService;

    private Integer rentWay;

    private Long adminId;

    private String address;

    private Long subwayLineId;

    private Long subwayStationId;

    private String subwayLineName;

    private String subwayStationName;

}
