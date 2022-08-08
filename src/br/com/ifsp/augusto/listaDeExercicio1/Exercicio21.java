package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio21 {

	public static void main(String[] args) {
		
//		21. Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
//		seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores.
		
		Boolean valorValido = false;
		Float valorA = null;
		Float valorB = null;
		Float valorC = null;
		Double valorDelta = null;
		Double primeiraRaiz = null;
		Double segundaRaiz = null;
		
		
		System.out.println("Calculadora Equa��o de 2� Grau");
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		valorDelta = (Math.pow(valorB, 2))-(4*valorA*valorC);
		if(valorDelta <= 0) {
			System.out.println("Delta negativo ou nulo , n�o � possivel calcular");
		}else {
			System.out.println("O valor do Delta �: " + valorDelta);
		}

		
		primeiraRaiz = (-valorB + Math.sqrt(valorDelta))/(2*valorA);
		segundaRaiz = (-valorB - Math.sqrt(valorDelta))/(2*valorA);
		
		
		System.out.println("O valor da primeira raiz �: " + primeiraRaiz);
		System.out.println("O valor da segunda raiz � " + segundaRaiz);
	}
	

}
