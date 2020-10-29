package mediosTransporte;

import java.util.*;

public class avion extends transporte_aereo implements Comunicacion {

    private int numVuelo;
    private String aerolinea;

    public avion(String aero, int numVuelo) {
    	this.aerolinea=aero;
    	this.numVuelo=numVuelo;
    }

    public void setNumvuelo(int num) {
    	numVuelo=num;
    }
    
    public int getNumvuelo() {
    	return numVuelo;
    }
    
    public void setAero(String aero) {
    	aerolinea=aero;
    }
    
    public String getAero() {
    	return aerolinea;
    }
    

    public String comunicaTorreControl() {
      
    	return"Heathrow Control, "+aerolinea+" Vuelo "+numVuelo+", mi mensaje es como sigue: Mayday, Mayday, Mayday ....";
    }

    public String msgHumano() {
        
    	return "Hola, soy tu avion, a donde quieres ir";
    }


	
	public void cMueve() {
		
		
	}

}