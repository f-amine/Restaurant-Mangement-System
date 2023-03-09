package com.app.Restaurant.dao;

import com.app.Restaurant.POJO.Product;
import com.app.Restaurant.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();
}
