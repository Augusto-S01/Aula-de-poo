package listaDeExercicio2.Exercicio20;



import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	Agenda(){
		this.contatos = new ArrayList<Contato>();
	};
	

	public  void adicionar(Contato c){
		contatos.add(c);
		Collections.sort(contatos);
	};
	
	public static int menu(int opcao) {
		System.out.println("Digite uma opção");
		System.out.println("1-Adicionar contato");
		System.out.println("2-Ver contatos");
		System.out.println("3-Excluir contato");
		System.out.println("4-Sair");
		Boolean valorValido = true;
		int op = 0;
		do {
			Scanner s = new Scanner(System.in);
			
			try {
				op = s.nextInt();
				
				if(op < 0 || op > 4) {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor valido");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		return op;
		
	}

	public void novoContato() {
		Long id = (long) this.contatos.size()+1;
		Contato c = Contato.novoContato(id);
		this.adicionar(c);
		Collections.sort(contatos);
		
	}


	public void listarContatos() {
		//Collections.sort(contatos);
		contatos.forEach(  contato -> {
			System.out.println();
			System.out.println("------------------------");
			System.out.println("ID     " + contato.getId());
			System.out.println("NOME  : " + contato.getNome());
			System.out.println("NUMERO: " + contato.getNumero());
		});
		
	}

	public void excluirContato() {
		Boolean valorValido = true;
		do {
			Scanner s = new Scanner(System.in);
			
			try {
				System.out.println("Digite o id do usuario que você vai excluir");
				Long numero = s.nextLong();
				
				contatos.removeIf( c -> c.getId() == numero);
				
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor valido");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		
		
		
		
	}


	
}
