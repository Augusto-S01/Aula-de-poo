package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio25 {

	public static void main(String[] args) {
		
//		25. Fa�a um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio.
		
		Boolean valorValido = false;
		Double n = null;
		Double soma = 0D;

		
		
		System.out.println("Calculadora infinita, continue digitando numeros que ela vai continuar calculando");
		System.out.println("Digite algo q n�o seja um numero que ela ira parar");
		do {
			try {
				Scanner s = new Scanner(System.in);
				n = s.nextDouble();
						
				System.out.println(soma + " + " + n + " = " + (soma+n));
				soma =+ n;
				
				
			} catch (InputMismatchException e) {
				System.out.println("Voc� digitou algo que n�o � um numero, ent�o vamos parar");
				valorValido = true;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		
	}
}
