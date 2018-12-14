package com.wk.shopp.dao;


import com.wk.shopp.pojo.Order;
import com.wk.shopp.pojo.OrderItem;
import com.wk.shopp.pojo.Product;
import com.wk.shopp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}