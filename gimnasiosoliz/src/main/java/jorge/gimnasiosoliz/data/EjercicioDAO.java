package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

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

}
