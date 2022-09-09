package listaDeExercicio2.Exercicio21;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		ArrayList<Emprestimo> emprestimosFeitos = new ArrayList<>();
		
		popularListas(livrosDisponiveis,listaDePessoas);
		
		
		
		do {
			System.out.println("Sistema de emprestimo de livro");
			System.out.println("1-Faça um emprestimo de livro");
			System.out.println("2-Faça o cadastro de um livro");
			System.out.println("3-faça o cadastro de uma pessoa");
			System.out.println("4-faça a devolução de um livro");
			System.out.println("5-Liste os livros disponiveis");
			System.out.println("6-Liste os emprestimos feitos");
			System.out.println("0-finalizar o programa");
			
			
			try {
				Scanner s = new Scanner(System.in);
				opcao = s.nextInt();
				
			}catch(InputMismatchException e ) {
				opcao = 9999;
			}
			
			switch (opcao) {
			case 1: //1-Faça um emprestimo de livro
				
				emprestarLivro(livrosDisponiveis,listaDePessoas,emprestimosFeitos);
				break;
			case 2: //2-Faça o cadastro de um livro
				cadastrarLivro(livrosDisponiveis);
				break;
			case 3: //3-faça o cadastro de uma pessoa
				cadastrarPessoa(listaDePessoas);
				break;
				
			case 4: //4-faça a devolução de um livro
				devolverLivro(livrosDisponiveis,emprestimosFeitos);
				break;
			case 5: //5-Liste os livros disponiveis
				listaLivrosDisponiveis(livrosDisponiveis);
				break;
			case 6: //"6-Liste os emprestimos feitos"
				listaEmprestimos(emprestimosFeitos);
				break;
			case 7: //"7-Liste as pessoas cadastradas"
				listaPessoasCadastradas(listaDePessoas);
				break;
				
			case 0:
				break;
			

			default:
				System.out.println("Opção invalida tente novamente");
				break;
			}
			
			
			
			
		}while(opcao != 0);

	}

	private static void devolverLivro(ArrayList<Livro> livrosDisponiveis, ArrayList<Emprestimo> emprestimosFeitos) {
		if(emprestimosFeitos.size() == 0) {
			System.out.println("Não há emprestimos");
			pressioneEnter();
			return;
		}
		
		Boolean valido = true;
		Long idEmprestimo = null;
		Long posicaoEmprestimo = null;
		Scanner s = new Scanner(System.in);
		do {
			
			try {				
				System.out.println("Digite o id do emprestimo que você deseja devolver");
				idEmprestimo = s.nextLong();
				
				for(int i = 0; i < emprestimosFeitos.size();i++) {
					if(emprestimosFeitos.get(i).getId() == idEmprestimo) {
						posicaoEmprestimo = (long) i;
					};
				}
				
				if(Objects.isNull(posicaoEmprestimo)) {
					throw new Exception();
				}
				
				livrosDisponiveis.add(emprestimosFeitos.get(posicaoEmprestimo.intValue()).getLivro());
				emprestimosFeitos.remove(posicaoEmprestimo);
				
				System.out.println("Reposição feita com sucesso");
				pressioneEnter();
				
			}catch(Exception e) {
				System.out.println("Parece que você digitou algo de errado");
				valido = false;
			}
			
			
		}while(!valido);
		
	}

	private static void listaEmprestimos(ArrayList<Emprestimo> emprestimosFeitos) {
		if(emprestimosFeitos.size() == 0) {
			System.out.println("Não há emprestimos");
			pressioneEnter();
			return;
		}
		emprestimosFeitos.forEach( emprestimo -> {
			System.out.println(emprestimo.toString());
		});
		
	}

	private static void emprestarLivro(ArrayList<Livro> livrosDisponiveis, ArrayList<Pessoa> listaDePessoas,
			ArrayList<Emprestimo> emprestimosFeitos) {
		if(livrosDisponiveis.size() == 0) {
			System.out.println("Não há livros disponiveis");
			pressioneEnter();
			return;
		}
		Boolean valido = true;
		Long idLivro = null;
		Long posicaoLivro = null;
		Long idPessoa = null;
		Long posicaoPessoa = null;
		do {
			
			Scanner s = new Scanner(System.in);
			try {
				System.out.println("Digite o ID do livro desejado");
				idLivro = s.nextLong();
				for (int i = 0; i < livrosDisponiveis.size(); i++) {
					if(livrosDisponiveis.get(i).getId() == idLivro) {
						posicaoLivro = (long) i;
					}
				}
				System.out.println("Digite o ID da pessoa que vai fazer o emprestimo");
				idPessoa = s.nextLong();
				for(int i = 0; i < listaDePessoas.size(); i++) {
					if(listaDePessoas.get(i).getId() == idPessoa) {
						posicaoPessoa = (long) i;
					}
				}
			
			if(Objects.isNull(posicaoLivro) || Objects.isNull(posicaoPessoa)) {
				throw  new Exception();
			}
				
			Emprestimo emprestimo = new Emprestimo(listaDePessoas.get(posicaoPessoa.intValue()),livrosDisponiveis.get(posicaoLivro.intValue()));
			emprestimosFeitos.add(emprestimo);
			
			livrosDisponiveis.remove(posicaoLivro.intValue());
			System.out.println("Emprestimo feito com sucesso");
			pressioneEnter();
			valido = true;
				
			}catch(Exception e) {
				System.out.println("Parece q você digitou algo de errado vamos tentar dnv");
				System.out.println("");
				valido = false;
			}
		}while(!valido);
		
		
	}

	private static void cadastrarPessoa(ArrayList<Pessoa> listaDePessoas) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Boolean valido = true;
		String nome = null;
		String cpf = null;
		
		do {		
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o nome da pessoa");
				nome = s.next();
				
				
				System.out.println("Digite o cpf da pessoa");
				cpf = s.next();
				
			}catch(InputMismatchException e ) {
				System.out.println("Parece que você digitou algo errado vamos do começo");
				valido = false;
			};
		}while(!valido);
		
		Pessoa pessoa = new Pessoa(nome,cpf);
		listaDePessoas.add(pessoa);
		
	}

	private static void cadastrarLivro(ArrayList<Livro> livrosDisponiveis) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Boolean valido = true;
		String nome = null;
		String autor = null;
		String genero = null;
		
		do {		
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o nome do livro");
				nome = s.next();
				
				System.out.println("Agora digite o nome do autor");
				autor = s.next();
				
				System.out.println("Digite o genero do livro");
				genero = s.next();
				
			}catch(InputMismatchException e ) {
				System.out.println("Parece que você digitou algo errado vamos do começo");
				valido = false;
			};
		}while(!valido);
		
		Livro livro = new Livro(nome,autor,genero);
		livrosDisponiveis.add(livro);
	}
	

	private static void listaPessoasCadastradas(ArrayList<Pessoa> listaDePessoas) {
		if(listaDePessoas.size() == 0) {
			System.out.println("Não tem pessoas cadastradas");
			pressioneEnter();
			return;
		}
		listaDePessoas.forEach( pessoa -> {
			System.out.println(pessoa.toString());
			System.out.println("");
		});
		pressioneEnter();
		return;
		
	}

	private static void listaLivrosDisponiveis(ArrayList<Livro> livrosDisponiveis) {
		
		
		if(livrosDisponiveis.size() == 0) {
			System.out.println("Não há livros disponiveis");
			
			pressioneEnter();
			return;
		}
		livrosDisponiveis.forEach( livro -> {
			
			System.out.println(livro.toString());
			System.out.println("");
		});
		pressioneEnter();
		return;
		
	}

	private static void pressioneEnter() {
		System.out.println("Pressione enter para continuar");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	private static void popularListas(ArrayList<Livro> livrosDisponiveis, ArrayList<Pessoa> listaDePessoas) {
		Pessoa pessoa1 = new Pessoa("Miguel Oliveira","111.111.111.11");
		Pessoa pessoa2 = new Pessoa("Augusto Santos","222.222.222.22");
		Pessoa pessoa3 = new Pessoa("Antonio Carvalho","333.333.333.33");
		Pessoa pessoa4 = new Pessoa("Margarida Silveira","444.444.444.44");
		Pessoa pessoa5 = new Pessoa("Fernanda Pinto ","555.555.555.55");
		Pessoa pessoa6 = new Pessoa("Jorge da Silva","666.666.666.66");
		Pessoa pessoa7 = new Pessoa("Guilherme Gimente","777.777.777.77");
		Pessoa pessoa8 = new Pessoa("Victor Oliveira","888.888.888.88");
		Pessoa pessoa9 = new Pessoa("Augusto Gomes","999.999.999.99");
		
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		listaDePessoas.add(pessoa4);
		listaDePessoas.add(pessoa5);
		listaDePessoas.add(pessoa6);
		listaDePessoas.add(pessoa7);
		listaDePessoas.add(pessoa8);
		listaDePessoas.add(pessoa9);
		
		Livro livro1 = new Livro("Um robo comediante","Vinicius Medeiros","Humor");
		Livro livro2 = new Livro("O Dragão que falava ingles","Marcus Vinicius","ficção");
		Livro livro3 = new Livro("Ansiedade desgraç****","Augusto Thatcher","Psicologia");
		Livro livro4 = new Livro("De um trocado pro seu Bruxo","Geralt de rivia","Culinaria");
		Livro livro5 = new Livro("o lance do tempo","Ekko","Filosofia");
		Livro livro6 = new Livro("Dragões imaginarios","Imagine dragons","Musica");
		Livro livro7 = new Livro("titulo","autor","genero");
		Livro livro8 = new Livro("sem criatividade","Autor desconhecido","suspense");
		Livro livro9 = new Livro("não julgue um livro pelo seu titulo","isaac","suspense");
		Livro livro10 = new Livro("Magic in my bones","Augusto Thatcher","suspense");
		
		livrosDisponiveis.add(livro1);
		livrosDisponiveis.add(livro2);
		livrosDisponiveis.add(livro3);
		livrosDisponiveis.add(livro4);
		livrosDisponiveis.add(livro5);
		livrosDisponiveis.add(livro6);
		livrosDisponiveis.add(livro7);
		livrosDisponiveis.add(livro8);
		livrosDisponiveis.add(livro9);
		livrosDisponiveis.add(livro10);

		
	}
	
	
	

}
