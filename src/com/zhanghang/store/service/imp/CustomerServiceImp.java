package com.zhanghang.store.service.imp;

import com.zhanghang.store.dao.CustomerDao;
import com.zhanghang.store.dao.imp.CustomerDaoImpJdbc;
import com.zhanghang.store.domain.Customer;
import com.zhanghang.store.service.CustomerService;
import com.zhanghang.store.service.ServiceException;

public class CustomerServiceImp implements CustomerService {

    CustomerDao customerDao = new CustomerDaoImpJdbc();
    @Override
    public boolean login(Customer customer) {
        Customer dbCustomer = customerDao.findByPk(customer.getId());

        if(dbCustomer != null && dbCustomer.getPassword().equals(customer.getPassword())){
            //登陆成功
            customer.setPhone(dbCustomer.getPhone());
            customer.setAddress(dbCustomer.getAddress());
            customer.setName(dbCustomer.getName());
            customer.setBirthday(dbCustomer.getBirthday());
            return true;
        }
        return false;
    }

    @Override
    public void register(Customer customer) throws ServiceException {
        Customer dbCustomer = customerDao.findByPk(customer.getId());
        if(dbCustomer != null){
            throw new ServiceException("客户ID" + customer.getId() + "已经存在！");
        }
        //注册开始
        customerDao.create(customer);
    }
}
