package com.jang.xunwu.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * title HouseDTO
 * projectName xunwu
 * desc 房源数据传输对象
 *
 * @author Jang
 * @date 2020/1/5 13:44
 */
@Data
public class HouseDTO implements Serializable {

    private static final long serialVersionUID = 8918735582286008182L;
    private Long id;

    private String title;

    private Integer price;

    private Integer area;

    private Integer direction;

    private Integer room;

    private Integer parlour;

    private Integer bathroom;

    private Integer floor;

    private Long adminId;

    private String district;

    private Integer totalFloor;

    private Integer watchTimes;

    private Integer buildYear;

    private Integer status;

    private Date createTime;

    private Date lastUpdateTime;

    private String cityEnName;

    private String regionEnName;

    private String street;

    private String cover;

    private Integer distanceToSubway;

    private HouseDetailDTO houseDetail;

    private List<String> tags;

    private List<HousePictureDTO> pictures;

    private Integer subscribeStatus;

    public List<String> getTags() {
        if (this.tags == null) {
            tags = new ArrayList<>();
        }
        return tags;
    }

}
