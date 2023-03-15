import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrays {
	
	Scanner s = new Scanner(System.in);
	
	public ExerciciosArrays() {
	}
	
	public void exercicio1a(){
		int[][] array = new int[3][10];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j;
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	public void exercicio1b(){
		int[][] array = new int[5][10];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j*j;
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	public void exercicio1c(){
		int[][] array = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i;
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	public void exercicio1d(){
		int[][] array = new int[9][6];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i % 2 == 0 ? -1 : 0;
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	public void exercicio2() {
		Random random = new Random();
		System.out.print("Linhas: ");
		int linhas = Integer.parseInt(s.next());
		System.out.print("Colunas: ");
		int colunas = Integer.parseInt(s.next());
		int[][] array = new int[linhas][colunas];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				//duas possibilidades de criar números aleatórios
				//array[i][j] = random.nextInt(100);
				array[i][j] = (int)(Math.random()*100);
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	public double[][] exercicio3(){
		double[][] retorno = new double[2][5];
		for(int i=0; i<retorno.length; i++) 
			for(int j=0; j<retorno[i].length; j++){
				System.out.println("Digite o próximo valor (double):");
				retorno[i][j] = Double.parseDouble(s.next());
			}
		
		return retorno;
	}
	
	public int exercicio4_e_5(double[][] array){
		int quantElementos = 0;
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)quantElementos++;
		return quantElementos;
	}
	
	public String exercicio6(double[][] array){
		String retorno = "";
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				retorno += j == array[i].length-1 ? array[i][j] + "\n" : array[i][j]+" - ";
		return retorno;
	}
	
	public double exercicio7(double[][] array){
		double maior = array[0][0];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j] > maior)
					maior = array[i][j];
			}
		}
		return maior;
	}
	
	public int exercicio8(int[][] array){
		int soma = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				soma += array[i][j];
			}
		}
		return soma;
	}
	
	public double exercicio9(double[][] array){
		double soma = 0;
		int quantElementos = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++){
				soma += array[i][j];
				quantElementos++;
			}
		}
			return soma/quantElementos;
	}
	
	public char[][] exercicio10(){
		int linhas = (int)(Math.random()*5+1);
		int colunas = (int)(Math.random()*3+1);
		char[][] retorno = new char[linhas][colunas];
		for(int i=0; i<retorno.length; i++)
			for(int j=0; j<retorno[i].length; j++){
				System.out.println("Digite o próximo valor (char):");
				retorno[i][j] = s.next().charAt(0);
			}
		return retorno;
	}
	
	public int[] exercicio11(int[][] array){
		int[] retorno = new int[array.length * array[0].length];
		int cont = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j] >= 0)
					retorno[cont++] = array[i][j];
			}
		}
		return retorno;
	}
	
	
}
