package mediosTransporte;


public class avion extends transporte_aereo implements Comunicacion {

    private int numVuelo;
    private String aerolinea;
	public static final int capaCombus=750;
  
    public avion(String modelo,int capacidad) {
    	super(modelo,capacidad,capaCombus);

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
	//estos vienen de medios_transportes
	public String Despegar() {
	    if(super.getVolando()) {
    		
	    	return "El vuelo "+numVuelo+" despego y esta en camino";
	    }else {
	    		
	    	return super.uso_gas(gastoV, distanciaK, "El vuelo despego con exito",capaCombus);	
	    }
	}

	public String Aterrizar() {
	    if(super.getTren_aterrizaje()) {
    		
	    	return "El avion esta en tierra";
	    }else {
	    		
	    	return super.uso_gas(gastoV, distanciaK, "El vuelo aterrizo con exito",capaCombus);	
	    }
	}
	
	public String Cargar() {
		
		if(super.getCombustible()<capaCombus-150) {
			
			return super.uso_cargar(getVolando(), capaCombus, "El avion se cargo correctamente");
		}else {
			
			return "Su tanque esta practicamente lleno ";
		}
	}
	
    public String info() {
    	String si= super.info();
    	return si+"El avion con vuelo "+numVuelo+" pertenece a la aerolinea "+aerolinea;
    }

}