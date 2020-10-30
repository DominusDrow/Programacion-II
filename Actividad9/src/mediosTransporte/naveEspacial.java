package mediosTransporte;

public class naveEspacial extends trasporte_Espacial implements Comunicacion {
	
	public static final int GastoMOV=300;
	public static final int GastoATACK=300;
	private boolean Caniones;
	private boolean Escudos;	
	
	public naveEspacial(int propulsores) {
		super(propulsores);
		Caniones=false;
		Escudos=true;
	}
	
	public naveEspacial(int propulsores, boolean Caniones) {
		super(propulsores);
		this.Caniones=Caniones;
		Escudos=true;
	}
	
	public String Despegar() {
	    	
	    if(super.getOrbita()) {
	    		
	    	return "La nave ya despejo y esta orbitando";
	    }else {
	    		
	    	return super.uso_gas(GastoAT, DistanciaAT, "La nave despejo con exito");	
	    }
		    	
	}
	
	public String mover() {
    	
    	if(super.getPropulsores()>1) {

    		return super.uso_gas(300, 300, "la nave se movio 300 km");	
    		
    	}else {
    		return "No se cuenta cn los suficientes propulsores";
    	}
    	
    }
	
	public String Aterrizar() {
		
		if(!super.getOrbita()) {
    		
    		return "La nave ya esta en tierra";
    	}else {
    		
    		return super.uso_gas(GastoAT, DistanciaAT, "La nave aterrizo con exito");	
    	}
	
	}
	
	public String Atacar() {
		
		if(Caniones) {
			
			return super.uso_gas(100,0,"Se dispararon los caniones");
			
		}else {
			return"La nave no cuenta con caniones";
		}
		
	}
	
	public String msgHumano() {
        return "HOLa mumanos";
    }





}




