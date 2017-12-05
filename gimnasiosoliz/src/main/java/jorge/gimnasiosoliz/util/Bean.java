package jorge.gimnasiosoliz.util;

import javax.faces.context.FacesContext;


//Clase que me ayuda a recuperar un valor de la vista.
public class Bean {
	
	public Bean() {
		
	}
	
	public static String getkeyRecupera() {
	    FacesContext cont = FacesContext.getCurrentInstance();
	    java.util.Map<String, String> map = cont.getExternalContext().getRequestParameterMap();
	    return (String)map.get("keyRecupera");
	  }

}
