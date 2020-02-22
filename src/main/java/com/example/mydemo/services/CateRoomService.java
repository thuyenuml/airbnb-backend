package com.example.mydemo.services;

import com.example.mydemo.model.CategoryRoom;

import java.util.List;

public interface CateRoomService {
    List<CategoryRoom> getAllCateRoom();

    void saveCateRoomDB(CategoryRoom categoryRoomRequest);
}
