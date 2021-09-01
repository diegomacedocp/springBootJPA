package com.diego.springbootJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import com.diego.springbootJPA.model.Convidado;
import com.diego.springbootJPA.service.ConvidadoService;

@Configuration
public class SpringbootJpaRunner implements ApplicationRunner {

	@Autowired
	private ConvidadoService condidadoService;
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		condidadoService.saveConvidado(new Convidado(0,"Diego Macedo","diegomacedo_cp@hotmail.com","86 99458-9285"));
		
	}
}
