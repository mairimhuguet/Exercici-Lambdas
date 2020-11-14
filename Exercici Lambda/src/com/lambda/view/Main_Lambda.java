package com.lambda.view;

import com.lambda.project.*;




public class Main_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//-----------------------------------------FASE1------------------------------------------------------			
		
			Fase1 fase1 = new Fase1();		
			System.out.println("--- FASE 1 ---");

			System.out.println("\n---FASE 1.a---Imprimir els noms que comencen per A i tenen 3 lletres");
			fase1.fase1a();
			
			System.out.println("\n---FASE 1.b---Classificar e+numero parell i o+numero imparell");
			System.out.println(fase1.fase1b());
							
			System.out.println("\n---FASE 1.c---Imprimir les paraules que tinguin o");
			System.out.println(fase1.fase1c());
	
			System.out.println("\n---FASE 1.d---Imprimir les paraules que tinguin mes de 5 lletres");
			System.out.println(fase1.fase1d());
	
			System.out.println("\n---FASE 1.e---Imprimir els mesos de l'any");
			fase1.fase1e();
	
			System.out.println("\n\n---FASE 1.f---Imprimir els mesos de l'any amb method reference");
			fase1.fase1f();
			
//-----------------------------------------FASE2------------------------------------------------------
			
			Fase2 fase2 = new Fase2();
			System.out.println("\n--- FASE 2 ---");
			fase2.imprimePi();
				
	
//-----------------------------------------FASE3------------------------------------------------------
			
			System.out.println("\n--- FASE 3 ---");
			System.out.println(Fase3.Texto.reverse("odnuM aloH")); 
	}

}
