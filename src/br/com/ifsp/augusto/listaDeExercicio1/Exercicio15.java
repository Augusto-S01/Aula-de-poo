package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio15 {

	public static void main(String[] args) {
//		15. Escreva um programa que realize as seguintes tarefas:
//			a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
//			b) Realize a soma dos valores x e y, exibindo seu resultado;
//			c) Realize o produto dos valores x e y exibindo seu resultado;
//			d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes.

		
		
		Boolean valorValido = false;
		Long valorX = null;
		Long valorY = null;
		
		Long soma = null;
		Long produto = null;
		do {
			try {
				System.out.println("Digite um valor inteiro para o X");
				Scanner s = new Scanner(System.in);
				valorX = s.nextLong();
				
				System.out.println("Digite um valor inteiro para o Y ");
				valorY = s.nextLong();
				
		
				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		soma = valorX + valorY;
		produto = valorX * valorY;
		
		
		System.out.println("A soma do X["+valorX+"] com Y["+valorY+"] é " + soma );
		System.out.println("O produto do X["+valorX+"] com Y["+valorY+"] é " + produto );
		
		if(valorX == valorY) {
			System.out.println("O Valor X é igual ao valor Y");
		}
		if(valorX > valorY) {
			System.out.println("O valor X é maior que o valor Y");
		}
		if(valorY > valorX) {
			System.out.println("O valor Y é maior que o valor X");
		}
		
		
	}

}
