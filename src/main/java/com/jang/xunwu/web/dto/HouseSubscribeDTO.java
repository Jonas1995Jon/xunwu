package com.jang.xunwu.web.dto;

import lombok.Data;

import java.util.Date;

/**
 * title HouseSubscribeDTO
 * projectName xunwu
 * desc 房源预约数据传输对象
 *
 * @author Jang
 * @date 2020/1/5 13:49
 */
@Data
public class HouseSubscribeDTO {

    private Long id;

    private Long houseId;

    private Long userId;

    private Long adminId;

    private Integer status;

    private Date createTime;

    private Date lastUpdateTime;

    private Date orderTime;

    private String telephone;

    private String desc;

}
