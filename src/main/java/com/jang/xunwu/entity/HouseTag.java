package com.jang.xunwu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * title HouseTag
 * projectName xunwu
 * desc 房屋标签映射关系
 *
 * @author Jang
 * @date 2020/1/4 18:08
 */
@Entity
@Table(name = "house_tag")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseTag {

    /**
     * 标签id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 房屋id
     */
    @Column(name = "house_id")
    private Long houseId;

    /**
     * 标签名称
     */
    private String name;

    public HouseTag(Long houseId, String name) {
        this.houseId = houseId;
        this.name = name;
    }
}
