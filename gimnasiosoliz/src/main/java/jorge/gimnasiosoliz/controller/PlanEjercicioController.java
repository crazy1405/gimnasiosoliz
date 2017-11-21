package jorge.gimnasiosoliz.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.PlanEjercicioDAO;
import jorge.gimnasiosoliz.model.PlanEjercicio;

@ManagedBean
public class PlanEjercicioController
{
	public PlanEjercicio planEjer;
	
	@Inject
	public PlanEjercicioDAO planEjerDAO;
	
	public void inti()
	{
		planEjer = new PlanEjercicio();
	}

	public PlanEjercicio getPlanEjer() {
		return planEjer;
	}

	public void setPlanEjer(PlanEjercicio planEjer) {
		this.planEjer = planEjer;
	}
	
	
	public void guardarPlanEjercicio()
	{
		System.out.println(planEjer);
		//InjectDAO
		planEjerDAO.insertar(planEjer);
	}
	
}
