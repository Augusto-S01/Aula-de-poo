package EscritorioDeInvestimentosVcRiquinho.Conta;

import EscritorioDeInvestimentosVcRiquinho.Investimento.Investimento;

public class ContaInvestimentoAutomatico extends Conta {

	private Investimento investimento;
	

	public ContaInvestimentoAutomatico(Float dinheiro, Investimento investimento) {
		super(dinheiro);
		this.investimento = investimento;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n" + "TIPO DE CONTA: INVESTIMENTO AUTOMATICO \n Dinheiro na conta: " + dinheiro ;
		
	}

	public Investimento getInvestimento() {
		return investimento;
	}
	
	



	

}
