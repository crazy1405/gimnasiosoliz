package jorge.gimnasiosoliz.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.EjercicioDAO;
import jorge.gimnasiosoliz.model.Ejercicio;
import jorge.gimnasiosoliz.model.PlanEjercicio;

@ManagedBean
@SessionScoped
public class EjercicioController 
{
	private Ejercicio ejercicio;
	private List<Ejercicio> ejercicios;
	@Inject
	private EjercicioDAO ejercicioDAO;
	@Inject
	private FacesContext facesContext;
	
	@PostConstruct
	public void init()
	{
		ejercicio = new Ejercicio();
		ejercicio.addPlanEjercicio(new PlanEjercicio());
		loadEjercicios();
	}
	
	public String addPlanEjercicio() {
		System.out.println("Agregando plan ejercicio");
		ejercicio.addPlanEjercicio(new PlanEjercicio());
		
		return null;
	}
	
	public void loadEjercicios() {
		ejercicios = ejercicioDAO.listaEjercicios();
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
	    FacesContext facesContext1 = FacesContext.getCurrentInstance();
        facesContext1.addMessage(null, new FacesMessage("Guardado Exitoso"));
		loadEjercicios();
	}

	public List<Ejercicio> getEjercicios() {
		return ejercicios;
	}

	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

}
