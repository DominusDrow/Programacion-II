package InterfacesGraficas;

import Transportes.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;


public class Renta implements Serializable{

	private Medios_Transporte vehiculo;
	private Cliente cliente;
	
	private int precioHora;
	private String precioRenta;
	private String horasRenta;
	private String nomVehiculo;
	
	private Date fechaInicio;
	private Date fechaFin;
	private String contrato;
	
	public Renta(Cliente client) {
		this.cliente=client;
	}
	
	public Renta() {
		// TODO Auto-generated constructor stub
	}

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
		return "Se rentï¿½: "+vehiculo.getModelo()+"\n Cliente: "+cliente.getNombre()+"\n De "+sdf.format(fechaInicio)+" al "+sdf.format(fechaFin)
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
			OutputStream fos=new FileOutputStream("RentasAnteriores.dat");
			ObjectOutputStream bos= new ObjectOutputStream(fos);
	    	for(int i=0;i<rentasA.size();i++)
	    		bos.writeObject(rentasA.get(i));
			bos.close();
        }catch (Exception ex){ }
		
		JOptionPane.showMessageDialog (null, "Archivo guardado."); 
  }
	
	public ArrayList<Renta> leerFluj() {//lee los objetos del archivo y los añade al arraylist, retorna este lleno de objetos
		ArrayList<Renta> rentasA=new ArrayList<Renta>(); //si el archivo no existe lo crea y retorna arraylist con un objeto para evitar el null;
		Renta r=new Renta(new Cliente("null"));
		rentasA.add(r);
		try{
			File p= new File("RentasAnteriores.dat");
			if(!p.exists()) {
				System.out.println("no existe");
				p.createNewFile();
			}else {
				System.out.println("existe");
				InputStream fos=new FileInputStream(p);
				ObjectInputStream bos= new ObjectInputStream(fos);
			    int i=0;
			    System.out.println("si");
		    	r=(Renta)bos.readObject();
		    	System.out.println("hola");//ya no se imprime, aca lanza la excepcion
			    while(r!=null) {
					rentasA.add(i,r);
			    	r=(Renta)bos.readObject();
			    }
			}
		    
        }catch (FileNotFoundException ex){
        	
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rentasA;
		
	}
		
	
	

}
