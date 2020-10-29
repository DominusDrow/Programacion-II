package mediosTransporte;

public class trasporte_Espacial extends Medios_Transporte {

	private int NumPropulsores;
	private String Orbitando;
    private boolean Orbita;

    public trasporte_Espacial() {
    	
    }
    
    public trasporte_Espacial(int propulsores) {
    	super();
    	NumPropulsores=propulsores;
    	super.setCombustible(1000);
    }
    
    public trasporte_Espacial(String modelo,int capacidad,int com,int propulsores) {
    	super(modelo,capacidad,com);
    	NumPropulsores=propulsores;
    }
    
    public String getPropulsores() {
    	
    	return NumPropulsores+"";
    }
    
    public String Despegar() {
    	
    	if(Orbita) {
    		
    		return "La nave ya despejo y esta orbitando";
    	}else {
    		
    		return "La nave despejo con exito";
    	}
    
    }

    public void Orbitando() {
    	
    	
    }
    
    public String cMueve() {
    	
    	if(NumPropulsores>1) {
    		
    		return "la nave se movio";
    		
    	}else {
    		return "No se cuenta cn los suficientes propulsores";
    	}
    	
    }

    public String info() {
    	return "";
    }

	public String cDetiene() {

		return null;
	}

}