package com.jk.service;

import com.jk.entity.OrderPojo;

import java.util.List;

public interface OrderService {
    /**
     * 查询
     * @return
     */
    public List<OrderPojo> findAll();

    /**
     * 添加
     * @param order
     */
    public void  save(OrderPojo order);

    /**
     * 修改第一步
     * @param id
     * @return
     */
    public  OrderPojo  findOrderPojoById(long id);

    /**
     * 删除
     * @param id
     */
    public   void     deleteById(Long id);

    /**
     * 修改第二步
     * */
    public  void  update(OrderPojo order);
}
