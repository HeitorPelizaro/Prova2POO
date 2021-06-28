package categoria;

import tipo.Automovel;

public abstract class Carro implements Automovel{
	
	public Integer rodas;
	
	public String combustivel;
	
	
	public Carro(Integer rodas, String combustivel) {
		
		this.rodas = rodas;
		this.combustivel = combustivel;
	}
	
	@Override
	public Boolean temMotor() {
		
		return true;
	} 
	
	
	@Override
	public void desligar() {
		
		System.out.println("Desligando!!!");
		
		
	}
	
	@Override
	public void ligar() {
	
		System.out.println("Ligando!!!");
		
	}
	
	public abstract void buzinar();

}
