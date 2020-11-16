package InterfacesGraficas;

import Transportes.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Renta {
	
	private Medios_Transporte vehiculo;
	private int horasRenta;
	private String NomCliente;

	private Date fechaInicio;
	private Date fechaFin;
	private boolean tarjetaCredito;
	
	public void Renta(Medios_Transporte vehiculo) {
		
		this.vehiculo=vehiculo;
	} 
	
	public void setVehiculo(Medios_Transporte Mvehiculo) {
		vehiculo=Mvehiculo;
	}
	
	public Medios_Transporte getVehiculo() {
		return vehiculo;
	}
	
	public void setHoraR(int horas) {
		horasRenta=horas;
	}
	
	public int getHoraR() {
		return horasRenta;
	}
	
	public void setNombreC(String nombre) {
		NomCliente=nombre;
	}
	
	public String getNombreC() {
		return NomCliente;
	}
	
	public void setDateInicio(int dia,int mes, int anio) {
		Calendar calendar=new GregorianCalendar();
		calendar.set(anio,mes, dia);
		fechaInicio=calendar.getTime();
	}
	
	public Date getDateInicio() {
		return fechaInicio;
	}
	
	public void getDateFin(int dia,int mes, int anio) {
		Calendar calendar=new GregorianCalendar();
		calendar.set(anio,mes, dia);
		fechaFin=calendar.getTime();
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
	
	public void rentar() {
		
		try {
			
			FileReader entrada = new FileReader("/home/drow/Documents/texto.txt");
			
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
