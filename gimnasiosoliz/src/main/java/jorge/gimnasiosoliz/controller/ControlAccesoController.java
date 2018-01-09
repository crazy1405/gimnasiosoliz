package jorge.gimnasiosoliz.controller;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ClienteDAO;
import jorge.gimnasiosoliz.model.Cliente;

@ManagedBean
@ViewScoped
public class ControlAccesoController {
	private String cedulaBusqueda;
	private Cliente cliente;
	
	private Double indiceCorporal = 0.0;
	private String advertenciaPeso;
	@Inject
	private ClienteDAO clienteDAO;
	
	public void init() {
		cliente = new Cliente();
	}
	
	//Valores que aparecen en la vista control de acceso
	public String controlAcceso() {
		System.out.println("Buscando Cliente");
		cliente = clienteDAO.leer(cedulaBusqueda);
		indicePesoCorporal(cliente);
		return null;
	}
	
	//Calcula el indice de peso corporal de la persona cliente
	public void indicePesoCorporal(Cliente cliente) {
		Double calculaPesoIdeal = (cliente.getPeso()/2.2)/Math.pow((cliente.getEstatura()*0.01),2);
		//indiceCorporal en 2 decimales
		indiceCorporal = Math.round(calculaPesoIdeal*100.0)/100.0;
		if(calculaPesoIdeal<18.5) {
			advertenciaPeso = "PESO INSUFICIENTE";
		}
		if(calculaPesoIdeal>18.5) {
			advertenciaPeso = "PESO NORMAL";
		}
		if(calculaPesoIdeal>25.0) {
			advertenciaPeso = "PESO NORMAL GRADO I";
		}
		if(calculaPesoIdeal>30.0) {
			advertenciaPeso = "OBESIDAD TIPO 1 (LEVE)";
		}
		if(calculaPesoIdeal>35.0) {
			advertenciaPeso = "OBESIDAD TIPO 2 (MODERADA)";
		}
		if(calculaPesoIdeal>40.0) {
			advertenciaPeso = "OBESIDAD TIPO 3 (MORBIDA)";
		}
		if(calculaPesoIdeal>50.0) {
			advertenciaPeso = "PELIGRO OBESIDAD EXTREMA";
		}
	}
	
	
	public String getCedulaBusqueda() {
		return cedulaBusqueda;
	}

	public void setCedulaBusqueda(String cedulaBusqueda) {
		this.cedulaBusqueda = cedulaBusqueda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getIndiceCorporal() {
		return indiceCorporal;
	}

	public void setIndiceCorporal(Double indiceCorporal) {
		this.indiceCorporal = indiceCorporal;
	}

	public String getAdvertenciaPeso() {
		return advertenciaPeso;
	}

	public void setAdvertenciaPeso(String advertenciaPeso) {
		this.advertenciaPeso = advertenciaPeso;
	}

	
	
	
	
	
}
