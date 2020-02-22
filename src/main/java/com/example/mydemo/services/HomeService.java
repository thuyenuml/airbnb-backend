package com.example.mydemo.services;

import com.example.mydemo.model.Home;
import com.example.mydemo.model.Home_Form;

import java.util.List;

public interface HomeService {
    Home findHomeById(Long id);

    void saveHome(Home home);

    List<Home> getAllHome();
    void setHomeProperties(Home home, Home_Form homeForm);
}
