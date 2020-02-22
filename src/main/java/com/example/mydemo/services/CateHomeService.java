package com.example.mydemo.services;

import com.example.mydemo.model.CategoryHome;

import java.util.List;

public interface CateHomeService {
    List<CategoryHome> getAllCateHomes();

    void addNewCateHome(CategoryHome categoryHome);

    CategoryHome getCateHomeById(Long id);
}
