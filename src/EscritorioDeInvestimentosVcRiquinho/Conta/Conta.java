package EscritorioDeInvestimentosVcRiquinho.Conta;

public abstract class Conta {
	public static Long numeroDeContas = 0L;
	protected Float dinheiro;
	protected Long id;
	
	
	public Conta(Float dinheiro ) {
		this.dinheiro = dinheiro;
		this.id = newID();

	}
	
	public Float getDinheiro() {
		return dinheiro;
	}
	
	private Long newID() {
		numeroDeContas++;
		return numeroDeContas;
	}
	
	
	public Long getId() {
		return id;
	}
	
}
