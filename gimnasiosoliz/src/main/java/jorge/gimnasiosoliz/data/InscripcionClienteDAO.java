package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.InscripcionCliente;

@Stateless
public class InscripcionClienteDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(InscripcionCliente inscripcion)
	{
		em.persist(inscripcion);
	}
	
	public void actualizar(InscripcionCliente inscripcion)
	{
		em.merge(inscripcion);
	}
	
	public InscripcionCliente leer(int ins_cli_id)
	{
		em.find(InscripcionCliente.class, ins_cli_id);
		return null;
	}
	
	public void borrar(int ins_cli_id)
	{
		em.remove(leer(ins_cli_id));
	}
	
}
