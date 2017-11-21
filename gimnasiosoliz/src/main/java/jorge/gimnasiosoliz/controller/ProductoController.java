package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ProductoDAO;
import jorge.gimnasiosoliz.model.Producto;


@ManagedBean
public class ProductoController 
{
	private Producto producto;
	
	@Inject
	private ProductoDAO productoDAO;
	
	@PostConstruct
	public void init()
	{
		producto = new Producto();
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public void guardarProducto()
	{
		System.out.println(producto);
		//InjectDAO
		productoDAO.insertar(producto);
	}
	
	
}
