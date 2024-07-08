package rep1;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		
		int alunos = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantos alunos tem na sala:");
		alunos = entrada.nextInt();
		int cont = 0;
		int qtd = alunos;
		double soma = 0, notas = 0, media = 0;
		while(cont<alunos) {
			
			System.out.println("Digite as notas:");
			notas = entrada.nextDouble();
			soma += notas; // += é como vezes
			
			cont++;
			
		}
		media = soma/qtd;
		System.out.println(media);
		entrada.close();
	}
	

}
