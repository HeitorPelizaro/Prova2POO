package carros;

import categoria.Carro;

public final class Corolla extends Carro{
	
	public final String MARCA = "Toyota";
	private Boolean som;
	private Boolean radio;

	
	public Corolla(Boolean som, Boolean radio, Integer roda, String combustivel) {
		
		super(roda, combustivel);
		this.som = som;
		this.radio = radio;
		
	}
	public Corolla() {
		
		super(4,"Aceita tanto gasolina quanto álcool.");
		this.som = true;
		this.radio = true;
		
	}
	@Override
	public final void buzinar() {
		
		System.out.println("TUUTUUUUUUUU!!!!");
		
	}
	
	public Boolean getSom() {
		return som;
	}
	
	
	public Boolean getRadio() {
		return radio;
	}
	
	
}
