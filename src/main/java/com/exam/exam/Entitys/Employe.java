package com.exam.exam.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

import java.util.List;

import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long CodeEmploye;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;

    @OneToOne
    @NotEmpty
    private Adresse adresse;



    private Integer numTel;
    @Email
    private String email;
    @ManyToMany
    private List<OrffreEmploi>  orffreEmploi;

}
