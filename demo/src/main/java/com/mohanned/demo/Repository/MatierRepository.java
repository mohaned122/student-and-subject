package com.mohanned.demo.Repository;

import com.mohanned.demo.model.Matier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatierRepository extends JpaRepository<Matier, Integer> {
    void deleteById(Integer id);
}
