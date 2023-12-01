package com.mohanned.demo.service;

import com.mohanned.demo.model.Matier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatierService {
    Matier save(Matier matier);
    List<Matier> findAllMatier();
    void delete(Integer id);
    Matier update(Matier matier);
}
