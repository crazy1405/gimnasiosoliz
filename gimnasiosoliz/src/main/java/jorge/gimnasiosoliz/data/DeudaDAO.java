package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.Deuda;

@Stateless
public class DeudaDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(Deuda deuda)
	{
		em.persist(deuda);
	}
	
	public void actualizar(Deuda deuda)
	{
		em.merge(deuda);
	}
	
	public Deuda leer(int deu_id)
	{
		em.find(Deuda.class, deu_id);
		return null;
	}
	
	public void borrar(int deu_id)
	{
		em.remove(leer(deu_id));
	}

}
