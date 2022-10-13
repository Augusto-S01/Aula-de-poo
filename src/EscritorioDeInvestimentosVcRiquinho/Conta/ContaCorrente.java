package EscritorioDeInvestimentosVcRiquinho.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Float dinheiro) {
		super(dinheiro);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ID: " + id + "\n" + "TIPO DE CONTA: CORRENTE \n Dinheiro na conta: " + dinheiro ;
		
	}
	

}
