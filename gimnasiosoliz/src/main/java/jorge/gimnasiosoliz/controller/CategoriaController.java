package jorge.gimnasiosoliz.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.CategoriaDAO;
import jorge.gimnasiosoliz.model.Categoria;

@ManagedBean
public class CategoriaController implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Categoria categoria;
	
	private List<Categoria> categorias;
	
	@Inject
	private CategoriaDAO categoriaDAO;
	
	private int id;
	
	@Inject
    private FacesContext facesContext;
	
	
	
	@PostConstruct
	public void init()
	{
		categoria = new Categoria();
		loadCategorias();
	}
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
		System.out.println("El id es: "+id);
		loadDatosEditar(id);
	}




	public Categoria getCategoria()
	{
		return categoria;
	}
	
	
	public void setCategoria(Categoria categoria)
	{
		this.categoria=categoria;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	//Placeholder
	private void loadCategorias()
	{
		categorias = categoriaDAO.listadoCategorias();
	}
	
	//ActionController
	public String loadDatosEditar(int id)
	{
		this.categoria = categoriaDAO.leer(id);
		System.out.println("\n\n");
		System.out.println("LoadDatosEditar");
		System.out.println("LoadDatosEditar    + id     " + id);
		System.out.println(categoria);
		return "";
	}
	
	/**
	 * Este método sirve para eliminar una categoría mediante el nombre
	 * @return String página a la que me va a redigir en este caso el listado 
	 * de las categorías para confirmar la eliminación
	 * */
	public String eliminar(int id)
	{
		System.out.println("El id que va a borrar es el:      "+id);
		//Llama al método borrar del DAO
		categoriaDAO.borrar(id);
		//Actualiza el listado de todas las categorías que existen en la DB
		loadCategorias();
		return "listar-categoria";
	}
	
	
	public void guardarCategoria()
	{
		System.out.println(categoria);
		//Invoca el DAO
		categoriaDAO.insertar(categoria);
		loadCategorias();
	}
	
	
	
	/**
	 * Este método verifica que no exista la categoria para guardarla
	 * y si ya existe la modifica
	 * */
	public String guardar2()
	{
		System.out.println("\n\n\n\n MÉTODO GUARDAR 2 \n\\n");
		System.out.println(categoria);
		System.out.println("\n\n\n\n MÉTODO GUARDAR 2 \n\\n");
		try 
		{
			if(this.categoria.getId()!=0)
				categoriaDAO.actualizar(categoria);
			else
				categoriaDAO.insertar(categoria);
			loadCategorias();
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
