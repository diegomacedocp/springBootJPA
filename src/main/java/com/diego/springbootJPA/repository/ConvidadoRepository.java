package com.diego.springbootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.springbootJPA.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado,Long>{
	
	Convidado findByNome(String nome);
	
}
