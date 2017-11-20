package jorge.gimnasiosoliz.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_pago")
public class TipoPago {
	@Id
	@Column(name="tPag_id")
	private Integer id;
	
	@Column(name="tPag_tipo")
	private String tipo;
	
	@Column(name="tPag_descripcion")
	private String descripcion;

	@OneToMany(mappedBy="tipoPago")
	private List<Factura> factura;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
