package array;

import java.util.Scanner;

public class exercicio_array1 {
	public static void main(String[] args) {
	
	
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		int D[] = new int[10]; // arrays com tamanhos 10
		
		Scanner entrada = new Scanner (System.in);
		 
		for (int x = 0; x <A.length; x++ ){ // x é for, A é o array. x menor que o tamanho que o array, length é a qtd de caracteres.
			System.out.println("Digite o valor para o array A: ");
			A[x]= entrada.nextInt(); // estrutura que recebe o valor (esse valor veio do usuario pelo scanner) pela entrada passa por for e vai para o array
		}
		
		for (int x = 0; x <B.length; x++ ){ 
			System.out.println("Digite o valor para o array B: ");
			B[x]= entrada.nextInt();
		}
			
		for ( int x = 0; x <C.length; x++ ){
			System.out.println("Digite o valor para o array C: ");
			C[x]= entrada.nextInt();
		}
				
		for (int x = 0; x <D.length; x++ ){
			System.out.println("Digite o valor para o array D: ");
			D[x]= entrada.nextInt();
		}
		
		for (int y: A) {
			System.out.println(y + " ");
		}
		for (int y: B) {
			System.out.println(y + " ");
		}
		for (int y: C) {
			System.out.println(y + " ");
		}
		for (int y: D) {
			System.out.println(y + " ");
		}
		
		
		
	
	}

}
