package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio14 {

	public static void main(String[] args) {
//		14.Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua m�dia aritm�tica. Imprima tamb�m
//		"Aprovado" se a m�dia for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7.

		
		
		Boolean valorValido = false;
		Float valorA = null;
		Float valorB = null;
		Float valorC = null;
		Float media = null;
		System.out.println("Calculadora de nota e aprova��o de alunos");

		
		do {
			try {
				System.out.println("Digite o valor da primeira Nota ");
				Scanner s = new Scanner(System.in);
				valorA = s.nextFloat();
				
				System.out.println("Digite o valor da segunda nota ");
				valorB = s.nextFloat();
				
				System.out.println("Digite o valor da terceira nota");
				valorC = s.nextFloat();
				
		
				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		media = (valorA + valorB + valorC)/3;
		System.out.println("A m�dia aritmetica da notas �: " + media) ;

		if(media < 3) {
			System.out.println("Aluno reprovado!");
			System.exit(0);
		}
		if(media <= 7) {
			System.out.println("Aluno em exame");
			System.exit(0);
		}
		if(media > 7) {
			System.out.println("Aluno aprovado");
			System.exit(0);
		}
		
		
		
		
		
		
		
	}

}
