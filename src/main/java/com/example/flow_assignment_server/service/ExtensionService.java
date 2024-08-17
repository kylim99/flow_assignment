package com.example.flow_assignment_server.service;

import org.springframework.http.ResponseEntity;

public interface ExtensionService {
    ResponseEntity getExtensionList();
    ResponseEntity delete(String extension);
    ResponseEntity update(String extension);
}
