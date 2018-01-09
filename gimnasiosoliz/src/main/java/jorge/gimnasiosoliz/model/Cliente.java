package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.ws.rs.ext.ParamConverter.Lazy;

@Entity
@Table(name="cliente")
public class Cliente extends Persona implements Serializable{
	//@SequenceGenerator(initialValue=1, name="dfac_id_seq")
	
	
	//Peso en libras
	@Column(name="cli_peso", length=4)
	private Integer peso;
	
	//Altura en cm
	@Column(name="cli_estatura", length=4)
	private Integer estatura;
	
	@Column(name="cli_observac", length=300)
	private String observaciones;

	/*@OneToMany(mappedBy="cliente")
	private List<PlanEjercicio> planEjercicio;*/
	
	/*@OneToMany(mappedBy="cliente")
	private List<Factura> factura;*/
	
	/*@OneToMany(mappedBy="cliente")
	private List<InscripcionCliente> inscripcionCliente;*/
	
	/*@OneToMany(mappedBy="cliente")
	private List<Dieta> dieta;*/
	
	/*@OneToOne(fetch=FetchType.LAZY, mappedBy="cliente")
	private Persona persona;*/
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="persona", referencedColumnName="per_cedula")
	private List<InscripcionCliente> inscripcionClientes;
	
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="persona", referencedColumnName="per_cedula")
	private List<Telefono> telefonos;
	
	/*public void addInscripcionCliente(InscripcionCliente inscripcionCliente) {
		if(inscripcionClientes==null) {
			inscripcionClientes = new ArrayList<>();
		}
		inscripcionClientes.add(inscripcionCliente);
		
	}*/

	public void addTelefono(Telefono telefono) {
		if(telefonos==null) {
			telefonos = new ArrayList<>();
		}
		telefonos.add(telefono);
		
	}
	
	
	public Integer getPeso() {
		return peso;
	}

	

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getEstatura() {
		return estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}


	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	
	@Override
	public String toString() {
		return "Cliente [peso=" + peso + ", estatura=" + estatura + ", observaciones=" + observaciones + ", telefonos="
				+ telefonos + "]";
	}
	
	
	
	
}
