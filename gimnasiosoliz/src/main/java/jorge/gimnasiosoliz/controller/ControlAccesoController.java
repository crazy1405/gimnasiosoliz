package jorge.gimnasiosoliz.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ControlAccesoController {
	private String cedulaBusqueda;

	public String getCedulaBusqueda() {
		return cedulaBusqueda;
	}

	public void setCedulaBusqueda(String cedulaBusqueda) {
		this.cedulaBusqueda = cedulaBusqueda;
	}
	
	
}
