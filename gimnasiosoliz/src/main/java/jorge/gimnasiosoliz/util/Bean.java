package jorge.gimnasiosoliz.util;

import javax.faces.context.FacesContext;

public class Bean {
	
	public Bean() {
		
	}
	
	public static String getkeyRecupera() {
	    FacesContext cont = FacesContext.getCurrentInstance();
	    java.util.Map<String, String> map = cont.getExternalContext().getRequestParameterMap();
	    return (String)map.get("keyRecupera");
	  }

}
