package com.wk.shopp.dao;


import com.wk.shopp.pojo.Product;
import com.wk.shopp.pojo.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewDAO extends JpaRepository<Review,Integer> {

    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);

}