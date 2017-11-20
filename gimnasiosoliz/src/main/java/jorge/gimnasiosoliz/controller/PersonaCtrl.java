package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.persistence.Table;

import jorge.gimnasiosoliz.data.PersonaDAO;
import jorge.gimnasiosoliz.model.Persona;

@ManagedBean
public class PersonaCtrl {
	private Persona persona;
	
	@Inject
	private PersonaDAO pdao;
	
	@PostConstruct
	public void init() {
		persona = new Persona();
	}
	
	public void guardar() {
		System.out.println("Lista de personas");
		System.out.println(persona);
		pdao.insertar(persona);
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	

}
