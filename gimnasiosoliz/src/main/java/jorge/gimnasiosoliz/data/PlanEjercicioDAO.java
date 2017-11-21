package jorge.gimnasiosoliz.data;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import jorge.gimnasiosoliz.model.PlanEjercicio;

@Stateless
public class PlanEjercicioDAO 
{
	@Inject
	private EntityManager em;
	
	public void insertar(PlanEjercicio planEjercicio)
	{
		em.persist(planEjercicio);
	}
	
	public void actualizar(PlanEjercicio planEjercicio)
	{
		em.merge(planEjercicio);
	}
	
	public PlanEjercicio leer(int plan_ejer_id)
	{
		em.find(PlanEjercicio.class, plan_ejer_id);
		return null;
	}
	
	public void borrar(int plan_ejer_id)
	{
		em.remove(leer(plan_ejer_id));
	}
	
}
