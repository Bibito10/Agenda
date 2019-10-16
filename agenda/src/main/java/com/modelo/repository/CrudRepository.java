package com.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.model.Aluno;

public interface CrudRepository extends org.springframework.data.repository.CrudRepository<Aluno, Long> {

}
