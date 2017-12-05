package jorge.gimnasiosoliz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono {

	@Id
	private int codigo;
	private String numero;
	private String tipo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Telefono [codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
