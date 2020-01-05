package com.jang.xunwu.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * title HousePictureDTO
 * projectName xunwu
 * desc 房屋图片数据传输对象
 *
 * @author Jang
 * @date 2020/1/5 13:46
 */
@Data
public class HousePictureDTO {

    private Long id;

    @JsonProperty(value = "house_id")
    private Long houseId;

    private String path;

    @JsonProperty(value = "cdn_prefix")
    private String cdnPrefix;

    private Integer width;

    private Integer height;

}
