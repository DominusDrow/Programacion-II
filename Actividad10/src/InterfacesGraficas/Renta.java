package InterfacesGraficas;

import Transportes.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

public class Renta {
	
	private Medios_Transporte vehiculo;
	private int precioHora;
	
	private String NomCliente;
	private String CelularC;
	private String precioRenta;
	private String horasRenta;
	
	private Date fechaInicio;
	private Date fechaFin;
	private boolean tarjetaCredito;
	
	public void setVehiculo(avion vehiculo) {
		this.precioHora=70;
		this.vehiculo=vehiculo;
	}
	
	public void setVehiculo(naveEspacial vehiculo) {
		this.precioHora=100;
		this.vehiculo=vehiculo;
	}
	
	public Medios_Transporte getVehiculo() {
		return vehiculo;
	}
	
	public void setPrecio(String precioR) {
		precioRenta=precioR;
	}
	
	public String getPrecio() {
		return precioRenta;
	}
	
	public void setHoraR(String horas) {
		horasRenta=horas;
	}
	
	public String getHoraR() {
		return horasRenta;
	}
	
	public void setNombreC(String nombre) {
		NomCliente=nombre;
	}
	
	public String getNombreC() {
		return NomCliente;
	}
	
	public void setCelularC(String celular) {
		celular=CelularC;
	}
	
	public String getCelulareC() {
		return CelularC;
	}
	
	public void setDateInicio(JDateChooser fecha) {
		fechaInicio= fecha.getDate();
	}
	
	public Date getDateInicio() {
		return fechaInicio;
	}
	
	public void setDateFin(JDateChooser fecha) {
		fechaFin= fecha.getDate();
	}
	
	public Date getDateFin() {
		return fechaFin;
	}
	
	
	public void setTarjeta(boolean tarj) {
		tarjetaCredito=tarj;
	}
	
	public boolean getTarjeta() {
		return tarjetaCredito;
	}
	
	public int calculaHoras(JDateChooser fechaI, JDateChooser fechaF) {
		int dias=0,horas;
		Calendar inicio=fechaI.getCalendar();
		Calendar fin=fechaF.getCalendar();
			
		while(inicio.before(fin)||inicio.equals(fin)) {
			dias++;
			inicio.add(Calendar.DATE, 1);	
		}	
		horas=24*dias;
		
		return horas;
	}
	
	public int calculaPrecio(int horas) {
		return this.precioHora*horas;
	}
	
	public static boolean validar(JDateChooser fecha1,JDateChooser fecha2) {
		
		if((fecha1.getDate()).before(fecha2.getDate())||(fecha1.getDate()).equals(fecha2.getDate())) {
			//si fecha inicio esta antes o es igual a fecha fin, esta bien(Y)
			return true;
		}
		return false;
	}
	
	
	
	public void rentar() {
		
		try {
			
			var entrada = new FileReader("");
			
			int c= entrada.read();
			
			while(c!=-1) {
				
				c=entrada.read();
				
				char letra = (char) c;
				
				System.out.print(letra);
			}
		
			
		}catch(IOException e) {
			
			System.out.println("No se encontro el archhivo");
		}
		
	}
	
	
	

}
