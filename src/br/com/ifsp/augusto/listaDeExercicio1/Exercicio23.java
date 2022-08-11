package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio23 {

	public static void main(String[] args) {
		
//		23.Escreva um programa que receba as seguintes informações: um valor real indicando capital inicial PV, um valor real que
//		corresponde a taxa de juros da aplicação J e um número inteiro de períodos da aplicação N. O programa deve retornar o
//		capital futuro FV dado pela relação abaixo:
//		FV = PV * ( 1 + J )N
		
		Boolean valorValido = false;
		Double pv = null;
		Double j= null;
		Long n = null;
		Double fv = null;

		
		
		System.out.println("Calculadora da formula: FV = PV * ( 1 + J )N");
		do {
			try {
				System.out.println("Digite um numero real para o capital inicial");
				Scanner s = new Scanner(System.in);
				pv = s.nextDouble();
				
				System.out.println("Digite um numero real para  a taxa de juros");
				j = s.nextDouble();
				
				System.out.println("Digite um numero inteiro para os periodos de aplicação");
				n = s.nextLong();
				
					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
//		FV = PV * ( 1 + J )N
		fv = pv * ((1 + j)*n);
		
			
		System.out.println("O capital futuro é : " + fv);
	}
}
