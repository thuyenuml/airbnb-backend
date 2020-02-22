package com.example.mydemo.services.impl;

import com.example.mydemo.model.Home;
import com.example.mydemo.repository.HomeRepository;
import com.example.mydemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public Home findHomeById(Long id) {
        return homeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveHome(Home home) {
        homeRepository.save(home);
    }
}
