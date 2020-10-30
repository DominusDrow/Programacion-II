package mediosTransporte;

public class Test_MediosTransporte {

	public static void main(String[] args) {
		
		naveEspacial nave1 = new naveEspacial(2);
	
		System.out.println(nave1.Despegar());
		System.out.println(nave1.Aterrizar());
		System.out.println("\n"+nave1.info());
		
		avion avion1 = new avion("kamikase",300);
		
		System.out.println(avion1.Despegar());
		System.out.println("\n"+avion1.info());
		
		naveEspacial nave2 = new naveEspacial(3);
		
		System.out.println(nave2.Despegar());
		System.out.println(nave2.mover());
		System.out.println("\n"+nave2.info());
		
		
		Medios_Transporte [] transportes = {nave1,avion1,nave2};
		int kilometraje_total=0;
		
		for(Medios_Transporte i:transportes) { 		//ocupamos polimorfismo
			
			kilometraje_total+=i.getKilometraje();
		}
		
		
		System.out.println("\nKilometraje total de todas los vehiculos: "+kilometraje_total);
		
		
		
	}

}
