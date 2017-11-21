package jorge.gimnasiosoliz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import jorge.gimnasiosoliz.data.TipoPagoDAO;
import jorge.gimnasiosoliz.model.TipoPago;

@ManagedBean
public class TipoPagoController
{
	private TipoPago tipoPago;
	@Inject
	private TipoPagoDAO tipoPagoDAO;
	
	@PostConstruct
	public void init()
	{
		tipoPago = new TipoPago();
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	public void GuardarTipoPago()
	{
		System.out.println(tipoPago);
		//InjectDAO
		tipoPagoDAO.insertar(tipoPago);
	}
	
}
