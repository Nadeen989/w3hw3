package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TeacherService {
    private final SchoollRepositoryy schoollRepositoryy;

    public List<Teacher> getTeachers() {
        return schoollRepositoryy.findAll();
    }

    public void addTeacher(Teacher teacher) {
        schoollRepositoryy.save(teacher);
    }


    public void updateTeacher(Teacher teacher, Integer id) {
        Teacher oldteacher = schoollRepositoryy.getById(id);
        oldteacher.setId(teacher.getId());
        oldteacher.setName(teacher.getName());
        oldteacher.setSalary(teacher.getSalary());
        schoollRepositoryy.save(oldteacher);
    }

    public void deleteTeacher(Integer id) {
        Teacher myTeacher = schoollRepositoryy.getById(id);
        schoollRepositoryy.delete(myTeacher);

    }




}