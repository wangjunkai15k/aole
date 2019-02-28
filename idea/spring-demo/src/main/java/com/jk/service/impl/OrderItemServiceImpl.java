package com.jk.service.impl;

import com.jk.dao.OrderItemRepository;
import com.jk.entity.OrderItem;
import com.jk.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl  implements OrderItemService {

    @Autowired
    private OrderItemRepository  orderItemRepository;
    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public void save(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem findOrderItemById(long id) {
        return orderItemRepository.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        orderItemRepository.deleteById(id);
    }

    @Override
    public void update(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }
}
