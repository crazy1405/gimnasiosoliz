package jorge.gimnasiosoliz.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@Column(name="per_cedula", length=10)
	private String cedula;
	
	@Column(name="per_nombre", length=30)
	private String nombre;
	
	@Column(name="per_apellido", length=30)
	private String apellido;
	
	@Column(name="per_telefono", length=30)
	private String telefono;
	
	@Column(name="per_direccion", length=30)
	private String direccion;
	
	@Column(name="per_email", length=30)
	private String email;
	
	@Column(name="per_celular", length=30)
	private String celular;
	
	@Column(name="per_sexo", length=30)
	private String sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="per_fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name="per_login_id", length=30)
	private String loginId;
	
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
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
				+ ", fechaNacimiento=" + fechaNacimiento + ", loginId=" + loginId + "]";
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	

}
