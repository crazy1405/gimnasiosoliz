package jorge.gimnasiosoliz.util;

import javax.faces.context.FacesContext;


//Me ayuda a redireccionar a otra página jsf en componentes primefaces
public class Redireccionar {
	public static void redirecciona(String pagina) {
		try {
			FacesContext contex = FacesContext.getCurrentInstance();
			contex.getExternalContext().redirect(pagina);
			
		} catch (Exception e) {
			System.out.println("Error al redireccionar a:" + pagina);
		}
	}
}
