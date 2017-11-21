package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.FacturaDAO;
import jorge.gimnasiosoliz.model.Factura;

@ManagedBean
public class FacturaController 
{
	private Factura factura;
	@Inject
	private FacturaDAO facturaDAO;
	
	@PostConstruct
	public void intit()
	{
		factura = new Factura();
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	public void guardarFactura()
	{
		System.out.println(factura);
		
		//Inyectar el DAO
		facturaDAO.insertar(factura);
	}
	
	
	
}
