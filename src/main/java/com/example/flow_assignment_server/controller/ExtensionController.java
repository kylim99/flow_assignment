package com.example.flow_assignment_server.controller;




import com.example.flow_assignment_server.service.ExtensionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExtensionController {

    @Autowired
    ExtensionServiceImpl extensionService;

    @GetMapping(value = "/extension-list")
    public ResponseEntity getExtensions(){
        return extensionService.getExtensionList();
    }

    @DeleteMapping(value = "/extension-delete/{extension}")
    public ResponseEntity deleteExtension(@PathVariable String extension){
        return extensionService.delete(extension);
    }

    @PostMapping(value = "/extension-update/{extension}")
    public ResponseEntity updateExtension(@PathVariable String extension){
        return extensionService.update(extension);
    }

}
