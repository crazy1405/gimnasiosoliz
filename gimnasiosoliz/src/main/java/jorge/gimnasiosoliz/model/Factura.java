package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="factura")
public class Factura implements Serializable{
	@Id
	@Column(name="fact_id")
	private Integer id;
	
	@Column(name="fact_num")
	private Integer num;
	
	@Column(name="fact_fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name="fact_subtotal")
	private Integer subtotal;
	
	@Column(name="fact_iva_12")
	private Integer iva12;
	
	@Column(name="fact_total_pagar")
	private Integer totalPagar;
	
	@ManyToOne
	@JoinColumn(name="fact_cli_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy="factura")
	private List<DetalleFactura> detalleFactura;
	
	@ManyToOne
	@JoinColumn(name="fact_tPag_id")
	private TipoPago tipoPago;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getIva12() {
		return iva12;
	}

	public void setIva12(Integer iva12) {
		this.iva12 = iva12;
	}

	public Integer getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(Integer totalPagar) {
		this.totalPagar = totalPagar;
	}
	
}
