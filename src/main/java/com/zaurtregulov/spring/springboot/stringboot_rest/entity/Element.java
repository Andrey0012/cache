package com.zaurtregulov.spring.springboot.stringboot_rest.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "client")
@Data
@NoArgsConstructor
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column (name = "surname")
    private int surname;




}
