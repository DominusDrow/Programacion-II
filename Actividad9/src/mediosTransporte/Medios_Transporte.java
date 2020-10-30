package mediosTransporte;

public abstract class Medios_Transporte {
  
    private String modelo;
    private int capacidad_pasajeros;
    private int kilometraje;
    private int combustible;
    
    public Medios_Transporte(int combustible) {
    	
    	modelo="";
    	capacidad_pasajeros=0;
    	this.combustible=combustible;
    	kilometraje=0;
    }
    
    public Medios_Transporte(String modelo,int capacidad, int combustible) {
    	this.modelo=modelo;
    	this.capacidad_pasajeros=capacidad;
    	this.combustible=combustible;
    	kilometraje=0;
    	
    }

    public void setModelo(String mod) {
    	modelo=mod;
    }
    
    public String getModelo() {
    	return modelo;
    }
    
    public void setCapacidad(int capas) {
    	capacidad_pasajeros=capas;
    }
    
    public int getCapacidad() {
    	return capacidad_pasajeros;
    }
    public void setKilometraje(int kil) {
    	kilometraje=kil;
    }
    
    public int getKilometraje() {
    	return kilometraje;
    }

    public void setCombustible(int com) {
    	combustible=com;
    }
    
    public int getCombustible() {
    	return combustible;
    }
    
    public String uso_gas(int gasto,int kilometros, String mensaje, int capaComb) {			//implementamos excepciones personalizadas
    	
    	mensajes_excepciones msg = new mensajes_excepciones();
    	
    	try {
    		combustible-=gasto;	
    		kilometraje+=kilometros;
    		
    		msg.validar_gas(combustible, capaComb);    	
    		
    		return mensaje;
    		
    	}catch(Excepcion_personalizada e) {
    		
    		return e.getMessage();
    	}
    	
    }
    
    public String uso_cargar(boolean fuera, int Capacidad,String mensaje) {
    	
    	mensajes_excepciones msg = new mensajes_excepciones();
    	
    	try {
    		combustible=Capacidad;
    		msg.validar_cargar(fuera);
    		return mensaje;
    	}catch(Excepcion_personalizada e) {
    		
    		return e.getMessage();
    	}
    	
    }
   
    public abstract String Despegar();
    
    public abstract String info();
    
    public abstract String Aterrizar();
    
    public abstract String Cargar();

}


