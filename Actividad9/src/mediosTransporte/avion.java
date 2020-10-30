package mediosTransporte;


public class avion extends transporte_aereo implements Comunicacion {

    private int numVuelo;
    private String aerolinea;
  
    public avion(String modelo,int capacidad,int combustible) {
    	super(modelo,capacidad,combustible);
    }
    
    public avion(String modelo,int capacidad,int combustible,String aero, int numVuelo) {
    	super(modelo,capacidad,combustible);
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

    //estos vienen de transporte_aereo
	public String ascender() {
		return "Ascendiendo 550 pies";
	}

	public String descender() {
		return "Descendiendo 250 pies";
	}
	//estos vienen de medios_transporte
	public String Despegar() {
	    if(super.getVolando()) {
    		
	    	return "El vuelo "+numVuelo+" despego y esta en camino";
	    }else {
	    		
	    	return super.uso_gas(gastoV, distanciaK, "El vuelo despego con exito");	
	    }
	}

	public String Aterrizar() {
	    if(super.getTren_aterrizaje()) {
    		
	    	return "El avion esta en tierra";
	    }else {
	    		
	    	return super.uso_gas(gastoV, distanciaK, "El vuelo aterrizo con exito");	
	    }
	}
	
    public String info() {
    	String si= super.info();
    	return si+"El avion con vuelo "+numVuelo+" pertenece a la aerolinea "+aerolinea;
    }

}