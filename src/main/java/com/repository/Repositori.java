package com.repository;

import com.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Repositori extends JpaRepository<Developer,Integer> {
}
