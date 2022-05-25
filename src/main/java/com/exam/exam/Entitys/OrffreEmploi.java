package com.exam.exam.Entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrffreEmploi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer CodeOffre;
private String initiule;
private String Societe;
private String pays;
private Integer NombrePost;

private String Etat;



@ManyToOne
private Specialite  specialite;




@ManyToMany
private List<Employe>  employe;

public OrffreEmploi(String initiule ,Specialite specialite ,String Societe, String pays,Integer NombrePost,String Etat ) {
    this.NombrePost=NombrePost;
    this.Etat=Etat;
    this.pays=pays;
    this.Societe=Societe;
    this.initiule=initiule;
    this.specialite=specialite;
}

    
}
