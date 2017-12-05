package jorge.gimnasiosoliz.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pro_id", length=10)
	private int pro_id;
	
	@Column(name="pro_nombre", length=100)
	private String nombre;

	@Column(name="pro_precio", length=5)
	private double precio;
	
	@Column(name="pro_stock", length=5)
	private int stock;
	
	//@ManyToOne
	//@JoinColumn(name="pro_cat_id")
	private int cat_id;
	

	public int getPro_id() {
		return pro_id;
	}





	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public int getStock() {
		return stock;
	}





	public void setStock(int stock) {
		this.stock = stock;
	}





	public int getCat_id() {
		return cat_id;
	}





	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}





	@Override
	public String toString() {
		return "Producto [id=" + pro_id + ", nombre=" + nombre + ", precio=" + precio+" stock=  "+stock+" categoria=  "+cat_id+ "]";
		//return id + "   "+ nombre;
	}
	
	
}
