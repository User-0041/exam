package com.exam.exam.Reposetories;

import java.util.List;
import java.util.Optional;

import com.exam.exam.Entitys.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
Optional<Employe> findById(Long  CodeEmploye);
    
}
