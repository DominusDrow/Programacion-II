package InterfacesGraficas;

import Transportes.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

public class Renta {
	
	private Medios_Transporte vehiculo;
	private int precioRenta;
	private int horasRenta;
	private String NomCliente;

	private Date fechaInicio;
	private Date fechaFin;
	private boolean tarjetaCredito;
	
	public Renta() {
		this.NomCliente="";
	} 
	
	public Renta(Medios_Transporte vehiculo) {
		this.NomCliente="";
		this.vehiculo=vehiculo;
	} 
	
	public void setVehiculo(Medios_Transporte Mvehiculo) {
		vehiculo=Mvehiculo;
	}
	
	public Medios_Transporte getVehiculo() {
		return vehiculo;
	}
	
	public void setPrecio(int precioR) {
		precioRenta=precioR;
	}
	
	public int getPrecio() {
		return precioRenta;
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
	
	public int calculaPrecio(int horas,int precioXHora) {
		return precioXHora*horas;
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
