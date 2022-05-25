package com.exam.exam.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer CodeAdresse ;
    private String rue ;
    private String gouvernorat ;
    private Integer CodePostal;


}