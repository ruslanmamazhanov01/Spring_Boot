package com.controller;

import com.entity.Developer;
import com.servis.ServiseDeveloper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControllerDeveloper {


    private final ServiseDeveloper serviseDeveloper;

    public ControllerDeveloper(ServiseDeveloper serviseDeveloper) {
        this.serviseDeveloper = serviseDeveloper;
    }

    @GetMapping
    public ResponseEntity<List<Developer>> fidnAll() {
        try {
            return new ResponseEntity<>(serviseDeveloper.findall(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{employeeID}")

    public ResponseEntity<Developer> findById(@PathVariable("employeeID") Integer id) {
        try {
            return new ResponseEntity<>(serviseDeveloper.findById(id), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Developer> save(@RequestBody Developer de) {
        try {
            return new ResponseEntity<>(serviseDeveloper.save(de), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<Developer> update(@RequestBody Developer de) {
        try {
            return new ResponseEntity<>(serviseDeveloper.update(de), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
        @DeleteMapping
        public ResponseEntity<Developer> delete (@PathVariable Integer id){
            try {
                serviseDeveloper.deleteById(id);
                return new ResponseEntity<>( HttpStatus.OK);

            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }

    }
