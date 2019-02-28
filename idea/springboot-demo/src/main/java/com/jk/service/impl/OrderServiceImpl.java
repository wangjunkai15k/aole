package com.jk.service.impl;

import com.jk.dao.OrderRepository;
import com.jk.entity.OrderPojo;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderPojo> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void save(OrderPojo order) {
        orderRepository.save(order);
    }

    @Override
    public OrderPojo findOrderPojoById(long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void update(OrderPojo order) {
        orderRepository.save(order);
    }
}
