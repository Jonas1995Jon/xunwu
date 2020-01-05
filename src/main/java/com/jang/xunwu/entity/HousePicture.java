package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title HousePicture
 * projectName xunwu
 * desc 房屋图片信息
 *
 * @author Jang
 * @date 2020/1/4 17:59
 */
@Entity
@Table(name = "house_picture")
@Data
public class HousePicture {

    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *所属房屋id
     */
    @Column(name = "house_id")
    private Long houseId;

    /**
     *文件名
     */
    private String path;

    /**
     *图片路径
     */
    @Column(name = "cdn_prefix")
    private String cdnPrefix;

    /**
     *宽
     */
    private int width;

    /**
     *高
     */
    private int height;

    /**
     *所属房屋位置
     */
    private String location;

}
