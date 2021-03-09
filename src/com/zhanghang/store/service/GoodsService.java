package com.zhanghang.store.service;


import com.zhanghang.store.domain.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> queryAll();

    List<Goods> queryByStartEnd(int start, int end);

    Goods querDetail(long goodsid);

}
