package com.example.mydemo.controller;

import com.example.mydemo.message.response.ResponseMessage;
import com.example.mydemo.model.Home;
import com.example.mydemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @PostMapping("/home/upload")//update picture home
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file, @RequestParam("id") Long id) throws IOException {
        Home home = homeService.findHomeById(id);
        if(!file.isEmpty()){
            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename().replace(" ", "");
            Path pathFile = Paths.get("uploads").resolve(fileName).toAbsolutePath();
            Files.copy(file.getInputStream(), pathFile);

            String nameImagePrevious = home.getImage();
            if(nameImagePrevious != null && nameImagePrevious.length() > 0){
                Path pathImagePrevious = Paths.get("uploads").resolve(nameImagePrevious).toAbsolutePath();
                File fileImagePrevious = pathImagePrevious.toFile();
                if(fileImagePrevious.exists() || fileImagePrevious.canRead()){
                    fileImagePrevious.delete();
                }
            }

            home.setImage(fileName);
            homeService.saveHome(home);

        }

        return new ResponseEntity<>(new ResponseMessage("You have successfully uploaded the image"),HttpStatus.CREATED);
    }

}
