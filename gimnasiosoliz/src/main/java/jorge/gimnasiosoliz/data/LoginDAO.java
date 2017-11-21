package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

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
	
	public Login leer(String login_usr_name)
	{
		em.find(Login.class, login_usr_name);
		return null;
	}
	
	public void borrar(String login_usr_name)
	{
		em.remove(leer(login_usr_name));
	}
	
}
