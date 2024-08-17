package com.example.flow_assignment_server.service;

import com.example.flow_assignment_server.entity.ExtensionEntity;
import com.example.flow_assignment_server.repository.ExtensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class ExtensionServiceImpl implements ExtensionService{

    @Autowired
    ExtensionRepository extensionRepository;

    @Override
    public ResponseEntity getExtensionList() throws RuntimeException {
        List<ExtensionEntity> extensionEntityList = extensionRepository.findAll();

        if(extensionEntityList.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(extensionEntityList);
    }

    @Transactional
    @Override
    public ResponseEntity delete(String extension) throws IllegalArgumentException{
        Optional<ExtensionEntity> selectEntity = extensionRepository.findById(extension);

        if(selectEntity.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        extensionRepository.deleteById(extension);
        return ResponseEntity.ok().build();
    }


    @Transactional
    @Override
    public ResponseEntity update(String extension) throws IllegalArgumentException{
        Optional<ExtensionEntity> selectEntity = extensionRepository.findById(extension);

        if(selectEntity.isEmpty()){
            extensionRepository.save(ExtensionEntity.builder()
                            .extensionName(extension)
                            .build());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
