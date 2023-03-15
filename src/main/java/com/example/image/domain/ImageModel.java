/*
*Author : Ankit Ambekar
*Date :
Created with : IntelliJ IDEA Community Edition
*/
package com.example.image.domain;

import javax.persistence.*;

import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class ImageModel {
    public ImageModel() {
        super();
    }

    public ImageModel(String name, String type, byte[] picByte) {
        this.name = name;
        this.type = type;
        this.picByte = picByte;
    }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String type;
        //image bytes can have large lengths so we specify a value
        //which is more than the default length for picByte column
        private byte[] picByte;

    }

