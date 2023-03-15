/*
*Author : Ankit Ambekar
*Date : 
Created with : IntelliJ IDEA Community Edition
*/
package com.example.image.Repository;

import com.example.image.domain.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface imageRepo extends JpaRepository<ImageModel,Long> {
    Optional<ImageModel> findByName(String name);
}
