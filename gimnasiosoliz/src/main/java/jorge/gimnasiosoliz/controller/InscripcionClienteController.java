package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import jorge.gimnasiosoliz.data.InscripcionClienteDAO;
import jorge.gimnasiosoliz.model.InscripcionCliente;

@ManagedBean
public class InscripcionClienteController 
{

	private InscripcionCliente inscripcion;
	
	private InscripcionClienteDAO inscripcionDAO;
	
	@PostConstruct
	public void init()
	{
		inscripcion = new InscripcionCliente();
	}

	public InscripcionCliente getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(InscripcionCliente inscripcion) {
		this.inscripcion = inscripcion;
	}
	
	
	public void guardarInscripcion()
	{
		System.out.println(inscripcion);
		//InyectarDAO
		inscripcionDAO.insertar(inscripcion);
	}
	
	
	
	
}
