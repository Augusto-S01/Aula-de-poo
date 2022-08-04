package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/**
		4. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 100, imprimindo uma
		mensagem indicando que o "valor é maior que 100" ou uma mensagem indicando que o "valor é menor ou igual a 100".
		 *
		 */
		Boolean valorValido;
		Float valor = null;
		Float comparacao = 100F;
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
		
		if(valor > 50F) {
			System.out.println("O valor fornecido [" + valor + "] é maior que " + comparacao );
		}else {
			System.out.println("O valor fornecido [" + valor + "] é menor ou igual a " + comparacao);
		}
	}

}
