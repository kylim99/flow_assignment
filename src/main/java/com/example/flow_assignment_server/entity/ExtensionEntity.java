package com.example.flow_assignment_server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "extension")
public class ExtensionEntity {

    @Id
    private long extensionId;


    private String extensionName;
    private boolean isChecked;
    private Date createdAt;
    private Date updatedAt;



    @Override
    public String toString() {
        return "ExtensionEntity{" +
                "extensionId=" + extensionId +
                ", extensionName='" + extensionName + '\'' +
                ", isChecked=" + isChecked +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
