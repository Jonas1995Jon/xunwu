package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title HouseDetail
 * projectName xunwu
 * desc 房源详情
 *
 * @author Jang
 * @date 2020/1/4 17:55
 */
@Entity
@Table(name = "house_detail")
@Data
public class HouseDetail {

    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *对应house的id
     */
    @Column(name = "house_id")
    private Long houseId;

    /**
     *详细描述
     */
    private String description;

    /**
     *户型介绍
     */
    @Column(name = "layout_desc")
    private String layoutDesc;

    /**
     *交通出行
     */
    private String traffic;

    /**
     *周边配套
     */
    @Column(name = "round_service")
    private String roundService;

    /**
     *租赁方式
     */
    @Column(name = "rent_way")
    private int rentWay;

    /**
     *详细地址
     */
    @Column(name = "address")
    private String detailAddress;

    /**
     *附近地铁线id
     */
    @Column(name = "subway_line_id")
    private Long subwayLineId;

    /**
     *地铁站id
     */
    @Column(name = "subway_station_id")
    private Long subwayStationId;

    /**
     *附近地铁线名称
     */
    @Column(name = "subway_line_name")
    private String subwayLineName;

    /**
     *地铁站名
     */
    @Column(name = "subway_station_name")
    private String subwayStationName;

}
