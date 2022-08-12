package listaDeExercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/**
		4. Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto	
		comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo	
		número	de	unidades	compradas,	segundo	a	tabela	abaixo:	
			a. Até	10	unidades: valor	total
			b. de	11 a	20	unidades: 10%	de	desconto
			c. de	21	a	50	unidades: 20%	de	desconto
			d. acima	de	50	unidades: 25%	de	desconto
		 */

		String nome = null;
		Float preco = null;
		Long quantidade = null;
		Float total = null;
		Float desconto = null;
		
		System.out.println("Calculadora de desconto");
		do {
			Scanner s = new Scanner(System.in);			
			try {
				System.out.println("Digite o nome do produto");
				nome = s.next();
				
				System.out.println("Digite o preço do " + nome);
				preco = s.nextFloat();
				
				System.out.println("Digite a quantidade de " + nome + " comprados(as)");
				quantidade = s.nextLong();
				
				
				if(quantidade>50) {
					desconto = 0.25F;
				}else if( quantidade >= 21 && quantidade <= 50) {
					desconto = 0.20f;
				}else if(quantidade >= 11 && quantidade <= 20) {
					desconto = 0.10f;
				}else {
					desconto = 0f;
				}
				
				
				if(desconto == 0f) {
					total = quantidade*preco;
				}else {
					total = preco*quantidade;
				}
				System.out.println(nome + " x" + quantidade + " + R$" + preco + " = R$ " + total);
				
				
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.println("Proximo produto");
				
				
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (true);
		
		
		
	}

}
