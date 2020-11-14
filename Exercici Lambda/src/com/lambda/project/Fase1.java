package com.lambda.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1 {

//	FASE 1A----------------------------
//	Lista
	private List<String> llista1a = new ArrayList<String>(Arrays.asList("Pepe", "Ton", "axe", "Ana", "Ada", "Aro","Aron","Ala","Miriam","Carlos"));

//	Fase 1a Fer llista dels noms de la lista1 que comencen per A i tenen 3 lletres.
	
	public void fase1a () {

	llista1a.stream().filter(nombrepropio ->nombrepropio.length() == 3 && nombrepropio.startsWith("A"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	
	}

	

	//	FASE 1B----------------------------

	// 	Lista
	private List<Integer> llista1b = new ArrayList<Integer>(Arrays.asList(1,11,13,2,12,22,654165));
	
	//	Fase 1B Fer llista de numeros separats per comes, si el numero es parell ficar-li davant una e. Si el numero es imparell ficar-li davant una o.
	
	String seleccion_numeros;
	public String fase1b() {
	
		llista1b.stream().forEach(numero_a_clasificar->{

		if (numero_a_clasificar%2 == 0)
			this.seleccion_numeros+="e"+numero_a_clasificar+"\n ";
		else this.seleccion_numeros+="o"+numero_a_clasificar+"\n ";}
		
				);
		
		
	return seleccion_numeros;
	
	
	}
	
	
	
//	FASE 1C----------------------------	
	
// 	Lista
	private List<String> llista1c = new ArrayList<String>(Arrays.asList("Lambda", "Hilo", "Oracle", "Curs", "Platja", "Molt", "Boli", "Polinesia"));

	//	Fase 1c Fer llista amb les paraules que tenen la "o"
	
	public List<String> fase1c() {
		return llista1c.stream().filter(palabra_o->palabra_o.toLowerCase().contains("o"))
				.collect(Collectors.toList());
	}
	

	
//	FASE 1D----------------------------	
	
//	Fase 1d Fer llista amb les paraules de la llista anterior que tinguin mes de 5 lletres
	
	public List<String> fase1d() {
		return llista1c.stream().filter(palabra_cinco->palabra_cinco.length()>5)
				.collect(Collectors.toList());
	}
	
	;
	
//	FASE 1E----------------------------	
	
//	Lista	
	private List<String> llista1e = new ArrayList<String>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Decembre"));

	//	Fase 1e Fer llista amb els mesos de l'any
	public void fase1e(){
		llista1e.forEach(mes->System.out.println(mes));
	}
	
	
	
//	FASE 1F----------------------------		
	
// 	Fase 1f Fer llista amb els mesos de la llista anteriorde l'any pero imprimir amb method reference
	public void fase1f(){
		llista1e.forEach(System.out::println);		
	}


}