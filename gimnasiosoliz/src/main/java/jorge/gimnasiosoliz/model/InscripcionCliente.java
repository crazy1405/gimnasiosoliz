package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscripcion_cliente")
public class InscripcionCliente implements Serializable
{
	@Id
	@Column(name="inCli_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="inCli_fecha_insc")
	private Date fechaInsc;
	
	@Column(name="inCli_fecha_vence")
	private Date fechaVence;
	
	@Column(name="inCli_estado")
	private String estado;
	
	public Date getFechaInsc() {
		return fechaInsc;
	}

	public void setFechaInsc(Date fechaInsc) {
		this.fechaInsc = fechaInsc;
	}

	public Date getFechaVence() {
		return fechaVence;
	}

	public void setFechaVence(Date fechaVence) {
		this.fechaVence = fechaVence;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
