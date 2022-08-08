package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio21 {

	public static void main(String[] args) {
		
//		21. Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
//		seu DELTA e também as raízes desta equação, imprimindo seus valores.
		
		Boolean valorValido = false;
		Float valorA = null;
		Float valorB = null;
		Float valorC = null;
		Double valorDelta = null;
		Double primeiraRaiz = null;
		Double segundaRaiz = null;
		
		
		System.out.println("Calculadora Equação de 2º Grau");
		do {
			try {
				System.out.println("Digite um valor para o A");
				Scanner s = new Scanner(System.in);
				valorA = s.nextFloat();
				
				System.out.println("Digite um valor para o B");
				valorB = s.nextFloat();
				
				System.out.println("Digite um valor para o C");
				valorC = s.nextFloat();
				

					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		valorDelta = (Math.pow(valorB, 2))-(4*valorA*valorC);
		if(valorDelta <= 0) {
			System.out.println("Delta negativo ou nulo , não é possivel calcular");
		}else {
			System.out.println("O valor do Delta é: " + valorDelta);
		}

		
		primeiraRaiz = (-valorB + Math.sqrt(valorDelta))/(2*valorA);
		segundaRaiz = (-valorB - Math.sqrt(valorDelta))/(2*valorA);
		
		
		System.out.println("O valor da primeira raiz é: " + primeiraRaiz);
		System.out.println("O valor da segunda raiz é " + segundaRaiz);
	}
	

}
