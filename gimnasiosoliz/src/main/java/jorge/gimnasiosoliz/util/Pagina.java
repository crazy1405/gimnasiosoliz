package jorge.gimnasiosoliz.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
//Para implementar en un boton y redireccionar a una página
public class Pagina {
	
	public void doIrNuevoSocio() throws GimnasioException{
		Redireccionar.redirecciona("nuevoSocio.jsf");		
	}

	public void doIrNuevaActividad() throws GimnasioException{
		Redireccionar.redirecciona("nuevaActividad.jsf");		
	}
	
	public void doIrEditarSocio() throws GimnasioException{
		Redireccionar.redirecciona("editarSocio.jsf");		
	}
	
}
