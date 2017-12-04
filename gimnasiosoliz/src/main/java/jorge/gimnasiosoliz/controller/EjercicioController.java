package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.EjercicioDAO;
import jorge.gimnasiosoliz.model.Ejercicio;
import jorge.gimnasiosoliz.model.PlanEjercicio;

@ManagedBean
@SessionScoped
public class EjercicioController 
{
	private Ejercicio ejercicio;
	@Inject
	private EjercicioDAO ejercicioDAO;
	
	@PostConstruct
	public void init()
	{
		ejercicio = new Ejercicio();
		ejercicio.addPlanEjercicio(new PlanEjercicio());
	}
	
	public String addPlanEjercicio() {
		System.out.println("Agregando plan ejercicio");
		ejercicio.addPlanEjercicio(new PlanEjercicio());
		
		return null;
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
