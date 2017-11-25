package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

@Entity
@Table(name="detalle_factura")
public class DetalleFactura implements Serializable{
	@Id
	@Column(name="dfac_id", length=10)
	@SequenceGenerator(initialValue=1, name="dfac_id_seq")
	private Integer id;
	
	@Column(name="dfac_cantidad", length=5)
	private Integer cantidad;
	
	//@Digits(integer=5, fraction=2)
	@Column(name="dfac_precioUnitario", length=5)
	private BigDecimal precioUnitario;
	
	@Column(name="dfac_valorTotal", length=5)
	private BigDecimal valorTotal;
	
	@Column(name="dfac_descuento", length=5)
	private BigDecimal descuento;

	@ManyToOne
	@JoinColumn(name="dfac_pro_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="dfac_fact_id")
	private Factura factura;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	

}
