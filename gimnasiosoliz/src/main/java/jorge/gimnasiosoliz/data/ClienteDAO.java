package jorge.gimnasiosoliz.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	public Cliente leer(String cedula)
	{
		Cliente c = em.find(Cliente.class, cedula);
		return c;
	}

	
	public void borrar(String cedula)
	{
		em.remove(leer(cedula));
	}
	
	public List<Cliente> listaClientes(){
		/*JPQL no hace productos cartesianos*/
		String jpql = "SELECT p FROM Cliente p";
		Query query = em.createQuery(jpql, Cliente.class);
		//Cuando el resultado es uno solo
		//query.getSingleResult();
		List<Cliente> listado = query.getResultList();
		return listado;
	}
	
	public void guardarPersona(Cliente cliente) {
		Cliente c= leer(cliente.getCedula());
		if(c == null) {
			insertar(cliente);
		}
		else {
			actualizar(cliente);
		}
	}
}
