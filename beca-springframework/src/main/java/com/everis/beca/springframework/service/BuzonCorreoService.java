package com.everis.beca.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.springframework.model.Tarea;

@Service
public class BuzonCorreoService {

	@Autowired
	TareasService tareasService;
	
	public Tarea newEmail(String asunto, String cuerpo, String emailFrom){
		return tareasService.addTarea(asunto, cuerpo, emailFrom);
	}
	
	private String buscarUsuario(String email){
		//Buscar username para el email indicado
		return email;
	}
}
