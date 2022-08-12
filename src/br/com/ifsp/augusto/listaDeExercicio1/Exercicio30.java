package br.com.ifsp.augusto.listaDeExercicio1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio30 {

	public static void main(String[] args) {
		
//		30.Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
//		os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
//		de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. 
		
		Boolean valorValido = false;

		Long a = null;
		Long b = null;
		Long xMax = null;
		Long xMin = null;
		Long passo = null;
		

		
		
		System.out.println("Calculadora do valor x em função da formula f(x)=a*x+b");
		
		do {
			try {
				System.out.println();
				System.out.println("Digite um valor para o [a]");
				Scanner s = new Scanner(System.in);
				a = s.nextLong();
				
				System.out.println("Digite m valor para o [b]");
				b = s.nextLong();
				
				System.out.println("Digite um maximo para [x]");
				xMax = s.nextLong();
				
				System.out.println("Digite um minimo1 para [x]");
				xMin = s.nextLong();
				
				if(xMax < xMin) {
					throw new ArithmeticException();
				}
				
				System.out.println("Digite o passo de X");
				passo = s.nextLong();				
						
				
				valorValido=true;
				
			} catch (InputMismatchException e) {
				System.out.println("Voc� digitou valor invalido vamos recomeçar");
			}catch(ArithmeticException e) {
				System.out.println("O valor minimo é maior do que o maximo");
				valorValido=false;
			}
			catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		for(Long i = 0L;i<30;i++)
			System.out.println();

		System.out.println("formula f(x)=a*x+b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("xMin = " + xMin);
		System.out.println("xMax = " + xMax);
		System.out.println("passo = " + passo);
		
		System.out.println();
		System.out.println("F(X)  ||   X");
		
		for(Long i = xMin ;i<xMax;i = i + passo) {
			Long y = (a*i)+b;
			System.out.println(y + "     ||      " + i);
		}

		
		
		
		
	}
}
