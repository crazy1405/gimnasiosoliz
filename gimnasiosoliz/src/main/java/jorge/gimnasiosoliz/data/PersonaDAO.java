package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.Persona;

@Stateless
public class PersonaDAO
{
	@Inject
	private EntityManager em;
	
	public void insertar(Persona persona) {
		em.persist(persona);
	}

}
