package mediosTransporte;

public abstract class trasporte_Espacial extends Medios_Transporte {
	
	public final static int DistanciaAT=800;
	public final static int GastoAT=400;
	private int NumPropulsores;
	private String Orbitando;
    private boolean Orbita;
    
    public trasporte_Espacial(int propulsores) {
    	super(1000);						//por defecto una nave espacial tiene 1000 unidades de combustible.
    	NumPropulsores=propulsores;
    	Orbita=false;
    }
    
    
    public trasporte_Espacial(String modelo,int capacidad,int combustible) {
    	super(modelo,capacidad,combustible);

    }
    
    public trasporte_Espacial(String modelo,int capacidad,int com,int propulsores) {
    	super(modelo,capacidad,com);
    	NumPropulsores=propulsores;
    	Orbita=false;
    }
    
    public void setOrbita(boolean orbits) {
    	Orbita=orbits;
    }
    
    public boolean getOrbita() {
    	return Orbita;
    }
    
    public int getPropulsores() {
    	return NumPropulsores;
    }
    
    public void Orbitando(String cuerpoEspacial) {		//es como un set orbita
 
    	Orbitando=cuerpoEspacial;
    }
    
    public String info() {
    	
    	String info ="Modelo:"+super.getModelo()+", Capacidad:"+super.getCapacidad()+"Pasajeros, Propulsores:"+NumPropulsores+
    			" \n"+super.getKilometraje()+"Kilometros recorridos, "+super.getCombustible()+" Unidades de combustible"+
    			" \nSe encuentra orbitando a:"+Orbitando;
    		
    	return info;
    }
   
    public abstract String mover();
}



