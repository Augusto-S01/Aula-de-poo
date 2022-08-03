package br.com.ifsp.augusto.listaDeExercicio1.outraAlternativas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2Alternativo {

	/**
	 *	2.Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada.
		Imprima o valor lido. 
	 *
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Boolean valorNaoAceito = false;
		
		String string1;
		Float float1 = null;
		do {
			valorNaoAceito = true;
			try {
				System.out.println("Digite um numero real:");
				NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt","BR"));
				string1 = s.next();
				float1 = nf.parse(string1).floatValue();
				
				if(string1.contains(".")) {
					System.out.println("Digite o separador com virgula");
					valorNaoAceito = false;
				}
			} catch (ParseException e) {
				System.out.println("ERRO | DIGITE APENAS UM NUMERO REAL");
				valorNaoAceito = false;
			}
			
			
		
		} while (!valorNaoAceito);
		System.out.println("O valor digitado é: " + float1);
		s.close();
	}

}
