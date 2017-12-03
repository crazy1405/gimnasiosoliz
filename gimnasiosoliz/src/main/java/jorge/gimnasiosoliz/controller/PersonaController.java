package jorge.gimnasiosoliz.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ClienteDAO;
import jorge.gimnasiosoliz.model.Cliente;
import jorge.gimnasiosoliz.util.ValidarCedula;

@ManagedBean
public class PersonaController 
{
	private Cliente cliente;
	private List<Cliente> clientes;
	private ValidarCedula validarCedula;
	
	@Inject
	private ClienteDAO clienteDAO;
	
	@PostConstruct
	public void init()
	{
		cliente = new Cliente();
		validarCedula = new ValidarCedula();
		loadPersonas();
	}
	
	public String guardarPersona()
	{
		System.out.println("Guardando persona");
		System.out.println(cliente);
		clienteDAO.insertar(cliente);
		
		return null;
	}
	
	private void loadPersonas()
	{
		clientes = clienteDAO.listaClientes();
		
	}
	
	public String actualizarPersona() {
		
		return null;
	}
	
	public String validarCedula(String cedula) {
		validarCedula.validarCedula(cedula);
		
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	

	



	
}
