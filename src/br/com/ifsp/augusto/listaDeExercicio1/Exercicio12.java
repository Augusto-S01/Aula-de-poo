package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio12 {

	public static void main(String[] args) {
//		12 Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos. O usu�rio deve
//		fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.
//		Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre
//		101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035.

		
		Boolean valorValido = false;
		Long valor = null;
		Double valorAPagar = null;
		System.out.println("Calculadora de pre�o de copos");
		System.out.println("Tabela de pre�os:");
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		if(valor > 500) {
			System.out.println("Voc� esta pagando R$0.035 por Copo");
			valorAPagar =  valor * 0.035;
			System.out.println("O valor a pagar � de R$ " + valorAPagar);
		}else if(valor <= 500 && valor > 100 ){
			System.out.println("Voc� esta pagando R$0.04 por Copo");
			valorAPagar = valor * 00.4;
			System.out.println("O valor a pagar � de R$ " + valorAPagar);
		}else if(valor <= 100) {
			System.out.println("Voc� esta pagando R$0.05 por Copo");
			valorAPagar = valor * 00.5;
			System.out.println("O valor a pagar � de R$ " + valorAPagar);
		}
		
	}

}
