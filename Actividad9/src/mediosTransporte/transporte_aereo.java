package mediosTransporte;

public abstract class transporte_aereo extends Medios_Transporte {

    private boolean volando;
    private boolean tren_aterrizaje;
	public final static int distanciaK=400;
	public final static int gastoV=200;
  
    public transporte_aereo(String modelo,int combustible) {
    	super(modelo,combustible);
    	volando=false;
    	tren_aterrizaje=true;
    }
    
    public transporte_aereo(String modelo,int capacidad,int combustible) {
    	super(modelo,capacidad,combustible);
    	volando=false;
    	tren_aterrizaje=true;
    }
    
    
    public void setVolando(boolean vol) {
    	volando=vol;
    }
    
    public boolean getVolando() {
    	return volando;
    }
    
    public void setTren_aterrizaje(boolean tren) {
    	tren_aterrizaje=tren;
    }
    
    public boolean getTren_aterrizaje() {
    	return tren_aterrizaje;
    }
    
    public String info() {
    	return "Modelo:"+super.getModelo()+",\n"+super.getKilometraje()+"Kilometros recorridos,  "+super.getCombustible()+" Unidades de combustible";
    }
 
    public abstract String ascender();

    public abstract String descender();
    
    

}