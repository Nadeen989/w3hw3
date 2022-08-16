package com.example.school;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final SchoolRepository schoolRepository;

    public List<Student> getStudents() {
        return schoolRepository.findAll();
    }

    public void addStudent(Student student) {
        schoolRepository.save(student);
    }


    public void updateStudent(Student student, Integer id) {
        Student oldstudent=schoolRepository.getById(id);
        oldstudent.setId(student.getId());
        oldstudent.setName(student.getName());
        oldstudent.setAge(student.getAge());
        oldstudent.setMajor(student.getMajor());
        schoolRepository.save(oldstudent);
    }

    public void deleteStudent(Integer id) {
        Student myStudent=schoolRepository.getById(id);
        schoolRepository.delete(myStudent);


        }



}
