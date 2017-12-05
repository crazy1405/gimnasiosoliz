package jorge.gimnasiosoliz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ejercicio")
public class Ejercicio implements Serializable{
	@Id
	@Column(name="ejer_id", length=10)
	private Integer id;
	
	@Column(name="ejer_descripcion", length=300)
	private String descripcion;
	
	//@OneToMany(mappedBy="ejercicio", cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="ejercicio", referencedColumnName="ejer_id")
	private List<PlanEjercicio> planEjercicios;
	
	public void addPlanEjercicio(PlanEjercicio planEjercicio) {
		if(planEjercicios==null) {
			planEjercicios = new ArrayList<>();
		}
		planEjercicios.add(planEjercicio);
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public List<PlanEjercicio> getPlanEjercicios() {
		return planEjercicios;
	}

	public void setPlanEjercicios(List<PlanEjercicio> planEjercicios) {
		this.planEjercicios = planEjercicios;
	}

	@Override
	public String toString() {
		return "Ejercicio [id=" + id + ", descripcion=" + descripcion + ", planEjercicios=" + planEjercicios + "]";
	}
	
}
