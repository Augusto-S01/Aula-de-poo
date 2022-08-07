package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio13 {

	public static void main(String[] args) {
//		13 Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
//		medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
//		triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
// 		(três lados iguais).

		
		Boolean valorValido = false;
		Long valorAB = null;
		Long valorBC = null;
		Long valorAC = null;
		Double valorAPagar = null;
		System.out.println("Verificador de triangulos");

		
		do {
			try {
				System.out.println("Digite o tamanho da linha AB (somente numeros inteiros) ");
				Scanner s = new Scanner(System.in);
				valorAB = s.nextLong();
				
				System.out.println("Digite o tamanho da linha BC (somente numeros inteiros) ");
				valorBC = s.nextLong();
				
				System.out.println("Digite o tamanho da linha AC (somente numeros inteiros) ");
				valorAC = s.nextLong();
				
				
				
				
				
				
				


				
				valorValido = true;
				
			} catch (InputMismatchException e) {
				System.out.println("Erro você digitou um valor que não é valido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		
		//verifica se é possivel um triangulo
		if(valorAB + valorBC < valorAC) {
			System.out.println("Soma de AB [" + valorAB + "] + BC [" + valorBC + "] é maior que AC [" + valorAC  +"] ") ;
			System.out.println("Não é possivel formar um triangulo");
			System.exit(0);
		}
		if(valorBC + valorAC < valorAB) {
			System.out.println("Soma de BC [" + valorBC + "] + AC [" + valorAC + "] é maior que AB [" + valorAB  +"] ") ;
			System.out.println("Não é possivel formar um triangulo");
			System.exit(0);
		}
		if(valorBC + valorAC < valorAB) {
			System.out.println("Soma de AC [" + valorAC + "] + AB [" + valorAB + "] é maior que BC [" + valorBC  +"] ") ;
			System.out.println("Não é possivel formar um triangulo");
			System.exit(0);
		}
		
		
		
		
		//descobrir o tipo de tringulo
		
		if(valorAB == valorBC && valorAB == valorAC) {
			System.out.println("Os dados fornecidos formam um triangulo equilatero");
			System.exit(0);
		}
		
		
		if(valorAB != valorBC && valorAC != valorBC && valorAB != valorAC ) {
			System.out.println("Os dados fornecidos formam um triangulo esqualeno");
			System.exit(0);
		}
		
		System.out.println("Os dados fornecidos formam um triangulo iscosceles");
		
		
		
		
		
		
		
		
	}

}
