package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio9 {

	public static void main(String[] args) {
//		9. Leia tr�s n�meros reais fornecidos pelo usu�rio. Descubra qual deles � o menor de todos, imprimindo seu valor.
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		List resultado = valores.stream().sorted().
                collect(Collectors.toList());
		
		System.out.println(resultado.get(0));
		
	}

}
