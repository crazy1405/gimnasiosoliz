package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.LoginDAO;
import jorge.gimnasiosoliz.model.Login;

@ManagedBean
public class LoginController 
{
	private Login login;
	@Inject
	private LoginDAO loginDAO;
	
	@PostConstruct
	public void init()
	{
		login = new Login();
	}

	public Login getLogin() {
		return login;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public String guardarLogin()
	{
		System.out.println(login);
		//InjectarDAO
		loginDAO.guardarLogin(login);
		
		return null;
	}
	
	public String eliminarLogin() {
		System.out.println(login);
		
		
		return null;
	}
	
}
