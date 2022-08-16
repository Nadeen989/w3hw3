package com.example.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchoolRepository extends JpaRepository< Student,Indexed> {

    Student getById(Integer id);

}
