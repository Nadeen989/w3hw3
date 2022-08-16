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
public class Teacher {

    @Id
    @NotNull
    @Column(columnDefinition = "varchar(10) not null")
    private Integer id;
    @NotEmpty
    @Column(columnDefinition = "varchar(10) not null")
    private String name;
    @NotEmpty
    @Column(columnDefinition = "Integer not null")
    private String salary;




}
