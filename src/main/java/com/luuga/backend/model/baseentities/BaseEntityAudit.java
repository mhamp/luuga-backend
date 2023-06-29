package com.luuga.backend.model.baseentities;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import java.time.LocalDateTime;
@Embeddable
@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntityAudit {
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedBy
    private String modifiedBy;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
