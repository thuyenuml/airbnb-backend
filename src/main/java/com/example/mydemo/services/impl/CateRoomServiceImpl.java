package com.example.mydemo.services.impl;

import com.example.mydemo.model.CategoryRoom;
import com.example.mydemo.repository.CateRoomRepository;
import com.example.mydemo.services.CateRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateRoomServiceImpl implements CateRoomService {
    @Autowired
    private CateRoomRepository cateRoomRepository;

    @Override
    public List<CategoryRoom> getAllCateRoom() {
        return cateRoomRepository.findAll();
    }

    @Override
    public void saveCateRoomDB(CategoryRoom categoryRoomRequest) {
        cateRoomRepository.save(categoryRoomRequest);
    }

    @Override
    public CategoryRoom getCateRoomById(Long id) {
        return cateRoomRepository.findById(id).orElse(null);
    }
}
