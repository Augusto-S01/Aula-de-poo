package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercicio8 {

	public static void main(String[] args) {
//		8. Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, imprimindo seu valor.
		Boolean valorValido = false;
		List<Float> valores = null;
		do {
			try {
				valores = new ArrayList<>();
				System.out.println("Digite um numero qualquer");
				Scanner s = new Scanner(System.in);
				valores.add(s.nextFloat());
				System.out.println("Certo Agora digite um segundo numero ");
				valores.add(s.nextFloat());
				System.out.println("Por fim agora digite o terceiro numero");
				valores.add(s.nextFloat());
				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		 Opitional<Float> listaOrganizada = valores.stream().sorted().
		
		System.out.println(listaOrganizada.get(0));
		
	}

}
