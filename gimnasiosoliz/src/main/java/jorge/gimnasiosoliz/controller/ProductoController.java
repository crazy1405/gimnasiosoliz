package jorge.gimnasiosoliz.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.ProductoDAO;
import jorge.gimnasiosoliz.model.Categoria;
import jorge.gimnasiosoliz.model.Producto;


@ManagedBean
public class ProductoController 
{
	/**
	 * Objeto producto
	 * */
	private Producto producto;
	
	@Inject
	private ProductoDAO productoDAO;
	
	/**Almacenará la lista de productos que existen**/
	private List<Producto> productos;
	
	
	private Categoria cate;
	
	private String nombre;
	
	@Inject
    private FacesContext facesContext;
	
	@PostConstruct
	public void init()
	{
		producto = new Producto();
		cate = new Categoria();
		System.out.println("INIT PRODCONTRO *************"+ producto);
		loadProductos();
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("El nombre es: "+nombre);
		loadDatosEditar(nombre);
	}



	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) 
	{
		this.producto = producto;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	public Categoria getCate() {
		return cate;
	}

	public void setCate(Categoria cate) {
		this.cate = cate;
		
	}

	//Placeholder
	private void loadProductos()
	{
		productos = productoDAO.listadoProductos();
	}
	
	
	//ActionController
	public String loadDatosEditar(String nombre)
	{
		this.producto = productoDAO.leer(nombre);
		System.out.println("\n\n");
		System.out.println("LoadDatosEditar");
		System.out.println("LoadDatosEditar    + nombre     " + nombre);
		System.out.println(producto);
		return "";
	}
	
	

	
	public void guardarProducto()
	{
		System.out.println("Guardar Producto      " + producto);
		//InjectDAO
		productoDAO.insertar(producto);
		loadProductos();
	}
	
	
	
	/**
	 * Este método sirve para eliminar un producto mediante el nombre
	 * @return String página a la que me va a redigir en este caso el listado 
	 * de llos productos para confirmar la eliminación
	 * */
	public String eliminar(String nombre)
	{
		System.out.println("El id que va a borrar es el:      "+nombre);
		//Llama al método borrar del DAO
		productoDAO.borrar(nombre);
		//Actualiza el listado de todas las categorías que existen en la DB
		loadProductos();
		return "listar-productos";
	}
	
	
	/**
	 * Este método verifica que no exista el producto para guardarlo
	 * y si ya existe lo modifica
	 * */
	public String guardar2()
	{
		System.out.println("\n\n\n\n MÉTODO GUARDAR 2 \n\\n");
		System.out.println(producto);
		System.out.println("\n\n\n\n MÉTODO GUARDAR 2 \n\\n");
		try 
		{
			if(this.nombre!=null)
				productoDAO.actualizar(producto);
			else
				productoDAO.insertar(producto);
			loadProductos();
		}
		catch (Exception e)
		{
			String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Registration unsuccessful");
            //facesContext es la parte de la vista
            facesContext.addMessage(null, m);
            return null;
		}
		return "listar-categoria";
	}
	
	private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }
	
	
	
	
}
