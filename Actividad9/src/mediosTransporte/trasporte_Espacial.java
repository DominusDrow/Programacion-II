package mediosTransporte;

public class trasporte_Espacial extends Medios_Transporte {

	private int NumPropulsores;
	private String Orbitando;
    private boolean Orbita;
    
    public trasporte_Espacial(int propulsores) {
    	super(1000);						//por defecto una nave espacial tiene 1000 unidades de combustible
    	NumPropulsores=propulsores;
    	
    }
    
    public trasporte_Espacial(String modelo,int capacidad,int com,int propulsores) {
    	super(modelo,capacidad,com);
    	NumPropulsores=propulsores;
    }
    
    public String Despegar() {
    	
    	if(Orbita) {
    		
    		return "La nave ya despejo y esta orbitando";
    	}else {
    		
    		super.uso_gas(400); 					//las unidades de combustible que gasta cuando despega
    		super.uso_kilometraje(800);				//los kilometros que recorre para salir de la atmosfera
    		return "La nave despejo con exito";
    	}
	    	
	    }

    public void Orbitando(String cuerpoEspacial) {
 
    	Orbitando=cuerpoEspacial;
    }
    
    public String mover() {
    	
    	if(NumPropulsores>1) {
    		
    		super.uso_kilometraje(300);			//el kilometraje que se recorre
    		super.uso_gas(300);					//las unidades que cuesta mover la nave 
    		return "la nave se movio 300 km";
    		
    	}else {
    		return "No se cuenta cn los suficientes propulsores";
    	}
    	
    }

    public String info() {
    	return "Modelo:"+super.getModelo()+", Capacidad:"+super.getCapacidad()+"Pasajeros, Propulsores:"+NumPropulsores+
    			" \n"+super.getKilometraje()+"Kilometros recorridos, "+super.getCombustible()+" Unidades de combustible"+
    			" \nSe encuentra orbitando a:"+Orbitando;
    }

	public String Aterrizar() {
		
		if(!Orbita) {
    		
    		return "La nave esta en tierra";
    	}else {
    		
    		super.uso_gas(350); 					//las unidades de combustible que gasta cuando ateriza
    		super.uso_kilometraje(800);				//los kilometros que recorre para entrar a la tierra
    		return "La nave aterrizo con exito";
    	}
	
	}

    
}