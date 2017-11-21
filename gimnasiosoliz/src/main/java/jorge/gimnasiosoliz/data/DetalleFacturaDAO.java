package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.DetalleFactura;

@Stateless
public class DetalleFacturaDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(DetalleFactura detalleFactura)
	{
		em.persist(detalleFactura);
	}
	
	public void actualizar(DetalleFactura detalleFactura)
	{
		em.merge(detalleFactura);
	}
	
	public void leer(int det_fac_id)
	{
		em.find(DetalleFactura.class, det_fac_id);
	}
	
}
