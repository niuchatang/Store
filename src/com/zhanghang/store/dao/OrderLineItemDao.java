package com.zhanghang.store.dao;

import com.zhanghang.store.domain.OrderLineItem;

import java.util.List;

public interface OrderLineItemDao {
    OrderLineItem findByPk(long pk);
    List<OrderLineItem> findAll();
    void create(OrderLineItem lineItem);
    void modify(OrderLineItem lineItem);
    void remove(int  pk);
}
