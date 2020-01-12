package com.jang.xunwu.service.search;

import lombok.Data;

/**
 * title HouseBucketDTO
 * projectName xunwu
 * desc 房源桶
 *
 * @author Jang
 * @date 2020/1/11 18:36
 */
@Data
public class HouseBucketDTO {

    /**
     * 聚合bucket的key
     */
    private String key;

    /**
     * 聚合结果值
     */
    private long count;

}
