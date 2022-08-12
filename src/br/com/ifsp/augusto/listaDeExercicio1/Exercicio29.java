package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio29 {

	public static void main(String[] args) {
		
//		29. Faça um programa que exiba a tabela verdade da operação OU-Lógico para todas as combinações de três variáveis
//		lógicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V.
		
		Boolean valorValido = false;

		Boolean a = null;
		Boolean b = null;
		Boolean c = null;
		

		
		
		System.out.println("tabela verdade para OU-Logico");
		System.out.println("Digite tres valores logicos ( TRUE OU FALSE)");
		do {
			try {
				System.out.println();
				System.out.println("Digite um valor logico");
				Scanner s = new Scanner(System.in);
				a = s.nextBoolean();
				
				System.out.println("Digite segundo logico ");
				b = s.nextBoolean();
				
				System.out.println("Digite um terceiro logico");
				c = s.nextBoolean();
						
				
				valorValido=true;
				
			} catch (InputMismatchException e) {
				System.out.println("Voc� digitou valor invalido vamos recomeçar");
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println(a + " OU " + a + " = " + (a||a));
		System.out.println(a + " OU " + b + " = " + (a||b));
		System.out.println(a + " OU " + c + " = " + (a||c));
		
		System.out.println();
		
		System.out.println(b + " OU " + a + " = " + (b||a));
		System.out.println(b + " OU " + b + " = " + (b||b));
		System.out.println(a + " OU " + c + " = " + (a||c));
		
		
		System.out.println();
		
		System.out.println(c + " OU " + a + " = " + (c||a));
		System.out.println(c + " OU " + b + " = " + (c||b));
		System.out.println(c + " OU " + c + " = " + (c||c));
		
		
	}
}
