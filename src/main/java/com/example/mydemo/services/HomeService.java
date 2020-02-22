package com.example.mydemo.services;

import com.example.mydemo.model.Home;

import java.util.List;

public interface HomeService {
    Home findHomeById(Long id);

    void saveHome(Home home);

    List<Home> getAllHome();
}
