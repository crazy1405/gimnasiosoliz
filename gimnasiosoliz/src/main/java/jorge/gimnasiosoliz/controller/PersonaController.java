package jorge.gimnasiosoliz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ClienteDAO;
import jorge.gimnasiosoliz.model.Cliente;
import jorge.gimnasiosoliz.model.Telefono;
import jorge.gimnasiosoliz.util.Bean;
import jorge.gimnasiosoliz.util.ValidarCedula;

@ManagedBean
@ViewScoped
public class PersonaController 
{
	private Cliente cliente;
	private List<Cliente> clientes;
	private ValidarCedula validarCedula;
	private String cedula;
	
	@Inject
	private ClienteDAO clienteDAO;
	
	@Inject
	private FacesContext facesContext;
	
	@PostConstruct
	public void init()
	{
		cliente = new Cliente();
		validarCedula = new ValidarCedula();
		cliente.addTelefono(new Telefono());
		loadPersonas();
	}
	
	//Verifica si la cédula es correcta
	public String buscarPersonaCedula() {
		System.out.println("Buscando persona");
		cliente = clienteDAO.leer(cedula);
		clientes = new ArrayList<Cliente>();
		clientes.add(cliente);
		return null;
	}
	
	//guarda una nueva persona o actualiza si ya existe
	public String guardarPersona()
	{
		try
		{
			clienteDAO.guardarPersona(cliente);
			loadPersonas();
		}
		catch (Exception e)
		{
			String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Error al registrar");
            //facesContext es la parte de la vista
            facesContext.addMessage(null, m);
            return null;
		}
		return "controlAcceso.xhtml";
	}
	
	//carga las personas en una tabla.
	private void loadPersonas()
	{
		clientes = clienteDAO.listaClientes();
		
	}
	
	
	public String loadPersonaEditar(){
		System.out.println(Bean.getkeyRecupera());
		cliente = clienteDAO.leer(Bean.getkeyRecupera());
		System.out.println(cliente);
		return "editarSocio.xhtml";
	}
	
	private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }
	
	public String actualizarPersona() {
		System.out.println(Bean.getkeyRecupera());
		cliente = clienteDAO.leer(Bean.getkeyRecupera());
		return "editarSocio.xhtml";
	}
	
	public String addTelefono() {
		System.out.println("Agregando Telefono");
		cliente.addTelefono(new Telefono());
		
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
	
}
