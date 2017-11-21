package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.DeudaDAO;
import jorge.gimnasiosoliz.model.Deuda;

@ManagedBean
public class DeudaController 
{
	private Deuda deuda;
	
	@Inject
	private DeudaDAO deudaDAO;
	
	@PostConstruct
	public void init()
	{
		deuda = new Deuda();
	}

	public Deuda getDeuda() {
		return deuda;
	}

	public void setDeuda(Deuda deuda) {
		this.deuda = deuda;
	}
	
	public void guardarDeuda()
	{
		System.out.println(deuda);
		//Invoca el DAO
		deudaDAO.insertar(deuda);
	}
	
	
}
