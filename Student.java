package com.example.school;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Student  {

    @Id
    @NotNull(message = "Id can't be null")
    @Column(columnDefinition = "varchar(10) not null")
    private Integer id;
    @NotEmpty(message = "name can't be empty")
    @Column(columnDefinition = "varchar(10) not null")
    private String name;
    @NotEmpty(message = "age can't be empty")
    @Column(columnDefinition = "Integer not null")
    private String age;
    @NotEmpty(message = "major can't be empty")
    @Column(columnDefinition = "varchar(10) check ( major='CS' or major='MATH' or major='ENGINEER' )")
    private String major;


}
