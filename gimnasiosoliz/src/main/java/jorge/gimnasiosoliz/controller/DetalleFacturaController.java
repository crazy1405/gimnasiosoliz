package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.DetalleFacturaDAO;
import jorge.gimnasiosoliz.model.DetalleFactura;

@ManagedBean
public class DetalleFacturaController 
{
	
	private DetalleFactura detalleFactura;
	@Inject
	private DetalleFacturaDAO detalleFacturaDAO;
	
	@PostConstruct
	public void init()
	{
		detalleFactura = new DetalleFactura();
	}

	public DetalleFactura getDetalleFactura() 
	{
		return detalleFactura;
	}

	public void setDetalleFactura(DetalleFactura detalleFactura) 
	{
		this.detalleFactura = detalleFactura;
	}
	
	
	public void guardarDetalleFactura()
	{
		System.out.println(detalleFactura);
		
		//InvocaDAO
		detalleFacturaDAO.insertar(detalleFactura);
	}
	

}
