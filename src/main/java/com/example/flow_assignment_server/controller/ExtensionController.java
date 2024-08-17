package com.example.flow_assignment_server.controller;



import com.example.flow_assignment_server.entity.ExtensionEntity;
import com.example.flow_assignment_server.service.ExtensionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExtensionController {

    @Autowired
    ExtensionServiceImpl extentionService;

    @GetMapping(value = "/extension-list")
    public ResponseEntity getExtension(){


        return extentionService.getExtensionList();
    }
}
