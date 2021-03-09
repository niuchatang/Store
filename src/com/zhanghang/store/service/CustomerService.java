package com.zhanghang.store.service;

import com.zhanghang.store.domain.Customer;

public interface CustomerService {
    /*
    处理客户端登陆
    登陆成功返回true,登陆失败返回False
    */
    boolean login(Customer customer);

    /*
    * 处理客户注册
    * 注册失败抛出异常
    * */
    void register(Customer customer) throws ServiceException;
}
