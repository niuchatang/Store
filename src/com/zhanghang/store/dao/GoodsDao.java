package com.zhanghang.store.dao;


import com.zhanghang.store.domain.Goods;

import java.util.List;

public interface GoodsDao {

    Goods findByPk(long pk);

    /*
    * 提供分页查询
    * start 开始索引 索引从0开始
    * end 结束索引 从0开始
    * */
    List<Goods> findAll();
    List<Goods> findStartEnd(int start,int end);


    void create(Goods goods);

    void modify(Goods goods);

    void remove(long pk);
}
