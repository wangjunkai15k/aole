package com.jk.service;

import com.jk.entity.OrderItem;

import java.util.List;

public interface OrderItemService {

    /**
     * 查询
     * @return
     */
    public List<OrderItem> findAll();

    /**
     * 添加
     * @param order
     */
    public void  save(OrderItem orderItem);

    /**
     * 修改第一步
     * @param id
     * @return
     */
    public  OrderItem  findOrderItemById(long id);

    /**
     * 删除
     * @param id
     */
    public   void     deleteById(Long id);

    /**
     * 修改第二步
     * */
    public  void  update(OrderItem orderItem);
}
