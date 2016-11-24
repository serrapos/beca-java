package com.everis.beca.springframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.springframework.model.Tarea;
import com.everis.beca.springframework.service.BuzonCorreoService;
import com.everis.beca.springframework.service.TareasService;

@RestController
public class TareasController {
	
	@Autowired
	TareasService tareasService;
	
	@Autowired
	BuzonCorreoService buzonCorreoService;
	
	@RequestMapping("/tareas")
    public List<Tarea> getAll() {
        return tareasService.getAll();
    }
	
	@RequestMapping("/addtarea")
	public Tarea addTarea(String title, String text, String username) {
	        return tareasService.addTarea(title, text, username);
	}
	
	@RequestMapping("/tarea")
	public Tarea addTarea(String id) {
	        return tareasService.getTarea(Long.parseLong(id));
	}
	
	@RequestMapping("/closetarea")
	public Tarea closeTarea(String id) {
	        return tareasService.closeTarea(Long.parseLong(id));
	}
	
	@RequestMapping("/nuevoemail")
	public Tarea nuevoEmail(String asunto, String cuerpo, String emailFrom) {
	        return buzonCorreoService.newEmail(asunto, cuerpo, emailFrom);
	}

}
