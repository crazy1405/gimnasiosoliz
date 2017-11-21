package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.EjercicioDAO;
import jorge.gimnasiosoliz.model.Ejercicio;

@ManagedBean
public class EjercicioController 
{
	private Ejercicio ejercicio;
	
	@Inject
	private EjercicioDAO ejercicioDAO;
	
	@PostConstruct
	public void init()
	{
		ejercicio = new Ejercicio();
	}

	public Ejercicio getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}
	
	public void guardarEjercicio()
	{
		System.out.println(ejercicio);
		//Inyecta el DAO
		ejercicioDAO.insertar(ejercicio);
	}
	
	
	
	
	
}
