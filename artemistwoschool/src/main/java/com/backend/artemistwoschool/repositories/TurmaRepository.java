package com.backend.artemistwoschool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.artemistwoschool.models.Turma;

public interface TurmaRepository extends JpaRepository <Turma, Integer> {
    
}
