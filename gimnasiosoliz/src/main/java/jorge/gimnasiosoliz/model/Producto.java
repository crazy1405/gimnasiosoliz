package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Producto implements Serializable {

	@Id
	@Column(name="pro_id", length=10)
	private Integer id;
	
	@Column(name="pro_nombre", length=100)
	private String nombre;

	@Column(name="pro_precio", length=5)
	private BigDecimal precio;
	
	@Column(name="pro_stock", length=5)
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name="pro_cat_id")
	private Categoria categoria;
	
	@OneToMany(mappedBy="producto")
	private List<DetalleFactura> detalleFactura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
