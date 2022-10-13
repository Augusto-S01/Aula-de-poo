package EscritorioDeInvestimentosVcRiquinho.Cliente;

import java.util.ArrayList;

import EscritorioDeInvestimentosVcRiquinho.Conta.Conta;

public class PessoaFisica extends Cliente {

	private String cpf;
	public static final Float taxaDeServico = 0.1f;

	public PessoaFisica(String nome, String email, ArrayList<Conta> contas, String cpf) {
		super(nome, email, contas);
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "ID: " + id +  "\n" + "TIPO DE CONTA: PESSOA FISICA" + "\n" + "NOME: " + nome + "\n" + "EMAIL: " + email + "\n" + "CPF: " + cpf;
		
	}
	

}
