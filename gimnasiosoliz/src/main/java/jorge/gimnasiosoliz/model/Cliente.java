package jorge.gimnasiosoliz.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	//@SequenceGenerator(initialValue=1, name="dfac_id_seq")
	@Id
	@Column(name="cli_id", length=10)
	private Integer id;
	
	//Peso en libras
	@Column(name="cli_peso", length=4)
	private Integer peso;
	
	//Altura en cm
	@Column(name="cli_estatura", length=4)
	private Integer estatura;

	@OneToMany(mappedBy="cliente")
	private List<PlanEjercicio> planEjercicio;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="cliente")
	private Persona persona;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getEstatura() {
		return estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}

	public List<PlanEjercicio> getPlanEjercicio() {
		return planEjercicio;
	}

	public void setPlanEjercicio(List<PlanEjercicio> planEjercicio) {
		this.planEjercicio = planEjercicio;
	}
	
	
	
}
