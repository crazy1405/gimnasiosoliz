package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.Producto;

@Stateless
public class ProductoDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(Producto producto)
	{
		em.persist(producto);
	}
	
	public void actualizar(Producto producto)
	{
		em.merge(producto);
	}
	
	public Producto leer(String prod_nombre)
	{
		em.find(Producto.class,prod_nombre);
		return null;
	}
	
	public void borrar(String prod_nombre)
	{
		em.remove(prod_nombre);
	}
}
