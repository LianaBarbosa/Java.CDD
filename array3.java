package array;

import java.util.Arrays;

public class array3 {
	public static void main(String[] args) {
		int array[] = {81,32,17,8,20,91,43};
		int array2[] = new int [array.length];
		
		
		
		for(int x= array.length-1; x>=0; x --) {//imprime ao contrário
			System.out.println(array[x]+" ");
		}
		
		Arrays.sort(array); //uso do método sort para organizar meu array em crescente reorganizando-o
		System.out.println();//quebra de linha
		
		for(int x: array) {
			System.out.println(x + " ");
		}
		
		
		
		
	}

}
