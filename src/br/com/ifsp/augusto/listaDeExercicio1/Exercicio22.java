package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio22 {

	public static void main(String[] args) {
		
//		23 considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
//		informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
//		V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
//		T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
//		PF = P0 + V * T + (A * T2) / 2
		
		Boolean valorValido = false;
		Double pZero = null;
		Double velocidade = null;
		Double aceleracao = null;
		Long tempo = null;
		Double pFinal = null;

		
		
		System.out.println("Calculadora De objeto movel Uniformente variado");
		do {
			try {
				System.out.println("Digite um valor para posição inicial");
				Scanner s = new Scanner(System.in);
				pZero = s.nextDouble();
				
				System.out.println("Digite um valor para a velocidade");
				velocidade = s.nextDouble();
				
				System.out.println("Digite um valor para a aceleração");
				aceleracao = s.nextDouble();
				
				System.out.println("Digite um valor para a tempo");
				tempo = s.nextLong();
				

					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		pFinal = (pZero + (velocidade * tempo) + (aceleracao + Math.pow(tempo, 2))/2);
		
			
		System.out.println("O valor da posição final é: " + pFinal);
	}
}
