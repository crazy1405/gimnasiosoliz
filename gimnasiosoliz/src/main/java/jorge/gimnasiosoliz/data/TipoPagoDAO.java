package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.TipoPago;

@Stateless
public class TipoPagoDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(TipoPago tipoPago)
	{
		em.persist(tipoPago);
	}
	
	public void actualizar(TipoPago tipoPago)
	{
		em.merge(tipoPago);
	}
	
	public TipoPago leer(String tipo_pago)
	{
		em.find(TipoPago.class, tipo_pago);
		return null;
	}
	
	public void borrar(String tipo_pago)
	{
		em.remove(tipo_pago);
	}
}
