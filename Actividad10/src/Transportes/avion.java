package Transportes;

/*
VÃ¡squez LÃ³pez Alfredo Omar 201957903
AvendaÃ±o Avalos Luis Ã�ngel   201933893
*/

public class avion extends transporte_aereo implements Comunicacion {
	
	public static final int precioHora=10;
    private int numVuelo;
    private String aerolinea;
	public static final int capaCombus=750;
  
    public avion(String modelo) {
    	super(modelo,capaCombus);

    }
    
    public avion(String modelo,String aero, int numVuelo) {
    	super(modelo,capaCombus);
    	this.aerolinea=aero;
    	this.numVuelo=numVuelo;
    }
    
    public avion(String modelo,int capacidad,String aero, int numVuelo) {
    	super(modelo,capacidad,capaCombus);
    	this.aerolinea=aero;
    	this.numVuelo=numVuelo;
    }
    
    public static int getPrecioHora() {
    	return precioHora;
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
    	return"Heathrow Control, "+aerolinea+" Vuelo "+numVuelo+" : Hoy hace un excelente dia";
    }
    
    public String comunicaTorreControl(String emergencia) {//SOBRECARGA DE METODO
    	return"Heathrow Control, "+aerolinea+" Vuelo "+numVuelo+", mi mensaje es como sigue: Mayday, Mayday, Mayday ....";
    }

    public String msgHumano() {
        
    	return Comunicacion.msg+" soy tu avion, a donde quieres ir";
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
	    	super.setTren_aterrizaje(false);	
	    	super.setVolando(true);
	    	return super.uso_gas(gastoV, distanciaK, "El vuelo despego con exito",capaCombus);	
	    }
	}

	public String Aterrizar() {
	    if(super.getTren_aterrizaje()) {
    		
	    	return "El avion esta en tierra";
	    }else {
	    	super.setTren_aterrizaje(true);	
	    	super.setVolando(false);
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