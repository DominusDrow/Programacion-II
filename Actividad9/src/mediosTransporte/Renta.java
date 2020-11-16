package mediosTransporte;

import java.util.Date;

public class Renta {
	
	private Medios_Transporte vehiculo;
	private int horas;
	private int precioHora;
	private String NomCliente;
	private Date fechaInicio;
	private Date fechaFin;
	private boolean tarjetaCredito;
	
	public void Renta(Medios_Transporte vehiculo) {
		
		this.vehiculo=vehiculo;
	} 
	
	public void rentar() {
		
		//habra mas metodos de rentar pero con diferentes parametros
		
	}
	
	
	

}
