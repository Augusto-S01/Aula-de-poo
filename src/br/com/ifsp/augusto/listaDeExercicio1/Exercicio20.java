package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio20 {

	public static void main(String[] args) {
		
//		20.Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
//		(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
//		uma mensagem e a operação de conversão não deve ser efetuada.
		
		Boolean valorValido = false;
		Float valorMetros = null;
		Float valorPes = null;
		System.out.println("Converte metros em pés");
		do {
			try {
				System.out.println("Digite um valor em metros");
				Scanner s = new Scanner(System.in);
				valorMetros = s.nextFloat();
				
				if(valorMetros < 0) {
					System.out.println("Você inseriu um numero negativo, a operação não sera realizada ");
					System.exit(0);
				}
					
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		valorPes = valorMetros * 3.115F;
		System.out.println(valorMetros + " Metros equivalem á " + valorPes + " pés");
		
		
	}

}
