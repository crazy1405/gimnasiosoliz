package jorge.gimnasiosoliz.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


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
		Producto pro = em.find(Producto.class,prod_nombre);
		return pro;
	}
	
	public void borrar(String prod_nombre)
	{
		em.remove(prod_nombre);
	}
	
	
	
	public List<Producto> listadoProductos()
	{
		/*JPQL no hace productos cartesianos*/
		String jpql = "SELECT pro FROM Producto pro";
		Query query = em.createQuery(jpql, Producto.class);
		//Cuando el resultado es uno solo
		//query.getSingleResult();
		List<Producto> listado = query.getResultList();
		return listado;
	}
	
	
	
}
