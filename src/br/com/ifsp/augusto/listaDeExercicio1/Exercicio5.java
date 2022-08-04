package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/**
		5. Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar.
		 *
		 */
		Boolean valorValido;
		Float valor = null;
		do {
			System.out.println("Digite um numero qualquer");
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
		
		if(valor % 2 == 0) System.out.println("o valor [" + valor + "] é par");
		else System.out.println("o valor [" + valor + "] é impar");
	}

}
