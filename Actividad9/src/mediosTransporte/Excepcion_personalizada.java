package mediosTransporte;

public class Excepcion_personalizada extends Exception{		//la clase de todas las excepciones

	public static final long serialVersionUID = 700L;	//para que java maneje la excepcion en el RunTime
	
    public Excepcion_personalizada(String msg) {
    	
    	super(msg);
    }	
    
}

class mensajes_excepciones{
	
	public void validar_gas(int gas,int comb) throws Excepcion_personalizada{
		
		if(gas<comb/4) {
			
			throw new Excepcion_personalizada("El vehiculo se quedo sin combustible");
		}
	}
	
	public void validar_cargar(boolean fuera) throws Excepcion_personalizada{
		
		if(fuera) {
			
			throw new Excepcion_personalizada("El vehiculo no puede cargarse mientras no este en tierra");
		}
		
	}

}