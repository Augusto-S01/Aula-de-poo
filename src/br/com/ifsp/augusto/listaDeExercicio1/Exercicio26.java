package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio26 {

	public static void main(String[] args) {
		
//		26. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. O programa deve parar de ler
//		e, portanto somar os valores quando for introduzido o número 0 (zero).
		
		Boolean valorValido = false;
		Double n = null;
		Double soma = 0D;

		
		
		System.out.println("Calculadora infinita, continue digitando numeros que ela vai continuar calculando");
		System.out.println("Digite algo q não seja um numero que ela ira parar");
		do {
			try {
				Scanner s = new Scanner(System.in);
				n = s.nextDouble();
						
				
				if(n < 0) {
					System.out.println("Você digitou um numero negativo");
					valorValido = true;
				}else {					
					soma = n + soma;
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("Você digitou algo que não é um numero tente novamente");
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println("A soma dos numeros é :" + soma);
		
		
	}
}
