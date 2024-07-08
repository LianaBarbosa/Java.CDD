package array;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		
		int notas[] = new int [5];
		double media;
		int soma = 0;
		
		
		Scanner entrada = new Scanner (System.in);
		
		for ( int x = 0; x < notas.length; x++){
			System.out.println("Insira a nota");
			notas[x] = entrada.nextInt();
			soma = soma + notas[x];
			
		}
		
		 media = soma/5;
		
		
		System.out.println("a media e " +media);
		
	}

}
