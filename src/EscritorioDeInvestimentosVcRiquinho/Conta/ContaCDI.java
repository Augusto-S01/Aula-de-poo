package EscritorioDeInvestimentosVcRiquinho.Conta;

import java.util.Scanner;

public class ContaCDI extends Conta {

	public static final Float taxaDeServico = 0.07f;

	public ContaCDI(Float dinheiro) {
		super(dinheiro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n" + "TIPO DE CONTA: CDI \n Dinheiro na conta: " + dinheiro ;
		
	}
	

}
