package jorge.gimnasiosoliz.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import jorge.gimnasiosoliz.model.Cliente;
import jorge.gimnasiosoliz.model.Ejercicio;

@Stateless
public class EjercicioDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(Ejercicio ejercicio)
	{
		em.persist(ejercicio);
	}
	
	public void actualizar(Ejercicio ejercicio)
	{
		em.merge(ejercicio);
	}
	
	public Ejercicio leer(String ejer_nombre)
	{
		em.find(Ejercicio.class, ejer_nombre);
		return null;
	}
	
	public void borrar(String ejer_nombre)
	{
		em.remove(leer(ejer_nombre));
	}
	
	public List<Ejercicio> listaEjercicios(){
		/*JPQL no hace productos cartesianos*/
		String jpql = "SELECT p FROM Ejercicio p";
		Query query = em.createQuery(jpql, Ejercicio.class);
		//Cuando el resultado es uno solo
		//query.getSingleResult();
		List<Ejercicio> listado = query.getResultList();
		return listado;
	}

}
