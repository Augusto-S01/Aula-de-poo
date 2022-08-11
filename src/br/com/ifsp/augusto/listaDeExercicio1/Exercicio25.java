package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio25 {

	public static void main(String[] args) {
		
//		25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.
		
		Boolean valorValido = false;
		Double n = null;
		Double soma = 0D;

		
		
		System.out.println("Calculadora infinita, continue digitando numeros que ela vai continuar calculando");
		System.out.println("Digite algo q não seja um numero que ela ira parar");
		do {
			try {
				Scanner s = new Scanner(System.in);
				n = s.nextDouble();
						
				System.out.println(soma + " + " + n + " = " + (soma+n));
				soma =+ n;
				
				
			} catch (InputMismatchException e) {
				System.out.println("Você digitou algo que não é um numero, então vamos parar");
				valorValido = true;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		
	}
}
