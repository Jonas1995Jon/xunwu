package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title SubwayStation
 * projectName xunwu
 * desc 地铁站
 *
 * @author Jang
 * @date 2020/1/4 17:21
 */
@Entity
@Table(name = "subway_station")
@Data
public class SubwayStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属地铁线路编号
     */
    @Column(name = "subway_id")
    private Long subwayId;

    /**
     * 站点名称
     */
    private String name;

}
