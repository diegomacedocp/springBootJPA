package com.diego.springbootJPA.service;

import java.util.List;

import com.diego.springbootJPA.model.Convidado;

public interface ConvidadoService {
	
	Convidado saveConvidado(Convidado convidado);
	
	List<Convidado>getConvidados();
	
	Convidado getConvidado(String nome);

}
