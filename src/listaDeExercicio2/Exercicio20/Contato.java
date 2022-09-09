package listaDeExercicio2.Exercicio20;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contato implements Comparable<Contato>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 497684144934533954L;
	Long id;
	String nome;
	Long numero;
	
	
	public Contato(Long id,String nome, Long numero) {
		this.id = id;
		this.nome = nome;
		this.numero = numero;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	static Contato novoContato(Long id) {
		
		
		Boolean valorValido = true;
		String nome = null;
		Long numero = null;
		do {
			Scanner s = new Scanner(System.in);
			
			try {
				System.out.println("Digite o nome do contato");
				nome = s.next();
				System.out.println("Digite o numero do contato | APENAS NUMEROS");
				numero = s.nextLong();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Você digitou um valor invalido, vamos recomeçar");
				valorValido = false;
			}catch(Exception e){
				System.out.println("Erro interno");
				System.exit(0);
			}
			
		} while (!valorValido);
		

		return new Contato(id,nome,numero);
	}
	
	public String getNome() {
		return nome;
	}


	public Long getNumero() {
		return numero;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
	}





	@Override
	public int compareTo(Contato o) {
		if(this.id < o.getId()) {
			return -1;
		}
		if(this.numero > o.getId()) {
			return 1;
		}
		return 0;
	};
	

	
	
	
}
