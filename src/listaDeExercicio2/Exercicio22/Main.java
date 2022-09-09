package listaDeExercicio2.Exercicio22;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long op = null;
		ArrayList<Pessoa> ldp = new ArrayList<Pessoa>();
		
		do {
			try {
				printMenu();
				Scanner s = new Scanner(System.in);
				op = s.nextLong();
				
				switch (op.intValue()) {
				case 1:
					cadastraPessoa(ldp);
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					break;

				default:
					System.out.println("Opção invalida");
					break;
				}
				
			}catch(Exception e) {
				System.out.println("Parece que você digitou algo errado vamos tentar dnv");
				op = null;
			}
		}while(op != 0);
		
	}

	private static void cadastraPessoa(ArrayList<Pessoa> ldp) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Boolean valido = true;
		String nome = null;
		Long idade = null;
		
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o nome da pessoa");
				nome = s.next();
				
				System.out.println("Agora digite a idade de " + nome);
				idade = s.nextLong();
				
				
			}catch(Exception e) {
				System.out.println("Paerc");
			}
		}while(!valido);
		
	}

	private static void printMenu() {
		System.out.println("1-Cadastre uma pessoa");
		System.out.println("2-Liste as pessoas cadastradas");
		System.out.println("3-Veja detalhes de uma pessoa pelo seu ID");
		System.out.println("0-delete uma pessoa");
	}

}
