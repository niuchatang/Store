package com.zhanghang.store.dao;

import com.zhanghang.store.domain.Orders;

import java.util.List;

public interface OrderDao {
    Orders findByPk(String pk);
    List<Orders> findAll();
    void create(Orders orders);
    void modify(Orders orders);
    void remove(String pk);

}
