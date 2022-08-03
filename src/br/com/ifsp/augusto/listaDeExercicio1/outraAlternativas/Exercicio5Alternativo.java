package br.com.ifsp.augusto.listaDeExercicio1.outraAlternativas;

import java.util.Scanner;

public class Exercicio5Alternativo {

	public static void main(String[] args) {
		/**
			5. Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, descobrir se o mesmo � par ou �mpar.
		 *
		 */
		
		Scanner s = new Scanner(System.in);
		
		
		String valorString;
		Long valor = 0L;
		Boolean valorNaoAceito = false;
		
		do {
			System.out.println("Digite um valor inteiro");
			valorString = s.next();
			
			valorNaoAceito = true;
			
			try {
				valor = Long.valueOf(valorString);				
			}catch(NumberFormatException e) {
				System.out.println("Digite um valor valido");
				valorNaoAceito = false;
			}catch(Exception e){
				System.out.println("Erro inesperado");
			}
			
			
			
			
		} while (!valorNaoAceito);
		
		System.out.println("O valor digitado foi:" + valor);
		if(valor % 2 == 0) {
			System.out.println("o valor � par");
		}else {
			System.out.println("o valor � impar");
		}
		s.close();

		

	}

}
