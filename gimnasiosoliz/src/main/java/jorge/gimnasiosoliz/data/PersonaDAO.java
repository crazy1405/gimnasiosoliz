package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.Persona;

@Stateless
public class PersonaDAO
{
	@Inject
	//Gestor de Entidades - conexion JPA
	private EntityManager em;
	
	public void insertar(Persona persona)
	{
		em.persist(persona);
	}
	
	public void actualizar(Persona persona)
	{
		em.merge(persona);
	}
	
	public void borrar(String cedula)
	{
		em.remove(leer(cedula));
	}
	
	public Persona leer(String cedula)
	{
		em.find(Persona.class, cedula);
		return null;
	}

}
