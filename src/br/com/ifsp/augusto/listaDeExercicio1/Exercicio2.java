package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/**
		 *	2. Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada.
			Imprima o valor lido.
		 *
		 */
		Boolean valorValido;
		Float valor = null;
		do {
			System.out.println("Digite um numero real");
			Scanner s = new Scanner(System.in);
			valorValido = true;
			
			try {
				valor = s.nextFloat();
				
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor valido");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println("O valor inserido é " + valor.toString());
		
	}

}
