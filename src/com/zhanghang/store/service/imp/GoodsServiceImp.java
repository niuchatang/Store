package com.zhanghang.store.service.imp;


import com.zhanghang.store.dao.GoodsDao;
import com.zhanghang.store.dao.imp.GoodsDaoImpJdbc;
import com.zhanghang.store.domain.Goods;
import com.zhanghang.store.service.GoodsService;

import java.util.List;

public class GoodsServiceImp implements GoodsService {

    GoodsDao goodsDao = new GoodsDaoImpJdbc();

    @Override
    public List<Goods> queryAll() {
        return goodsDao.findAll();
    }

    @Override
    public List<Goods> queryByStartEnd(int start, int end) {
        return goodsDao.findStartEnd(start, end);
    }

    @Override
    public Goods querDetail(long goodsid) {
        return goodsDao.findByPk(goodsid);
    }
}
