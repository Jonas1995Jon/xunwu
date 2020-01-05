package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * title House
 * projectName xunwu
 * desc 房源信息
 *
 * @author Jang
 * @date 2020/1/4 17:44
 */
@Entity
@Table(name = "house")
@Data
public class House {

    /**
     * house唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 所属管理员id
     */
    @Column(name = "admin_id")
    private Long adminId;

    /**
     * 价格
     */
    private int price;

    /**
     * 面积
     */
    private int area;

    /**
     * 卧室数量
     */
    private int room;

    /**
     * 客厅数量
     */
    private int parlour;

    /**
     * 浴室
     */
    private int bathroom;

    /**
     * 楼层
     */
    private int floor;

    /**
     * 总楼层
     */
    @Column(name = "total_floor")
    private int totalFloor;

    /**
     * 被看次数
     */
    @Column(name = "watch_times")
    private int watchTimes;

    /**
     * 建立年限
     */
    @Column(name = "build_year")
    private int buildYear;

    /**
     * 房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
     */
    private int status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最近数据更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 城市标记缩写 如 北京bj
     */
    @Column(name = "city_en_name")
    private String cityEnName;

    /**
     * 地区英文简写 如昌平区 cpq
     */
    @Column(name = "region_en_name")
    private String regionEnName;

    /**
     * 街道
     */
    private String street;

    /**
     * 所在小区
     */
    private String district;

    /**
     * 房屋朝向
     */
    private int direction;

    /**
     * 封面
     */
    private String cover;

    /**
     * 距地铁距离 默认-1 附近无地铁
     */
    @Column(name = "distance_to_subway")
    private int distanceToSubway;

}
