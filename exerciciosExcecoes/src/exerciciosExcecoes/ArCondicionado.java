package exerciciosExcecoes;

public class ArCondicionado {

	private double temperatura;
	
	public ArCondicionado() {
		this.temperatura = 20;		
	}	
		
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return "ArCondicionado [temperatura=" + temperatura + "]";
	}

	public void aumentaTemperatura_1(double tempMais){
	    try {
			this.temperatura += tempMais;
			if(temperatura < 16 || temperatura > 32)
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			this.temperatura -= tempMais;
			System.out.println("Temperatura inválida! \nTemperatura mantida em " + temperatura);
		} 
	}
	
	public void diminuiTemperatura_1(double tempMenos) {
	    try {
			this.temperatura -= tempMenos;
			if(temperatura <16 || temperatura > 32)
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			this.temperatura += tempMenos;
			System.out.println("Temperatura inválida! \nTemperatura mantida em " + temperatura);
		}
	}
	
	public void aumentaTemperatura_3(double tempMais) {
		this.temperatura += tempMais;
		if(temperatura < 16 || temperatura > 32){
			this.temperatura -= tempMais;
			throw new IllegalArgumentException();
		}
	}
	
	public void diminuiTemperatura_3(double tempMenos){
		this.temperatura -= tempMenos;
		if(temperatura < 16 || temperatura > 32){
			this.temperatura += tempMenos;
			throw new IllegalArgumentException();
		}	
	}
}
