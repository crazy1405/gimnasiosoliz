package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="persona")
public abstract class Persona implements Serializable{
	@Id
	@Column(name="per_cedula", length=10)
	@NotNull
	@Size(max=10)
	private String cedula;
	
	@Pattern(regexp = "[^0-9]*", message = "No debe contener numeros")
	@Column(name="per_nombre", length=30)
	private String nombre;
	
	@Pattern(regexp = "[^0-9]*", message = "No debe contener numeros")
	@Column(name="per_apellido", length=30)
	private String apellido;
	
	@Column(name="per_telefono", length=30)
	private String telefono;
	
	@Column(name="per_direccion", length=30)
	private String direccion;
	
    @NotEmpty
    @Email
	@Column(name="per_email", length=30)
	private String email;
	
	@Column(name="per_celular", length=30)
	private String celular;
	
	@Column(name="per_sexo", length=30)
	private String sexo;
	
	@Past
	@Temporal(TemporalType.DATE)
	@Column(name="per_fecha_nacimiento")
	private Date fechaNacimiento;
	
	/*@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="per_cli_id")
	private Cliente cliente;*/
	
	@ManyToOne
	@JoinColumn(name="per_login_id")
	private Login login;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", email=" + email + ", celular=" + celular + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento+ "]";
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
	

}
