package com.servis;

import com.entity.Developer;

import java.util.List;

public interface ServiseDeveloper {

    List<Developer> findall();

    Developer findById(Integer id);

    Developer save(Developer developer);

    Developer update(Developer developer);

    void deleteById(Integer id);

}
