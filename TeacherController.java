package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/Api/v1/user")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @GetMapping("/techer")
    public ResponseEntity<List> getTeachers(){
        List<Teacher> teachers=teacherService.getTeachers();
        return ResponseEntity.status(201).body(teachers);
    }
    @PostMapping("/techer")
    public ResponseEntity<Api> addTeachers(@RequestBody @Valid Teacher teacher){
        teacherService.addTeacher(teacher);
        return ResponseEntity.status(201).body(new Api("new Teacher!"));


    }
    @PutMapping("/techer{id}")
    public ResponseEntity<Api> updateTeacher(@RequestBody @Valid Teacher teacher,@PathVariable Integer id){
        teacherService.updateTeacher(teacher,id);
        return ResponseEntity.status(201).body(new Api("Teacher update!"));

    }

    @DeleteMapping("/techer")
    public ResponseEntity<Api> deleteTeacher(@PathVariable Integer id){
        teacherService.deleteTeacher(id);
        return ResponseEntity.status(201).body(new Api("Teacher delete!"));

    }

}
