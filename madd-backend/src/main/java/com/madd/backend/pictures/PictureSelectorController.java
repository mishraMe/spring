package com.madd.backend.pictures;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/madd/v1/pictures")
public class PictureSelectorController {

    @GetMapping(value = "/add")
    public ResponseEntity<String> addPictures(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
