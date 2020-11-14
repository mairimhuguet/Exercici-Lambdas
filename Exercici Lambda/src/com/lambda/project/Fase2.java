package com.lambda.project;

	public class Fase2 {

	PiNumber numeroPi = () -> {return 3.1415;};

	public void imprimePi( ) {
		System.out.println(numeroPi.getPiValue());
	}
}
