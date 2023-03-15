
public class App {

	public static void main(String[] args) {
		
		ExerciciosArrays e = new ExerciciosArrays();
		//e.exercicio1a();		
		System.out.println();
		
		//e.exercicio1b();
		System.out.println();
		
		//e.exercicio1c();
		System.out.println();
		
		//e.exercicio1d();
		System.out.println();
		
		//e.exercicio2();
		System.out.println();
		
		/*
		double[][] arrayDouble = e.exercicio3();
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.println();
			for (int j = 0; j < arrayDouble[i].length; j++) {
				System.out.print(arrayDouble[i][j]);
			}
		}
		*/
		
		/*
		System.out.println();
		System.out.println(e.exercicio4_e_5(arrayDouble));
		*/
		
		/*
		double[][] arrayDoubleexe6 = new double[2][2];
		arrayDoubleexe6[0][0] = 2.0;
		arrayDoubleexe6[0][1] = 2.0;
		arrayDoubleexe6[1][0] = 2.0;
		arrayDoubleexe6[1][1] = 2.0;
		System.out.println(e.exercicio6(arrayDoubleexe6));
		*/
		
		/*
		double[][] arrayDoubleexe7 = new double[2][2];
		arrayDoubleexe6[0][0] = 1.0;
		arrayDoubleexe6[0][1] = 2.0;
		arrayDoubleexe6[1][0] = 10.0;
		arrayDoubleexe6[1][1] = 3.0;
		System.out.println(e.exercicio7(arrayDoubleexe7));
		*/
		
		/*
		int[][] arrayInt8 = new int[2][2];
		arrayInt8[0][0] = 1;
		arrayInt8[0][1] = 2;
		arrayInt8[1][0] = 1;
		arrayInt8[1][1] = 2;
		System.out.println(e.exercicio8(arrayInt8));
		*/
		
		/*
		double[][] arrayDoubleexe9 = new double[2][2];
		arrayDoubleexe9[0][0] = 4.0;
		arrayDoubleexe9[0][1] = 2.0;
		arrayDoubleexe9[1][0] = 2.0;
		arrayDoubleexe9[1][1] = 2.0;
		System.out.println(e.exercicio9(arrayDoubleexe9));
		*/
		
		/*
		char[][] arrayChar = e.exercicio10();
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println();
			for (int j = 0; j < arrayChar[i].length; j++) {
				System.out.print(arrayChar[i][j]);
			}
		}
		*/
		
		/*
		int[][] arrayInt11 = new int[2][2];
		arrayInt11[0][0] = 1;
		arrayInt11[0][1] = 2;
		arrayInt11[1][0] = 1;
		arrayInt11[1][1] = -1;
		int[] arrayInt = new int[arrayInt11.length * arrayInt11[0].length];
		arrayInt = e.exercicio11(arrayInt11);
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		*/
		
		int[][] arrayBi = {{3, 5, 6}, {5, 4, 6}, {1, 9, 0}, {5, 4, 6}};
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.println(arrayBi[i][j]);
			}
		}
				
	}
}
