package com.example.mydemo.controller;

import com.example.mydemo.message.response.ResponseMessage;
import com.example.mydemo.model.CategoryHome;
import com.example.mydemo.services.CateHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class CateHomeController {
    @Autowired
    CateHomeService cateHomeService;

    @GetMapping("/cate-homes")
    public ResponseEntity<?> getCateHomesDB() {
        List<CategoryHome> categoryHomes = cateHomeService.getAllCateHomes();
        return new ResponseEntity<List<CategoryHome>>(categoryHomes, HttpStatus.OK);
    }

    @PostMapping("/add-cate-home")
    public ResponseEntity<?> registerCateHome(@RequestBody CategoryHome categoryHome){
        cateHomeService.addNewCateHome(categoryHome);
        return new ResponseEntity<>(new ResponseMessage("registered successfully"), HttpStatus.OK);
    }
}
