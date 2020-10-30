package mediosTransporte;

public class naveEspacial extends trasporte_Espacial implements Comunicacion {
	
	public static final int GastoMOV=300;
	public static final int DistanciaMOV=300;
	public static final int GastoATACK=100;
	public static final int CapacidadCOM=1000;
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

    		return super.uso_gas(GastoMOV, DistanciaMOV, "la nave se movio 300 km");	
    		
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
			
			return super.uso_gas(GastoATACK,0,"Se dispararon los caniones");
			
		}else {
			return"La nave no cuenta con caniones";
		}
		
	}
	
public String Atacar(String Objetivo) {		//sobrecarga de metodos
		
		if(Caniones) {
			
			return super.uso_gas(GastoATACK,0,"Se dispararon los caniones a "+Objetivo);
			
		}else {
			return"La nave no cuenta con caniones";
		}
		
	}
	
	public String Cargar() {
		
		if(super.getCombustible()<CapacidadCOM-150) {
			
			return super.uso_cargar(getOrbita(), CapacidadCOM, "LA nave se cargo correctamente");
		}else {
			
			return "Su tanque esta practicamente lleno ";
		}
	}
	
	public String info() {		//sobreEscribimos el metodo de info
		
		return super.info()+", Caniones:"+Caniones+", Escudos:"+Escudos;
	}
	
	public String msgHumano() {
        return "HOLa mumanos";
    }





}




