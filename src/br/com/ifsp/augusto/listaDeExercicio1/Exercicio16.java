package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio16 {

	public static void main(String[] args) {
//	16 Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
//	sabendo que o cálculo da área é dado por:

		
		
		Boolean valorValido = false;
		Float valorBase = null;
		Float valorAltura = null;
		
		Float area = null;
		System.out.println("Calculadora de area de triangulos");
		do {
			try {
				System.out.println("Digite um valor para a base");
				Scanner s = new Scanner(System.in);
				valorBase = s.nextFloat();
				
				System.out.println("Digite um valor para altura ");
				valorAltura = s.nextFloat();
				
		
				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		area = (valorBase*valorAltura)/2;
		System.out.println("O valor da area do triangulo com os dados fornecidos é: " + area);
	}

}
