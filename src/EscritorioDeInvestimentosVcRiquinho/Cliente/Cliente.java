package EscritorioDeInvestimentosVcRiquinho.Cliente;

import java.util.ArrayList;

import EscritorioDeInvestimentosVcRiquinho.Conta.Conta;

public abstract class Cliente {
	public static Long numeroDeClientes = 0l;
	
	protected Long id;
	protected String nome;
	protected String email;
	protected ArrayList<Conta> contas;
	
	public Cliente(String nome, String email, ArrayList<Conta> contas) {		
		this.nome = nome;
		this.email = email;
		this.contas = contas;
		this.id = newID();
	}

	private Long newID() {
		numeroDeClientes++;
		return numeroDeClientes;
	}
	
	public Long getId() {
		return id;
	}
	public ArrayList<Conta> getContas(){
		return contas;
	}
	

	
	
	
}
