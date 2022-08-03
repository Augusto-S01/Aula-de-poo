package br.com.ifsp.augusto.listaDeExercicio1.outraAlternativas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Alternativo {

	/**
		4. Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 100, imprimindo uma
		mensagem indicando que o "valor � maior que 100" ou uma mensagem indicando que o "valor � menor ou igual a 100".
	 *
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Boolean valorNaoAceito = false;
		
		String string1;
		Float float1 = null;
		Float valorComparado = 100f;
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


		if(float1 > valorComparado) {
			System.out.println("valor � maior que 100");
		}else {
			System.out.println("valor � menor ou igual a 100");
		}
		s.close();
	}

}
