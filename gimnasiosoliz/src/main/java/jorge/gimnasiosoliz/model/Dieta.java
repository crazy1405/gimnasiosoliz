package jorge.gimnasiosoliz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dieta")
public class Dieta {
	
	@Id
	@Column(name="dieta_id", length=6)
	private Integer id;
	
	@Column(name="dieta_detalle", length=300)
	private String detalle;
	
	@ManyToOne
	@JoinColumn(name="dieta_cli_id")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
	
}
