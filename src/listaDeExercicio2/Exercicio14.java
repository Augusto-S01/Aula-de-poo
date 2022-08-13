package listaDeExercicio2;

import java.util.LinkedList;
import java.util.Random;

public class Exercicio14 {

	public static void main(String[] args) {

//		14. Crie	 dois	 vetores	 de	 50	 posições	 com	 valores	 inteiros	 aleatórios,	 ordene	 cada	 vetor	
//		individualmente,	e	 combine	 os	 dois	vetores	gerando	 um	 novo	vetor	 de	 100	 posições,	 de	
//		forma	que	esse	novo	vetor	já	seja	criado	ordenado.	
		
		Integer[] vetor1 = new Integer[50];
		Integer[] vetor2 = new Integer[50];

		
		
        Random gerador = new Random();

        
        for (int i = 0; i < 50; i++) {
            vetor1[i] = gerador.nextInt();
            vetor2[i] = gerador.nextInt();
        }
        
        LinkedList<Integer> lista = new LinkedList<>();
        
        for(int i = 0;i < 50 ; i++) {
        	lista.add(vetor1[i]);
        	lista.add(vetor2[i]);
        }
        
        lista.sort(null);
        Integer[] vetorFinalOrganizado = new Integer[100];
        for(int i = 0; i < 100; i++) {
        	vetorFinalOrganizado[i] = lista.get(i);
        }
        
        for(int i = 0; i < 100 ; i++) {
        	System.out.println(i+1 + "º elemento:" + vetorFinalOrganizado[i]);
        }
        
        
        
      
		
		
	}
}
