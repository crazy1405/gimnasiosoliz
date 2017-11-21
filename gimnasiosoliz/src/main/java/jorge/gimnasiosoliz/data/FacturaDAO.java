package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.Factura;

@Stateless
public class FacturaDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(Factura factura)
	{
		em.persist(factura);
	}
	
	public void actualizar(Factura factura)
	{
		em.merge(factura);
	}
	
	
	public Factura leer(int num_factura)
	{
		em.find(Factura.class, num_factura);
		return null;
	}
	
	public void borrar(int num_factura)
	{
		em.remove(leer(num_factura));
	}

}
