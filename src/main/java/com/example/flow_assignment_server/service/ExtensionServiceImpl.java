package com.example.flow_assignment_server.service;

import com.example.flow_assignment_server.entity.ExtensionEntity;
import com.example.flow_assignment_server.repository.ExtensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExtensionServiceImpl implements ExtensionService{

    @Autowired
    ExtensionRepository extensionRepository;

    @Override
    public ResponseEntity getExtensionList() {
        List<ExtensionEntity> extensionEntityList = extensionRepository.findAll();


        if(extensionEntityList.isEmpty()){
            return ResponseEntity.notFound().build();
        }


        return ResponseEntity.ok(extensionEntityList);
    }
}
