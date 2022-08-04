package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/**
		6.Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, exibindo respostas
		F ou V para as seguintes quest�es:
		(a) A � maior que zero?
		(b) B � maior que zero;
		(c) A E B s�o maiores do que zero?
		Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores. **/
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		System.out.println("(A) || A � igual a zero?");
		if(valorA == 0) {
			System.out.println("Sim");
		}else {
			System.out.println("N�o");
		}
		
		System.out.println("B || B � menor que zero? ");
		if(valorB < 0) {
			System.out.println("Sim");
		}else {
			System.out.println("N�o");
		}
		
		System.out.println("C || A e B S�o maiores do que zero?");
		if(valorA > 0 && valorB > 0) {
			System.out.println("Sim");
		}
		else {
			System.out.println("N�o");
		}
		
		
	}

}
