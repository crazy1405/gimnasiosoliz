package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ClienteDAO;
import jorge.gimnasiosoliz.model.Cliente;

@ManagedBean
public class ClienteController 
{
	private Cliente cliente;
	@Inject
	private ClienteDAO clienteDAO;
	
	@PostConstruct
	public void init()
	{
		cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void guardarCliente()
	{
		System.out.println(cliente);
		//invoca el DAO
		clienteDAO.insertar(cliente);
	}
	
	
	
}
