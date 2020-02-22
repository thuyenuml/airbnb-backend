package com.example.mydemo.services;

import com.example.mydemo.model.Home;

public interface HomeService {
    Home findHomeById(Long id);

    void saveHome(Home home);
}
