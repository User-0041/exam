package com.exam.exam.Reposetories;

import java.util.List;

import com.exam.exam.Entitys.Employe;
import com.exam.exam.Entitys.OrffreEmploi;
import com.exam.exam.Entitys.Specialite;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrffreEmploiRepository extends JpaRepository<OrffreEmploi,Integer> {
    List<Employe>  findByInitiuleAndSpecialite(String initiule,Specialite specialite);
}
