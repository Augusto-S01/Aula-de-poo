package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio24 {

	public static void main(String[] args) {
		
//		24. Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo usu�rio.
//		a) Usando enquanto (while)
//		b) Usando fa�a-enquanto (do-while)
//		c) Usando para (for)
//		Obs. Caso o valor dado seja inv�lido o programa deve apenas exibir uma mensagem de aviso.
		
		Boolean valorValido = false;
		Long n = null;

		
		
		System.out.println("Tabuada com while , do-while e for");
		do {
			try {
				System.out.println("Digite um numero inteiro de 1 a 20");
				Scanner s = new Scanner(System.in);
				n = s.nextLong();
						
				valorValido = true;
				
				if(n < 1 && n >20) {
					System.out.println("Voc� digitou um numero invalido, vamos recome�ar...");
					valorValido = false;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		Long cont = 1L;
		
		System.out.println("==========================================");
		System.out.println("Com While");
		while(cont < 11) {
			System.out.println(n + " * " + cont + " = " + n*cont);
			cont ++;
		}
		System.out.println("==========================================");
		
		cont = 1l;
		System.out.println("Do while");
		do {
			System.out.println(n + " * " + cont + " = " + n*cont);
			cont ++;
		}while(cont <= 10);
		
		
		System.out.println("============================================");
		System.out.println("for");
		for(cont = 1l; cont <= 10 ; cont++) {
			System.out.println(n + " * " + cont + " = " + n*cont);
		}
		
	}
}
