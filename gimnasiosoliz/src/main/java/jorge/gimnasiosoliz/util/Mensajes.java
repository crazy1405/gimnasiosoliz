package jorge.gimnasiosoliz.util;

import javax.faces.context.FacesContext;

//Maneja los mensajes que vera los usuarios.
public class Mensajes {
	  public Mensajes() {}
	  
	  public static void msgProcesoOk() {
	    general("Proceso ejecutado Satisfactoriamente...");
	  }
	  
	  public static String msgGrabaTxt() {
	    return "Datos Grabados Satisfactoriamente...";
	  }
	  
	  public static void grabado() {
	    general(msgGrabaTxt());
	  }
	  
	  public static void seleccioneRegistro() {
	    general("Primero seleccione un registro, recuerde que la seleccion se la realiza sobre la columna estado");
	  }
	  
	  public static void eliminado() {
	    general("Datos Eliminados Satisfactoriamente....");
	  }
	  
	  public static void general(String mensaje) {
	    FacesContext ctx = FacesContext.getCurrentInstance();
	    ctx.addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Sigma", mensaje));
	  }
	  
	  public static void error(String mensaje) {
	    FacesContext ctx = FacesContext.getCurrentInstance();
	    ctx.addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, "Error", mensaje));
	    System.err.println(mensaje);
	  }
	  
	  public static void setExc(Exception e) {
	    error("Msg:" + e.getMessage());
	  }
	  
	  public static void setErr(String resumen, String detalle) {
	    FacesContext ctx = FacesContext.getCurrentInstance();
	    ctx.addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, resumen, detalle));
	  }
}