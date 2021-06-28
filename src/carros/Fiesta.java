package carros;

import categoria.Carro;

public final class Fiesta extends Carro{
	
	public final String MARCA = "Ford";
	private Boolean som;
	private Boolean radio;
	
	public Fiesta(Boolean som, Boolean radio, Integer roda, String combustivel) {
		
		super(roda, combustivel);
		this.som = som;
		this.radio = radio;
				
	}
	
	public Boolean getSom() {
		return som;
	}


	public Boolean getRadio() {
		return radio;
	}


	public Fiesta() {
		super(4,"Aceita apenas álcool.");
		this.som = true;
		this.radio = false;
	}
	
	@Override
	public final void buzinar() {
		
		System.out.println("BIBIIIIIIIIIIIII!!!!!!!!!!!");
		
	}

	
}
