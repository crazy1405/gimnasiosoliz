package jorge.gimnasiosoliz.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ValidarCedula {

	public void validarCedula(String cedula) {
		 
		FacesContext context = FacesContext.getCurrentInstance();
		String x = cedula;
		int suma=0;
	    if(x.length()==9){
	      System.out.println("Ingrese su cedula de 10 digitos");
	      System.out.println("Cedula incorrecta");
	      context.addMessage(null, new FacesMessage("Cedula incorrecta",  "Ingrese c�dula de 10 d�gitos: " +cedula) );
	    }else{
	      int a[]=new int [x.length()/2];
	      int b[]=new int [(x.length()/2)];
	      int c=0;
	      int d=1;
	      for (int i = 0; i < x.length()/2; i++) {
	        a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
	        c=c+2;
	        if (i < (x.length()/2)-1) {
	          b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
	          d=d+2;
	        }
	      }
	    
	      for (int i = 0; i < a.length; i++) {
	        a[i]=a[i]*2;
	        if (a[i] >9){
	          a[i]=a[i]-9;
	        }
	        suma=suma+a[i]+b[i];
	      } 
	      int aux=suma/10;
	      int dec=(aux+1)*10;
	      if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1)))) {
	    	  context.addMessage(null, new FacesMessage("Cedula Correcta",  "Cedula: " + x) );
	    	  System.out.println("Cedula Correcta");
	      }else
	        if(suma%10==0 && x.charAt(x.length()-1)=='0'){
	        	context.addMessage(null, new FacesMessage("Cedula Correcta",  "Cedula: " + x) );
	        	System.out.println("Cedula Correcta");
	        }else{
	        	context.addMessage(null, new FacesMessage("Cedula incorrecta",  "C�dula: " + x) );
	        	System.out.println("Cedula incorrecta");
	        }
	    }
	  
	}
}
