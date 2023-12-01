package com.mohanned.demo.service;

import com.mohanned.demo.Repository.MatierRepository;
import com.mohanned.demo.model.Matier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dbm")
public class DBMatierService implements MatierService{

    private final MatierRepository repository;

    public DBMatierService(MatierRepository repository) {
        this.repository = repository;
    }

    @Override
    public Matier save(Matier matier) {
        return repository.save(matier);
    }

    @Override
    public List<Matier> findAllMatier() {
        return repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Matier update(Matier matier) {
        return repository.save(matier);
    }
}