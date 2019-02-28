package com.jk.dao;

import com.jk.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface OrderItemRepository  extends JpaRepository<OrderItem,Long> {

    //OrderItem  findOrderItemById(Long id);
    @Transactional
    void  deleteById(Long id);
}
