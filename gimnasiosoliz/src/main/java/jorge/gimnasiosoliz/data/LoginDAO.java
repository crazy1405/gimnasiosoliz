package jorge.gimnasiosoliz.data;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import jorge.gimnasiosoliz.model.Cliente;
import jorge.gimnasiosoliz.model.Login;

@Stateless
public class LoginDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(Login login)
	{
		em.persist(login);
	}
	
	public void actualizar(Login login)
	{
		em.merge(login);
	}
	
	public Login leer(Integer id)
	{
		em.find(Login.class, id);
		return null;
	}
	
	public void borrar(Integer id)
	{
		em.remove(leer(id));
	}
	
	public void guardar() {
		
	}
	
	public List<Login> listaLogin(){
		String jpql = "SELECT l FROM Login l";
		Query query = em.createQuery(jpql,Login.class);
		List<Login> listado = query.getResultList();
		return listado;
	}
	
	public void guardarLogin(Login login) {
		Login l= leer(login.getId());
		if(l == null) {
			insertar(l);
		}
		else {
			actualizar(l);
		}
	}
	
	public void eliminar(Login login) {
		Login l = leer(login.getId());
		if(l == null) {
			borrar(login.getId());
		}else {
			System.err.println("No existe login");
		}
		
	}
	
}
