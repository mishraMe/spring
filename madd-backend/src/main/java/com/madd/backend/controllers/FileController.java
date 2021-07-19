package com.madd.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/madd/v1/files")
public class FileController {

    @Autowired
    ResourceLoader resourceLoader;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFiles(@RequestParam("path") String path) throws IOException {

        return new ResponseEntity<>(path, HttpStatus.OK);
    }
}
