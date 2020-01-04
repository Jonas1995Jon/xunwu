package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title Subway
 * projectName xunwu
 * desc 地铁线路
 *
 * @author Jang
 * @date 2020/1/4 17:14
 */
@Entity
@Table(name = "subway")
@Data
public class Subway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线路名
     */
    private String name;

    /**
     * 所属城市英文名简写
     */
    @Column(name = "city_en_name")
    private String cityEnName;

}
