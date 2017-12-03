package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ClienteDAO;
import jorge.gimnasiosoliz.model.Cliente;

@ManagedBean
@SessionScoped
public class PersonaController 
{
	private Cliente cliente;
	
	@Inject
	private ClienteDAO clienteDAO;
	
	@PostConstruct
	public void init()
	{
		cliente = new Cliente();
	}
	
	public String guardarPersona()
	{
		System.out.println("Guardando persona");
		System.out.println(cliente);
		//clienteDAO.insertar(cliente);
		
		return null;
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}



	



	
}
