package jorge.gimnasiosoliz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="plan_ejercicio")
public class PlanEjercicio implements Serializable{
	@Id
	@Column(name="pejer_id", length=10)
	private Integer Id;
	
	@Column(name="pejer_num_series", length=3)
	private Integer numSeries;
	
	@Column(name="pejer_repeticiones", length=3)
	private Integer repeticiones;
	
	@ManyToOne
	@JoinColumn(name="pejer_cli_id")
	private Cliente cliente;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumSeries() {
		return numSeries;
	}

	public void setNumSeries(Integer numSeries) {
		this.numSeries = numSeries;
	}

	public Integer getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(Integer repeticiones) {
		this.repeticiones = repeticiones;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
