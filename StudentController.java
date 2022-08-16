package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<List> getStudents(){
        List<Student> students=studentService.getStudents();
        return ResponseEntity.status(201).body(students);
    }
    @PostMapping("/student")
    public ResponseEntity<Api> addStudents(@RequestBody @Valid Student student){
        studentService.addStudent(student);
        return ResponseEntity.status(201).body(new Api("new student!"));


    }
    @PutMapping("/student{id}")
    public ResponseEntity<Api> updateStudent(@RequestBody @Valid Student student,@PathVariable Integer id){
        studentService.updateStudent(student,id);
        return ResponseEntity.status(201).body(new Api("student update!"));

    }
    @DeleteMapping(("/student"))
    public ResponseEntity<Api> deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return ResponseEntity.status(201).body(new Api("student delete!"));


    }



}

