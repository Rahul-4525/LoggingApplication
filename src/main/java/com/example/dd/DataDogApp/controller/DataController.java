package com.example.dd.DataDogApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DataController {
   Logger logger = LoggerFactory.getLogger(DataController.class);
    @GetMapping("/getData")
    public ResponseEntity<String> getData()
    {
        logger.info("path is /getData");
        logger.info("sending data to the client");
        return ResponseEntity.ok("Data Sent");
    }
}
