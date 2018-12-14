package com.wk.shopp.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.wk.shopp.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
