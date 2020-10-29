package mediosTransporte;

import java.util.*;

public class avion extends transporte_aereo implements Comunicacion {

    private int numVuelo;
    private String aerolinea;
    /*
    public avion(String modelo,int capacidad,int kilometraje,int combustible) {
    	super(modelo,capacidad,kilometraje,combustible);
    }
    
    public avion(String modelo,int capacidad,int kilometraje,int combustible,String aero, int numVuelo) {
    	super(modelo,capacidad,kilometraje,combustible);
    	this.aerolinea=aero;
    	this.numVuelo=numVuelo;
    }
	*/
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
    	return"Heathrow .Control, "+aerolinea+" Vuelo "+numVuelo+", mi mensaje es como sigue: Mayday, Mayday, Mayday ....";
    }

    public String msgHumano() {
        
    	return "Hola, soy tu avion, a donde quieres ir";
    }

    public String cMueve() {
    	return "El vuelo "+numVuelo+" de "+aerolinea+" se esta moviendo.";
    }

    public String info() {
    	return "El avion "+getModelo()+" pertenece a la aerolinea"+aerolinea;
    }

	@Override
	public String cDetiene() {
		// TODO Auto-generated method stub
		return null;
	}

}