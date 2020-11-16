package Transportes;
/*
Vásquez López Alfredo Omar 201957903
Avendaño Avalos Luis Ángel   201933893
*/
public class Test_MediosTransporte {

	public static void main(String[] args) {
		
		naveEspacial nave1 = new naveEspacial(true,2);//1
	
		System.out.println(nave1.Despegar());
		System.out.println(nave1.msgHumano());
		System.out.println(nave1.Aterrizar());
		System.out.println("\n"+nave1.info());
		
		avion avion1 = new avion("kamikase");//2
		
		System.out.println(avion1.Despegar());
		System.out.println("\n"+avion1.info());
		
		naveEspacial nave2 = new naveEspacial(2);//3

		System.out.println(nave2.Despegar());
		System.out.println(nave2.mover());
		System.out.println("\n"+nave2.info());
		//otros dos vehiculos
		
		avion avion2= new avion("Boeing707");//4
		
		System.out.println(avion2.Despegar());
		System.out.println(avion2.msgHumano());
		System.out.println(avion2.Aterrizar());
		System.out.println("\n"+avion2.info());
		
		naveEspacial nave3 = new naveEspacial("APOLO 11");//5
		System.out.println(nave3.Despegar());
		System.out.println(nave3.mover());
		System.out.println(nave3.Aterrizar());
		System.out.println("\n"+nave3.info());
		
		Medios_Transporte [] transportes = {nave1,avion1,nave2,avion2,nave3};
		int kilometraje_total=0;
		
		for(Medios_Transporte i:transportes) { 		//ocupamos polimorfismo
			
			kilometraje_total+=i.getKilometraje();
		}
		
		System.out.println("\nKilometraje total de todas los vehiculos: "+kilometraje_total);
		
	}

}
