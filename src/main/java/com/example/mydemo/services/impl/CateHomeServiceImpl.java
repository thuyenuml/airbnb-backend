package com.example.mydemo.services.impl;

import com.example.mydemo.model.CategoryHome;
import com.example.mydemo.repository.CateHomeRepository;
import com.example.mydemo.services.CateHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateHomeServiceImpl implements CateHomeService {
    @Autowired
    CateHomeRepository cateHomeRepository;


    @Override
    public List<CategoryHome> getAllCateHomes() {
        return cateHomeRepository.findAll();
    }

    @Override
    public void addNewCateHome(CategoryHome categoryHome) {
        cateHomeRepository.save(categoryHome);
    }
}
