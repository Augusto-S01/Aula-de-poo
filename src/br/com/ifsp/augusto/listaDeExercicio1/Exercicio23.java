package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio23 {

	public static void main(String[] args) {
		
//		23.Escreva um programa que receba as seguintes informa��es: um valor real indicando capital inicial PV, um valor real que
//		corresponde a taxa de juros da aplica��o J e um n�mero inteiro de per�odos da aplica��o N. O programa deve retornar o
//		capital futuro FV dado pela rela��o abaixo:
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
				
				System.out.println("Digite um numero inteiro para os periodos de aplica��o");
				n = s.nextLong();
				
					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
//		FV = PV * ( 1 + J )N
		fv = pv * ((1 + j)*n);
		
			
		System.out.println("O capital futuro � : " + fv);
	}
}
