package com.app.Restaurant.service;

import com.app.Restaurant.POJO.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    ResponseEntity<String> addNewCategory (Map<String,String> requestMap);
    ResponseEntity<List<Category>> getAllCategory (String filterValue);
    ResponseEntity<String> updateCategory (Map<String,String> requestMap);
}
