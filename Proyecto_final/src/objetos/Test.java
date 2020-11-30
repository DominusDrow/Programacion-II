package objetos;

import java.util.Date;

public class Test {
	public static void main(String args[]) {
		Nutriologo nutriologo=new Nutriologo();
		Paciente pc1=new Paciente("Angel", 19, 65, 174);
		Date fecha=new Date();
		
		System.out.println(nutriologo.toString());
		System.out.println(pc1.toString());
		//el doctor calcula el estado de salud segun el IMC
		System.out.println("\nNutriologo: Tu estado de salud es: "+nutriologo.VerEstado(pc1.getIMC()));
		//el paciente lo guarda
		pc1.setEstadoSalud("Mi estado de salud es: "+nutriologo.VerEstado(pc1.getIMC()));
		
		System.out.println("Paciente: "+pc1.pedirRecomendacion());
		
		System.out.println("Nutriologo: "+nutriologo.DarRecomendaciones(pc1.getIMC()));	
		
	}
}
