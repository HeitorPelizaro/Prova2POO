package main;

import carros.Corolla;
import carros.Corsa;
import carros.Fiesta;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("BLOCO ----------- COROLLA!!!!!!!!!");
		Corolla corolla = new Corolla();
		corolla.buzinar();
		System.out.println(corolla.combustivel);
		System.out.println(corolla.MARCA);
		corolla.ligar();
		corolla.desligar();
		System.out.println("O carro possui: "+corolla.rodas+" rodas");
		System.out.println("Possui som? "+ corolla.getSom());
		System.out.println("Possui radio? "+ corolla.getRadio());
		
		System.out.println("BLOCO ----------- FIESTA!!!!!!!!!");
		Fiesta fiesta = new Fiesta();
		fiesta.buzinar();
		System.out.println(fiesta.combustivel);
		System.out.println(fiesta.MARCA);
		fiesta.ligar();
		fiesta.desligar();
		System.out.println("O carro possui: "+fiesta.rodas+" rodas");
		System.out.println("Possui som? "+ fiesta.getSom());
		System.out.println("Possui radio? "+ fiesta.getRadio());
		
		System.out.println("BLOCO ----------- CORSA!!!!!!!!!");
		Corsa corsa = new Corsa();
		corsa.buzinar();
		System.out.println(corsa.combustivel);
		System.out.println(corsa.MARCA);
		corsa.ligar();
		corsa.desligar();
		System.out.println("O carro possui: "+corsa.rodas+" rodas");
		System.out.println("Possui som? "+ corsa.getSom());
		System.out.println("Possui radio? "+ corsa.getRadio());
		
	}

}
