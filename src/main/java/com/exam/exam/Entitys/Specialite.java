package com.exam.exam.Entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specialite {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer CodeSpecialite;
    private String nomSpecialite;
    public Specialite(String nomSpecialite){
        this.nomSpecialite=nomSpecialite;
    }
    @OneToMany
    List<OrffreEmploi> orffreEmploi;
}
