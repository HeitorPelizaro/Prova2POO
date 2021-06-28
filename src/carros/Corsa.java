package carros;

import categoria.Carro;

public final class Corsa extends Carro{
	
	public final String MARCA = "Chevrolet";
	private Boolean som;
	private Boolean radio;
	
	public Corsa(Boolean som, Boolean radio, Integer roda, String combustivel) {
		super(roda, combustivel);
		this.som = som;
		this.radio = radio;
	}
	
	public Corsa() {
		super(4,"Aceita apenas gasolina");
		this.som = false;
		this.radio = false;
	}
	
	@Override
	public final void buzinar() {
		
		System.out.println("FONNNNNNNNN!!!!!!!!!");
		
	}
	public Boolean getSom() {
		return som;
	}

	public Boolean getRadio() {
		return radio;
	}
	
	
	
}
