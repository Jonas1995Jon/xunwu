package com.jang.xunwu.web.form;

import lombok.Data;

/**
 * title RentSearch
 * projectName xunwu
 * desc 租赁
 *
 * @author Jang
 * @date 2020/1/5 13:59
 */
@Data
public class RentSearch {

    private String cityEnName;

    private String regionEnName;

    private String priceBlock;

    private String areaBlock;

    private int room;

    private int direction;

    private String keywords;

    private int rentWay = -1;

    private String orderBy = "lastUpdateTime";

    private String orderDirection = "desc";

    private int start = 0;

    private int size = 5;

    public int getSize() {
        if (this.size < 1) {
            return 5;
        } else if (this.size > 100) {
            return 100;
        } else {
            return this.size;
        }
    }

    public int getRentWay() {
        if (rentWay > -2 && rentWay < 2) {
            return rentWay;
        } else {
            return -1;
        }
    }

}
