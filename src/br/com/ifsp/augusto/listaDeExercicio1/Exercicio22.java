package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio22 {

	public static void main(String[] args) {
		
//		23 considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
//		informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
//		V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
//		T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
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
				System.out.println("Digite um valor para posi��o inicial");
				Scanner s = new Scanner(System.in);
				pZero = s.nextDouble();
				
				System.out.println("Digite um valor para a velocidade");
				velocidade = s.nextDouble();
				
				System.out.println("Digite um valor para a acelera��o");
				aceleracao = s.nextDouble();
				
				System.out.println("Digite um valor para a tempo");
				tempo = s.nextLong();
				

					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		pFinal = (pZero + (velocidade * tempo) + (aceleracao + Math.pow(tempo, 2))/2);
		
			
		System.out.println("O valor da posi��o final �: " + pFinal);
	}
}
