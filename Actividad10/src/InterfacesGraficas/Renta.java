package InterfacesGraficas;

import Transportes.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;


public class Renta {
	
	private Medios_Transporte vehiculo;
	private Cliente cliente;
	
	private int precioHora;
	private String precioRenta;
	private String horasRenta;
	private String nomVehiculo;
	
	private Date fechaInicio;
	private Date fechaFin;
	private String contrato;

	
	public String getNomVehiculo() {
		return nomVehiculo;
	}
	
	public void setVehiculo(avion vehiculo) {
		this.nomVehiculo="avion";
		this.precioHora=70;
		this.vehiculo=vehiculo;
	}
	
	public void setVehiculo(naveEspacial vehiculo) {
		this.nomVehiculo="Nave";
		this.precioHora=100;
		this.vehiculo=vehiculo;
	}
	
	public Medios_Transporte getVehiculo() {
		return vehiculo;
	}
	
	public void setCliente(Cliente client) {
		cliente=client;
	}
	
	public Cliente getCliente() {
		return cliente;
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
	
	public void setContrato(String contrat) {
		contrato=contrat;
	}
	
	public String getContrato() {
		return contrato;
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
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Se rent�: "+vehiculo.getModelo()+"\n Cliente: "+cliente.getNombre()+"\n De "+sdf.format(fechaInicio)+" al "+sdf.format(fechaFin)
		+"\nPor el total de $"+precioRenta;
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
	
	public void guardaFlujo(ArrayList<Renta> rentasA){
		try{
		    BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("RentasAnteriores.dat"));
		    ObjectOutputStream oos=new ObjectOutputStream(bos);
		    	for(int i=0;i<rentasA.size();i++)
		    		oos.writeObject(rentasA.get(i));
			   
			    oos.close();
			    bos.close(); 
        }catch (Exception ex){ }
		
		JOptionPane.showMessageDialog (null, "Archivo guardado."); 
  }
	
	public ArrayList<Renta> leerFluj(String patch) {
		ArrayList<Renta> rentasA=new ArrayList <Renta>();
		
		try{
			BufferedInputStream bos= new BufferedInputStream(new FileInputStream(patch));
			ObjectInputStream oos=new ObjectInputStream(bos);
			
			Renta r=(Renta)oos.readObject();
		    while(r!=null) {
		    	r=(Renta)oos.readObject();
		    	rentasA.add(r);
		    }
		    
			oos.close();
			bos.close(); 
        }catch (Exception ex){ }
		return rentasA;
		
	}
	
	
		
	
	

}
