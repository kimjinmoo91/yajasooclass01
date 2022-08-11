package com.sparta.boardprac.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Timestamped {
    @CreatedDate
   // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")

    private String createAt;

    @LastModifiedDate
   // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")

    private String modifiedAt;

    @PrePersist
    public void onPrePersist(){
        this.createAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        this.modifiedAt=this.createAt;
    }

    @PreUpdate
    public void onPreUpdate(){
        this.modifiedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }

    public String getCreateAt() {
        return createAt;
    }
    public String getModifiedAt() {
        return modifiedAt;
    }
 }


//    생성일자
//    @CreatedDate
//    private String createdAt;
//
//    마지막 수정일자
//    @LastModifiedDate
//    private String modifiedAt;
//
//    @PrePersist
//    public void onPrePersist(){
//        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
//        this.modifiedAt=this.createdAt;
//    }
//
//    @PreUpdate
//    public void onPreUpdate(){
//        this.modifiedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
//    }