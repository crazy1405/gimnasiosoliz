package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

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
	
	public void borrar(String nombre)
	{
		em.remove(leer(nombre));
	}
	
	public Categoria leer(String nombre)
	{
		em.find(Categoria.class, nombre);
		return null;
	}


}
