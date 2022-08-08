package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//	17 Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
//	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
//	usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada.

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
		
		Boolean valorValido = false;
		Float valorFloat = null;
		Integer valor = null;

		String valorExtenso = "";
		
		System.out.println("Dinheiro por extenso");
		do {
			try {
				System.out.println("Digite um numero entre 0 a 100");
				Scanner s = new Scanner(System.in);
				valorFloat = s.nextFloat();
				
				
				
				valorValido = true;
				
				if(valorFloat < 0 || valorFloat >100) {
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
		
		valor = valorFloat.intValue();
		
		
		
		System.out.println("O numero digitado foi:");
		
		if(valor == 1) {
			valorExtenso += unidades.get(valor) + " real";
		}
		
		if(valor > 1 && valor < 10) {
			valorExtenso += unidades.get(valor) + " reais";
		}
		if(valor >= 10 && valor <= 20) {
			valorExtenso += numerosEspeciais.get(valor-10) + " reais";
		}
		if(valor > 20 && valor<=99) {
			String valorString = valor.toString();
			String dezenaString = valorString.charAt(0) + "";
			String unidadeString = valorString.charAt(1) + "";

			Integer dezena = Integer.valueOf(dezenaString);
			Integer unidade = Integer.valueOf(unidadeString);

			
			if(unidade == 0) {
				valorExtenso += dezenas.get(dezena-1) + " reais";
			}else {
				valorExtenso += dezenas.get(dezena-1) + " e " + unidades.get(unidade) + " reais" ;
			}
		}
		if(valor == 100) {
			valorExtenso += "Cem" + " reais";
		}
				


		if(valor - valorFloat != 0) {
			
			
			String centavosString = valorFloat.toString();
			Integer casaDaVirgula = centavosString.indexOf(".");
			
			
			if(centavosString.length() == 2) {
				centavosString = centavosString.substring(casaDaVirgula+1, casaDaVirgula+2);
			}else if(centavosString.length() == 3) {
				centavosString = centavosString.substring(casaDaVirgula+1, casaDaVirgula+2);			
			}else if(centavosString.length() == 4) {
				centavosString = centavosString.substring(casaDaVirgula+1, casaDaVirgula+3);			
			}else if(centavosString.length() == 5){
				centavosString = centavosString.substring(casaDaVirgula+1, casaDaVirgula+3);
			}
				
			
			if(centavosString.length() == 1)
				centavosString = centavosString + "0";
			
			
			Integer centavosInt = Integer.valueOf(centavosString);
			if(centavosInt == 1) {
				if(valor == 0) {
					valorExtenso += unidades.get(centavosInt) + " centavo";
				}else {
					valorExtenso += " e " + unidades.get(centavosInt) + " centavo";
				}		
			}
			
			
			if(centavosInt > 1 && centavosInt < 10) {
				if(valor == 0) {
					valorExtenso += unidades.get(centavosInt) + " centavo";
				}else {
					
					valorExtenso += " e  " + unidades.get(centavosInt) + "  centavo(s)";
				}
			}
			
			
			if(centavosInt >= 10 && centavosInt<= 20) {
				if(valor == 0) {
					valorExtenso +=  numerosEspeciais.get(centavosInt-10) + " Centavos";
				}else {
					valorExtenso +=  " e " + numerosEspeciais.get(centavosInt-10) + " Centavos";					
				}
			}
			
			if(centavosInt > 20 && centavosInt <=99) {
				centavosString = centavosInt.toString();
				String centavosDezenaString = centavosString.charAt(0) + "";
				String centavosUnidadeString = centavosString.charAt(1) + "";
				
				
				Integer centavoDezena = Integer.valueOf(centavosDezenaString);
				Integer centavoUnidade = Integer.valueOf(centavosUnidadeString);
				
				if(centavoUnidade == 0) {
					if(valor == 0) {
						valorExtenso += " e " + dezenas.get(centavoDezena-1) + " centavos";						
					}else {
						valorExtenso += dezenas.get(centavoDezena-1) + " centavos";						
					}
					
				}else {
					if(valor == 0) {
						valorExtenso += dezenas.get(centavoDezena-1) + " e " +  unidades.get(centavoUnidade) + " centavos";
					}else {
						valorExtenso += " e " + dezenas.get(centavoDezena-1) + " e " +  unidades.get(centavoUnidade) + " centavos";
					}
				}
			}
			
			
			
			
			
			
			
		}

		System.out.println(valorExtenso);
			

		
	}

}
