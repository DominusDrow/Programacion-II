package InterfacesGraficas;

import Transportes.*;
import java.io.FileReader;
import java.io.IOException;
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
