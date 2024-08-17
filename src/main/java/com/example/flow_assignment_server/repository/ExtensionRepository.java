package com.example.flow_assignment_server.repository;


import com.example.flow_assignment_server.entity.ExtensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface ExtensionRepository extends JpaRepository<ExtensionEntity,String> {
}
