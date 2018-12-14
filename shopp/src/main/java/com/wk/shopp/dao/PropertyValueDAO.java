package com.wk.shopp.dao;


import com.wk.shopp.pojo.Product;
import com.wk.shopp.pojo.Property;
import com.wk.shopp.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer> {

    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);

}