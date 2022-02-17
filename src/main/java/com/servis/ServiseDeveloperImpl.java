package com.servis;

import com.entity.Developer;
import com.repository.Repositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiseDeveloperImpl implements ServiseDeveloper {

    @Autowired
    private final Repositori repositori;

    public ServiseDeveloperImpl(Repositori repositori) {
        this.repositori = repositori;
    }

    @Override
    public List<Developer> findall() {
        return repositori.findAll();
    }

    @Override
    public Developer findById(Integer id) {
        return repositori.getById(id);
    }

    @Override
    public Developer save(Developer developer) {
        return repositori.save(developer);
    }

    @Override
    public Developer update(Developer developer) {
        return repositori.save(developer);
    }

    @Override
    public void deleteById(Integer id) {
        repositori.deleteById(id);
    }
}
