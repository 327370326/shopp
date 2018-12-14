package com.wk.shopp.dao;

import com.wk.shopp.pojo.Order;
import com.wk.shopp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Integer> {
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}