package com.mohanned.demo.controller;

import com.mohanned.demo.model.Matier;
import com.mohanned.demo.service.MatierService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/matiers")
public class matierController {
    private final MatierService service;

    public matierController(
            @Qualifier("dbm") MatierService service) {
        this.service = service;
    }

    @PostMapping
    public Matier save(@RequestBody Matier m){

        return service.save(m);
    }

    @GetMapping
    public List<Matier> findAllMatier(){

        return service.findAllMatier();
    }

    @PutMapping
    public  Matier updateMatier(@RequestBody Matier m){

        return service.update(m);
    }

    @DeleteMapping("/{id}")
    public void deleteMatier(@PathVariable("id") Integer id){
        service.delete(id);
    }
}
