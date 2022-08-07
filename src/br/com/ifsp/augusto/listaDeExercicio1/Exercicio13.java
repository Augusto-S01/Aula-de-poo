package br.com.ifsp.augusto.listaDeExercicio1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio13 {

	public static void main(String[] args) {
//		13 Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
//		medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
//		tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
// 		(tr�s lados iguais).

		
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
				System.out.println("Erro voc� digitou um valor que n�o � valido, vamos recome�ar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);

		
		//verifica se � possivel um triangulo
		if(valorAB + valorBC < valorAC) {
			System.out.println("Soma de AB [" + valorAB + "] + BC [" + valorBC + "] � maior que AC [" + valorAC  +"] ") ;
			System.out.println("N�o � possivel formar um triangulo");
			System.exit(0);
		}
		if(valorBC + valorAC < valorAB) {
			System.out.println("Soma de BC [" + valorBC + "] + AC [" + valorAC + "] � maior que AB [" + valorAB  +"] ") ;
			System.out.println("N�o � possivel formar um triangulo");
			System.exit(0);
		}
		if(valorBC + valorAC < valorAB) {
			System.out.println("Soma de AC [" + valorAC + "] + AB [" + valorAB + "] � maior que BC [" + valorBC  +"] ") ;
			System.out.println("N�o � possivel formar um triangulo");
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
