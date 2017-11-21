package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.CategoriaDAO;
import jorge.gimnasiosoliz.model.Categoria;

@ManagedBean
public class CategoriaController 
{
	private Categoria categoria;
	
	@Inject
	private CategoriaDAO categoriaDAO;
	
	@PostConstruct
	public void init()
	{
		categoria = new Categoria();
	}
	
	public Categoria getCategoria()
	{
		return categoria;
	}
	
	
	public void setCategoria(Categoria categoria)
	{
		this.categoria=categoria;
	}
	
	public void guardarCategoria()
	{
		System.out.println(categoria);
		//Invoca el DAO
		categoriaDAO.insertar(categoria);
	}
	
}
