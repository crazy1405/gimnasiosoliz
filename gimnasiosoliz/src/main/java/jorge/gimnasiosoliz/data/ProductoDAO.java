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
	
	public Producto leer(int pro_id)
	{
		Producto pro = em.find(Producto.class,pro_id);
		return pro;
	}
	
	public void borrar(int pro_id)
	{
		em.remove(pro_id);
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
