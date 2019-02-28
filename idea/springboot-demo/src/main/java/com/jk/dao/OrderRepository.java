package com.jk.dao;

import com.jk.entity.OrderPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface OrderRepository extends JpaRepository<OrderPojo,Long>{

   // OrderPojo   findOrderPojoById(Long id);
    @Transactional
     void deleteById(Long id);
}
