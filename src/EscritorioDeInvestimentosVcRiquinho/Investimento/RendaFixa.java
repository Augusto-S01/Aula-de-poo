package EscritorioDeInvestimentosVcRiquinho.Investimento;

public class RendaFixa extends Investimento {

	private Float carencia;

	public RendaFixa(String nome, String descricao, Float rendimentoMensal, Float carencia) {
		super(nome, descricao, rendimentoMensal);
		this.carencia = carencia;
	}

	public Float getCarencia() {
		return carencia;
	}

	public void setCarencia(Float carencia) {
		this.carencia = carencia;
	}
	
	

}
