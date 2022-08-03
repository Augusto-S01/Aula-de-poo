package br.com.ifsp.augusto.listaDeExercicio1.outraAlternativas;

import java.util.Scanner;

public class Exercicio1Alternativo {

	public static void main(String[] args) {
		/**
		 *	1. Escreva um programa que leia um número inteiro fornecido pelo usuário, 
		 *	armazenando-o numa variável apropriada.Imprima o valor lido. 
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
		s.close();

		

	}

}
