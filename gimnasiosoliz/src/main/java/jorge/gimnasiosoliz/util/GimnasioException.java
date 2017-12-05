package jorge.gimnasiosoliz.util;

public class GimnasioException extends Exception{
	public GimnasioException() {}
	  
	  public GimnasioException(String message)
	  {
	    super(message);
	  }
	  
	  public GimnasioException(Exception exception) {
	    super("Error General" + exception.getMessage());
	  }
	  
	  public String mensajeUsuario() {
	    return getMessage();
	  }
}
