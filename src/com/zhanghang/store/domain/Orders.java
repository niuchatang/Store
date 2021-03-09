package com.zhanghang.store.domain;

import java.util.Date;

public class Orders {
    /* 订单id */
    private String id;
    /* 订单时间 */
    private Date orderDate;
    /* 订单状态 1 代表待确认 2代表已确认 */
    private int status = 1;
    /* 订单金额 */
    private double total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
