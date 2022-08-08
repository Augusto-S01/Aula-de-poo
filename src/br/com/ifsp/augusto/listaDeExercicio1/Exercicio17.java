package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio17 {

	public static void main(String[] args) {
//	17 Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
//	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
//	usu�rio forne�a um valor negativo, deve ser exibida uma mensagem e a opera��o de convers�o n�o deve ser efetuada.

		
		
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		if(valorSegundos <= 0) {
			System.out.println("Voc� inseriu um numero negativo, a convers�o nao sera feita");
		}else {
			valorHoras = valorSegundos / 3600;
			System.out.println(valorSegundos + " segundos em horas equivalem a: " + valorHoras);
		}
		
		
	}

}
