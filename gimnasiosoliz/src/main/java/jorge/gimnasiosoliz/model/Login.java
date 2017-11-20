package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login implements Serializable{

	@Id
	@Column(name="login_id", length=10)
	private Integer id;
	
	@Column(name="login_user", length=30)
	private String user;
	
	@Column(name="login_pass", length=30)
	private String pass;
	
	@OneToMany(mappedBy="login")
	private List<Persona> persona;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}
	
	
	
	
}
