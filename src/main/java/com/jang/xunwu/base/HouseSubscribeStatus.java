package com.jang.xunwu.base;

/**
 * title HouseSubscribeStatus
 * projectName xunwu
 * desc 预约状态码
 *
 * @author Jang
 * @date 2020/1/5 14:12
 */
public enum HouseSubscribeStatus {

    /**
     * 未预约
     */
    NO_SUBSCRIBE(0),

    /**
     * 已加入待看清单
     */
    IN_ORDER_LIST(1),

    /**
     * 已经预约看房时间
     */
    IN_ORDER_TIME(2),

    /**
     * 已完成预约
     */
    FINISH(3);

    private int value;

    HouseSubscribeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static HouseSubscribeStatus of(int value) {
        for (HouseSubscribeStatus status : HouseSubscribeStatus.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        return HouseSubscribeStatus.NO_SUBSCRIBE;
    }

}
