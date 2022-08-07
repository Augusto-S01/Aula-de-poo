package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio12 {

	public static void main(String[] args) {
//		12 Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
//		fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
//		Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
//		101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.

		
		Boolean valorValido = false;
		Long valor = null;
		Double valorAPagar = null;
		System.out.println("Calculadora de preço de copos");
		System.out.println("Tabela de preços:");
		System.out.println("Na compra de 100 ou menos o copo sai por R$ 0.05");
		System.out.println("Na compra entre 101 e 500 o copo sai por R$ 0.04");
		System.out.println("Na compra superior a 500  o copo sai por R$ 0.035");
		
		do {
			try {
				System.out.println("Digite o numero de copos que deseja comprar");
				Scanner s = new Scanner(System.in);
				valor = s.nextLong();


				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		if(valor > 500) {
			System.out.println("Você esta pagando R$0.035 por Copo");
			valorAPagar =  valor * 0.035;
			System.out.println("O valor a pagar é de R$ " + valorAPagar);
		}else if(valor <= 500 && valor > 100 ){
			System.out.println("Você esta pagando R$0.04 por Copo");
			valorAPagar = valor * 00.4;
			System.out.println("O valor a pagar é de R$ " + valorAPagar);
		}else if(valor <= 100) {
			System.out.println("Você esta pagando R$0.05 por Copo");
			valorAPagar = valor * 00.5;
			System.out.println("O valor a pagar é de R$ " + valorAPagar);
		}
		
	}

}
