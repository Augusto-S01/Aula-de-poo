package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio20 {

	public static void main(String[] args) {
		
//		20.Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em p�s
//		(1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o usu�rio forne�a um valor negativo, deve ser exibida
//		uma mensagem e a opera��o de convers�o n�o deve ser efetuada.
		
		Boolean valorValido = false;
		Float valorMetros = null;
		Float valorPes = null;
		System.out.println("Converte metros em p�s");
		do {
			try {
				System.out.println("Digite um valor em metros");
				Scanner s = new Scanner(System.in);
				valorMetros = s.nextFloat();
				
				if(valorMetros < 0) {
					System.out.println("Voc� inseriu um numero negativo, a opera��o n�o sera realizada ");
					System.exit(0);
				}
					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		valorPes = valorMetros * 3.115F;
		System.out.println(valorMetros + " Metros equivalem � " + valorPes + " p�s");
		
		
	}

}
