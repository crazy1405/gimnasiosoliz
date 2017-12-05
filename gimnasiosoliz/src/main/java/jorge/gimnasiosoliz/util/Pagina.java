package jorge.gimnasiosoliz.util;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pagina {
	
	public void doIrNuevoSocio() throws GimnasioException{
		Redireccionar.redirecciona("nuevoSocio.jsf");		
	}

}
