package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable
{
	@Id
	@Column(name="cat_id", length=10)
	private int id;
	
	@Column(name="cat_nombre", length=40)
	private String nombre;
	
	@Column(name="cat_descripcion", length=50)
	private String descripcion;
	
	//@OneToMany(mappedBy="categoria")
	//private List<Producto> producto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}*/
	
	
	@Override
	public String toString() {
		//return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion+ "]";
		return id + "   "+ nombre;
	}
	
	
	
}
