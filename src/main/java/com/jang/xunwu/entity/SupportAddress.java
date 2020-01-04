package com.jang.xunwu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * title SupportAddress
 * projectName xunwu
 * desc 地址
 *
 * @author Jang
 * @date 2020/1/4 13:36
 */
@Entity
@Table(name = "support_address")
@Data
public class SupportAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 上一级行政单位名
     */
    @Column(name = "belong_to")
    private String belongTo;

    /**
     * 行政单位名英文缩写
     */
    @Column(name = "en_name")
    private String enName;

    /**
     * 行政单位中文名
     */
    @Column(name = "cn_name")
    private String cnName;

    /**
     * 行政级别 市-city 地区-region
     */
    private String level;

    /**
     * 百度地图经度
     */
    @Column(name = "baidu_map_lng")
    private double baiduMapLng;

    /**
     * 百度地图纬度
     */
    @Column(name = "baidu_map_lat")
    private double baiduMapLat;

    /**
     * 行政级别定义
     */
    public enum Level {
        /**
         * 市
         */
        CITY("city"),

        /**
         * 区域
         */
        REGION("region");

        /**
         * 值
         */
        private String value;

        Level(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static Level of(String value) {
            for (Level level : Level.values()) {
                if (level.getValue().equals(value)) {
                    return level;
                }
            }
            throw  new IllegalArgumentException();
        }
    }

}
