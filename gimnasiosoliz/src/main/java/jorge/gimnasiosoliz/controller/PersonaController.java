package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.PersonaDAO;
import jorge.gimnasiosoliz.model.Persona;

@ManagedBean
public class PersonaController 
{
	private Persona persona;
	
	@Inject
	private PersonaDAO personaDAO;
	
	@PostConstruct
	public void init()
	{
		persona = new Persona();
	}
	
	public Persona getPersona()
	{
		return persona;
	}
	
	
	public void setPersona(Persona persona)
	{
		this.persona=persona;
	}
	
	public void guardarPersona()
	{
		System.out.println(persona);
		//Invoca el DAO
		personaDAO.insertar(persona);
	}
}
