package EscritorioDeInvestimentosVcRiquinho.Cliente;

import java.util.ArrayList;

import EscritorioDeInvestimentosVcRiquinho.Conta.Conta;

public class PessoaJuridica extends Cliente {
	
	private String CNPJ;
	public final static Float taxaDeServico = 0.15f;
	
	
	public PessoaJuridica(String nome, String email, ArrayList<Conta> contas, String cNPJ) {
		super(nome, email, contas);
		CNPJ = cNPJ;
	}
	
	@Override
	public String toString() {
		return "ID: " + id +  "\n" + "TIPO DE CONTA: PESSOA JURIDICA" + "\n" + "NOME: " + nome + "\n" + "EMAIL: " + email + "\n" + "CPF: " + CNPJ;
		
	}
	
}
