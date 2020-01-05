package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * title HouseSubscribe
 * projectName xunwu
 * desc 预约看房信息表
 *
 * @author Jang
 * @date 2020/1/4 18:02
 */
@Entity
@Table(name = "house_subscribe")
@Data
public class HouseSubscribe {

    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 房源id
     */
    @Column(name = "house_id")
    private Long houseId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 房源发布者id
     */
    @Column(name = "admin_id")
    private Long adminId;

    /**
     * 预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     */
    private int status;

    /**
     * 数据创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 预约时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 用户描述
     * 踩坑 desc为MySQL保留字段 需要加转义
     */
    @Column(name = "`desc`")
    private String desc;

}
