package com.everis.beca.springframework.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.everis.beca.springframework.model.Tarea;

@Service
public class TareasService {
	
	private List<Tarea> tareas = new ArrayList<Tarea>();
	private long idSequence = 0;
	
	@PostConstruct
	private void initTareas(){
		Tarea t1 = new Tarea(0l,"Tarea 1", "Cuerpo de la tarea 1", new Date(), "sergio.raposo@everis.com");
		Tarea t2 = new Tarea(1l,"Tarea 2", "Cuerpo de la tarea 2", new Date(), "sergio.raposo@everis.com");
		Tarea t3 = new Tarea(2l,"Tarea 3", "Cuerpo de la tarea 3", new Date(), "sergio.raposo@everis.com");
		
		tareas.add(t1);
		tareas.add(t2);
		tareas.add(t3);
		
		idSequence = 3l;
	}
	
	public Tarea addTarea(String title, String text, String username){
		
		Tarea t = new Tarea();
		t.setId(idSequence);
		idSequence++;
		t.setTitle(title);
		t.setText(text);
		t.setUsername(username);
		t.setCreatedDate(new Date());
		t.setState(0);
		tareas.add(t);
		
		return t;
	}
	
	public List<Tarea> getAll(){
		return tareas;
	}
	
	public Tarea getTarea(Long id){
		Tarea result = null;
		for(Tarea t: tareas){
			if(t.getId().equals(id)){
				result = t;
				break;
			}
		}
		return result;
	}
	
	public void deleteTarea(Long id){
		tareas.remove(getTarea(id));
	}
	
	public Tarea closeTarea(Long id){
		Tarea t = getTarea(id);
		t.setState(1);
		return t;
	}

}
