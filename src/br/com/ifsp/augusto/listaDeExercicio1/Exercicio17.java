package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio17 {

	public static void main(String[] args) {
//	17 Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
//	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
//	usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada.

		
		
		Boolean valorValido = false;
		Float valorSegundos = null;
		Float valorHoras = null;
		System.out.println("Calculadora de area de triangulos");
		do {
			try {
				System.out.println("Digite um valor para a base");
				Scanner s = new Scanner(System.in);
				valorSegundos = s.nextFloat();
				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		if(valorSegundos <= 0) {
			System.out.println("Você inseriu um numero negativo, a conversão nao sera feita");
		}else {
			valorHoras = valorSegundos / 3600;
			System.out.println(valorSegundos + " segundos em horas equivalem a: " + valorHoras);
		}
		
		
	}

}
