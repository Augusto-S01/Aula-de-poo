package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/**
		 *	1. Escreva um programa que leia um n?mero inteiro fornecido pelo usu?rio, 
		 *	armazenando-o numa vari?vel apropriada.Imprima o valor lido. 
		 *
		 */
		Boolean valorValido;
		Long valor = null;
		do {
			System.out.println("Digite um numero inteiro");
			Scanner s = new Scanner(System.in);
			valorValido = true;
			
			try {
				valor = s.nextLong();
				
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor valido");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println("O valor inserido ? " + valor.toString());
		
	}

}
