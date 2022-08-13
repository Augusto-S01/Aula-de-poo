package listaDeExercicio2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio10 {

	public static void main(String[] args) {

//		10. Calcule o	retorno	de	um	investimento	financeiro fazendo	as	contas	m�s	a	m�s,	sem	usar	a	
//		f�rmula	 de	 juros	 compostos.	 O	 usu�rio	 deve	 informar	 quanto	 ser�	 investido	 por	 m�s	 e	
//		qual	ser�	a	taxa	de	juros	mensal.	O	programa	deve	informar	o	saldo	do	investimento	ap�s	
//		um	ano	(soma	das	aplica��es	m�s	a	m�s considerando	os juros	compostos),	e	perguntar	ao	
//		usu�rio	 se	 ele	 deseja	 que	 seja	 calculado	 o	 ano	 seguinte,	 sucessivamente.	 Por	 exemplo,	
//		caso	o	usu�rio	deseje	investir	R$	100,00	por	m�s,	e	tenha	uma	taxa	de	juros	de	1%	ao	m�s,	
//		o	programa	forneceria	a	seguinte	sa�da:

//		Saldo do investimento ap�s 1 ano: 1280.9328043328942
//		Deseja processar mais um ano? (S/N)

		Boolean valorValido = false;
		Double inv = null;
		Double j = null;

		System.out.println("Calculadora de investimento composto");
		do {
			try {
				System.out.println("Digite um numero real para o investimento inicial mensal");
				Scanner s = new Scanner(System.in);
				inv = s.nextDouble();

				System.out.println("Digite a taxa de juros:");
				System.out.println("Exemplo para 1% digite 0.01");
				j = s.nextDouble();

				valorValido = true;

			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			} catch (Exception e) {
				System.out.println("Erro interno");
				System.exit(0);
			}

		} while (!valorValido);

		Long ano = 0l;
		Boolean continuar = false;
		String alternativa = "";
		Double cf = 0d;
		do {
			ano++;
			valorValido = false;
			
			for (Long i = 1l; i <= 12; i++) {
				cf = (inv+cf)+((inv+cf)*j); 
			};
			
			System.out.println("Saldo do investimento ap�s "+ ano + " ano:  " + cf);
			System.out.println("Deseja processar mais um ano? (S/N)");
			do {
				try {
					Scanner s = new Scanner(System.in);
					alternativa = s.next();
					
				}catch (InputMismatchException e) {
					System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
					valorValido = false;
				}
				
				
				if( alternativa == "N" || alternativa == "n") {
					continuar = false;
					valorValido = true;
				}else if(alternativa == "S" || alternativa == "s") {
					continuar = true;
					valorValido = true;
				}else {
					valorValido = false;
				}
				
				
				
			}while(!valorValido == false);
			
			

		} while (continuar);

	}
}
