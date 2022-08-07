package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio11 {

	public static void main(String[] args) {
//		11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo de A.
		Boolean valorValido = false;
		Long valor1 = null;
		Long valor2 = null;
		
		do {
			try {
				System.out.println("Digite um numero inteiro");
				Scanner s = new Scanner(System.in);
				valor1 = s.nextLong();
				System.out.println("Certo Agora digite um segundo numero inteiro");
				valor2 = s.nextLong();

				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		if(valor1 % valor2 == 0) {
			System.out.println("O Primeiro valor [" + valor1 + "] � multiplo de [ " + valor2 + " ]");
		}else if (valor2 % valor1 == 0) {
			System.out.println("O Segundo valor [" + valor2 + "] � multiplo de [ " + valor1 + " ]");
		}else {
			System.out.println("N�o foi encontrado multipos em comum nos valores apresentado");
		}
		
		
	}

}
