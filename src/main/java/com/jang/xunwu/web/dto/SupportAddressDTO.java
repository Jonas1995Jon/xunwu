package com.jang.xunwu.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * title SupportAddressDTO
 * projectName xunwu
 * desc 数据传输
 *
 * @author Jang
 * @date 2020/1/4 14:04
 */
@Data
public class SupportAddressDTO {

    private Long id;

    @JsonProperty(value = "belong_to")
    private String belongTo;

    @JsonProperty(value = "en_name")
    private String enName;

    @JsonProperty(value = "cn_name")
    private String cnName;

    private String level;

}
