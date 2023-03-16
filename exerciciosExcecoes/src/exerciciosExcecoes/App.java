package exerciciosExcecoes;

public class App {
	
	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.aumentaTemperatura_1(30);
		ar.diminuiTemperatura_1(30);
		System.out.println();
		
		try {
			ar.aumentaTemperatura_3(30);
		}catch (IllegalArgumentException e) {
			System.out.println("Erro! Temperatura inválida!\nTemperatura mantida em " + ar.getTemperatura());
		}
		
		ar.diminuiTemperatura_3(1);
	}
}
