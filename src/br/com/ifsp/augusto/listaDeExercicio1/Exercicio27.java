package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio27 {

	public static void main(String[] args) {
		
//		27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
//		nota.
		
		Boolean valorValido = false;
		Double nota = null;
		Long conterNota = 0L;
		Double soma = 0D;

		
		
		System.out.println("Calculadora infinita de media de aluno, digite as notas e digite um numero negativo para parar");
		do {
			try {
				Scanner s = new Scanner(System.in);
				nota = s.nextDouble();
						
				if(nota < 0 && nota > 10 ) {
					System.out.println("Você digitou uma nota maior que Dez ou que zero. acho q isso não é muito justo com seus alunos");
				}
				if(nota < 0) {
					System.out.println("Você digitou um numero negativo");
					valorValido = true;
				}else {					
					soma = nota + soma;
					conterNota++;
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("Você digitou algo que não é um numero tente novamente");
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		System.out.println("A media desse aluno com + " + conterNota + " avalições é "  + (soma/conterNota));
		
		
	}
}
