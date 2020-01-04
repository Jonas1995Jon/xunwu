package com.jang.xunwu.web.dto;

import lombok.Data;

/**
 * title SubwayStationDTO
 * projectName xunwu
 * desc 地铁站DTO
 *
 * @author Jang
 * @date 2020/1/4 16:47
 */
@Data
public class SubwayStationDTO {

    private Long id;

    private Long subwayId;

    private String name;

}
