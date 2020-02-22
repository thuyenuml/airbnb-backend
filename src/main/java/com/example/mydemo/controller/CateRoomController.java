package com.example.mydemo.controller;

import com.example.mydemo.message.response.ResponseMessage;
import com.example.mydemo.model.CategoryRoom;
import com.example.mydemo.services.CateRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class CateRoomController {
    @Autowired
    CateRoomService cateRoomService;

    @GetMapping("/cate-rooms")
    public ResponseEntity<?> getCateRoomDB(){
        List<CategoryRoom> categoryRoomList = cateRoomService.getAllCateRoom();
        return new ResponseEntity<List<CategoryRoom>>(categoryRoomList, HttpStatus.OK);
    }

    @PostMapping("/add-cate-room")
    public ResponseEntity<?> registerCateRoom(@RequestBody CategoryRoom categoryRoomRequest){
//        categoryRoomRequest = new CategoryRoom();
        cateRoomService.saveCateRoomDB(categoryRoomRequest);
        return new ResponseEntity<>(new ResponseMessage("registered successfully"), HttpStatus.OK);
    }
    //    @GetMapping("/name-cate-room/{id}")
//    public ResponseEntity<?> getName(@PathVariable Long id){
//        CategoryRoom categoryRoom = cateRoomService.getCateRoomById(id);
//        return new ResponseEntity<String>(categoryRoom.getNameCateRoom(), HttpStatus.OK);
//    }
    @GetMapping("/name-cate-room")
    public ResponseEntity<?> getNameCateRoom(@RequestParam Long id){
        CategoryRoom categoryRoom = cateRoomService.getCateRoomById(id);
        return new ResponseEntity<CategoryRoom>(categoryRoom, HttpStatus.OK);
    }
}
