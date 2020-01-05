package com.jang.xunwu.base;

/**
 * title HouseStatus
 * projectName xunwu
 * desc 房源状态
 *
 * @author Jang
 * @date 2020/1/5 17:27
 */
public enum HouseStatus {

    /**
     * 未审核
     */
    NOT_AUDITED(0),

    /**
     * 审核通过
     */
    PASSES(1),

    /**
     * 已出租
     */
    RENTED(2),

    /**
     * 逻辑删除
     */
    DELETED(3);

    private int value;

    HouseStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
