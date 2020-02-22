package com.example.mydemo.services.impl;

import com.example.mydemo.model.Home;
import com.example.mydemo.model.Home_Form;
import com.example.mydemo.repository.HomeRepository;
import com.example.mydemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Home> getAllHome() {
        return homeRepository.findAll();
    }

    @Override
    public void setHomeProperties(Home home, Home_Form homeForm){
        home.setName(homeForm.getName());
        home.setPrice(homeForm.getPrice());
        home.setAddress(homeForm.getAddress());
        home.setDescription(homeForm.getDescription());
        home.setNumberBad(homeForm.getNumberBad());
        home.setNumberBath(homeForm.getNumberBath());
        home.setCateHome(homeForm.getCateHome());
        home.setCateRoom(homeForm.getCateRoom());
    }
}
