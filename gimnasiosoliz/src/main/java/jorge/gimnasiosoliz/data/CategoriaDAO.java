package jorge.gimnasiosoliz.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


import jorge.gimnasiosoliz.model.Categoria;

@Stateless
public class CategoriaDAO 
{
	@Inject
	//Gestor de Entidades - conexion JPA
	private EntityManager em;
	
	public void insertar(Categoria categoria)
	{
		em.persist(categoria);
	}
	
	public void actualizar(Categoria categoria)
	{
		em.merge(categoria);
	}
	
	public void borrar(int id)
	{
		em.remove(leer(id));
	}
	
	public Categoria leer(int id)
	{
		System.out.println("Leer + id "+ id);
		Categoria c= em.find(Categoria.class, id);
		return c;
	}
	
	
	public List<Categoria> listadoCategorias()
	{
		/*JPQL no hace productos cartesianos*/
		String jpql = "SELECT c FROM Categoria c";
		Query query = em.createQuery(jpql, Categoria.class);
		//Cuando el resultado es uno solo
		//query.getSingleResult();
		List<Categoria> listado = query.getResultList();
		return listado;
	}
	


}
