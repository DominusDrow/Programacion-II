package InterfacesGraficas;

import Transportes.*;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8115855457791496411L;
	private Medios_Transporte vehiculo;
	private Cliente cliente;
	
	private int precioHora;
	private int precioRenta;
	private int horasRenta;
	private String nomVehiculo;
	
	private Date fechaInicio;
	private Date fechaFin;
	private String contrato;
	
	public Renta(Cliente client) {
		this.cliente=client;
		this.precioHora=0;
		this.precioRenta=0;
		this.horasRenta=0;
		this.nomVehiculo=null;
		this.fechaInicio=null;
		this.fechaFin=null;
		this.contrato="";
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
	    	
			for(int i=0;i<rentasA.size();i++) {
	    		bos.writeObject(rentasA.get(i));
				System.out.println(rentasA.get(i).getCliente().getNombre());
			}
			bos.close();
        }catch (Exception ex){ }
		
		JOptionPane.showMessageDialog (null, "Archivo guardado."); 
  }
	
	public ArrayList<Renta> leerFluj() {//lee los objetos del archivo y los añade al arraylist, retorna este lleno de objetos
		ArrayList<Renta> rentasA=new ArrayList<Renta>(); //si el archivo no existe lo crea y retorna arraylist con un objeto para evitar el null;
		Renta r=new Renta(new Cliente("null"));
		rentasA.add(r);
		try{
			FileInputStream fis= new FileInputStream("RentasAnteriores.dat");
			ObjectInputStream ois= new ObjectInputStream(fis);
				//InputStream fos=new FileInputStream(p);
				//ObjectInputStream bos= new ObjectInputStream(fos);
			    int i=0;
		    	System.out.println("hola");//ya no se imprime, aca lanza la excepcion
		    	r=(Renta)ois.readObject();
		    	rentasA.clear();
		    	while(true) {
			    	rentasA.add(i,r);
			    	System.out.println(r.getCliente().getNombre());
					System.out.println("ta bien");
			    	r=(Renta)ois.readObject();

			    }
        }catch(EOFException e) {System.out.println("EOFE");	}
		catch (FileNotFoundException ex){} 
		catch (ClassNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
		
		return rentasA;
		
	}
		
	
	

}
