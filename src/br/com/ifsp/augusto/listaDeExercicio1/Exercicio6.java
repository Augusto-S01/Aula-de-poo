package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/**
		6.Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, exibindo respostas
		F ou V para as seguintes questões:
		(a) A é maior que zero?
		(b) B é maior que zero;
		(c) A E B são maiores do que zero?
		Use operadores lógicos para formular as expressões necessárias a avaliação dos valores. **/
		Boolean valorValido = false;
		Float valorA = null;
		Float valorB = null;
		do {
			try {
				System.out.println("Digite um numero qualquer");
				Scanner s = new Scanner(System.in);
				valorA = s.nextFloat();
				System.out.println("Certo Agora digite um segundo numero ");
				valorB = s.nextFloat();
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		System.out.println("(A) || A é igual a zero?");
		if(valorA == 0) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
		System.out.println("B || B é menor que zero? ");
		if(valorB < 0) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
		System.out.println("C || A e B São maiores do que zero?");
		if(valorA > 0 && valorB > 0) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		
		
	}

}
