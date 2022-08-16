package com.example.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoollRepositoryy extends JpaRepository< Teacher, Indexed>{
    Teacher getById(Integer id);
}