package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//	17 Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
//	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
//	usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada.

		
		
		Boolean valorValido = false;
		Integer valor = null;
		List<String> unidades = new ArrayList<>(Arrays.asList(
				"Zero",
				"Um",
				"Dois",
				"Três",
				"Quatro",
				"Cinco",
				"Seis",
				"Sete",
				"Oito",
				"Nove"));
		
		List<String> dezenas = new ArrayList<>(Arrays.asList(
				"Dez",
				"Vinte",
				"Trina",
				"Quarenta",
				"Cinquenta",
				"Sessenta",
				"Setenta",
				"Oitenta",
				"Noventa"
				));
		
		List<String> numerosEspeciais = new ArrayList<>(Arrays.asList(
				"Dez",
				"Onze",
				"Doze",
				"Treze",
				"Quatorze",
				"Quinze",
				"Dezesseis",
				"Dezessete",
				"Dezoito",
				"Dezenove",
				"Vinte"
				));
		
		
		System.out.println("Numero por extenso");
		do {
			try {
				System.out.println("Digite um numero inteiro entre 0 a 100");
				Scanner s = new Scanner(System.in);
				valor = s.nextInt();
				
				
				
				valorValido = true;
				
				if(valor < 0 || valor >100) {
					System.out.println("O numero que você digitou é invalido");
					valorValido = false;
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println("O numero digitado foi:");
		
		if(valor < 10) {
			System.out.println(unidades.get(valor));
			
		}
		if(valor >= 10 && valor <= 20) {
			System.out.println(numerosEspeciais.get(valor-10));
		}
		if(valor > 20 && valor<=99) {
			
			String valorString = valor.toString();
			String dezenaString = valorString.charAt(0) + "";
			String unidadeString = valorString.charAt(1) + "";

			Integer dezena = Integer.valueOf(dezenaString);
			Integer unidade = Integer.valueOf(unidadeString);

			
			
			System.out.println(dezenas.get(dezena-1) + " e " + unidades.get(unidade));
		}
		if(valor == 100) {
			System.out.println("Cem");
		}
		
	}

}
