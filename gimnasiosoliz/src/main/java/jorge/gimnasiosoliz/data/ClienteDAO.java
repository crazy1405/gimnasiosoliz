package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


import jorge.gimnasiosoliz.model.Cliente;

@Stateless
public class ClienteDAO 
{
	@Inject
	//Gestor de Entidades - conexion JPA
	private EntityManager em;
	
	public void insertar(Cliente cliente)
	{
		em.persist(cliente);
	}
	
	public void actualizar(Cliente cliente)
	{
		em.merge(cliente);
	}
	
	public Cliente leer(int cli_id)
	{
		em.find(Cliente.class, cli_id);
		return null;
	}

	
	public void borrar(int cli_id)
	{
		em.remove(leer(cli_id));
	}
}
