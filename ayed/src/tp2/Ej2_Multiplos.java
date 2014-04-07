package tp2;

import java.util.Scanner;

public class Ej2_Multiplos {
	
	public static Integer[] generaArreglo(int dim){
		Integer[] intarray = new Integer[dim];
		for(int i=0;i<dim;++i){
			intarray[i] = (i+1) * dim;
		}
		return intarray;
	}
	
	private static void imprimeArreglo(Integer[] a){
		System.out.print("[ ");
		for(int i=0;i<=a.length-1;++i){
			System.out.print(Integer.toString(a[i])+ " ");
		}
		System.out.println("]");
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int dim;
		System.out.println("Ingrese un numero mayor que 0 ( 0 para salir)");
		dim = s.nextInt();
		
		while(dim != 0){
			if(dim<0){
				System.out.println("El numero no puede ser negativo champion");
			} else {
				imprimeArreglo(generaArreglo(dim));
			}
			System.out.println("Ingrese un nuevo numero ( 0 para salir )");
			dim = s.nextInt();
		}
		System.out.println("Nos V!");
		s.close();
	}
	
}
