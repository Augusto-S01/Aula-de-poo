package listaDeExercicio2.Exercicio19;

public class Item {
	private Produto produto;
	private Long quantidade;
	private Pagamento pagamento;
	
	
	public Item(Produto produto, Long quantidade, Pagamento pagamento) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.pagamento = pagamento;
	}


	public Produto getProduto() {
		return this.produto;
	}
	
	public Long getQuantidade() {
		return this.quantidade;
	}


	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
}
