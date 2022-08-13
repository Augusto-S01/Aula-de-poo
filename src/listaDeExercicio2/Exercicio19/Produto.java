package listaDeExercicio2.Exercicio19;

public class Produto {
	private String nome;
	private Float preco;
	private Long emEstoque;
	
	public Produto(String nome, Float preco, Long emEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.emEstoque = emEstoque;
	}

	public String getNome() {
		return nome;
	}

	public Float getPreco() {
		return preco;
	}

	public Long getEmEstoque() {
		return emEstoque;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public void diminuirEstoque (Long qtd) {
		//OBS - o correto seria jogar uma exception aqui
		if(qtd < 0) return;
		this.emEstoque =- qtd;
	}
	
	public void aumentarEstoque (Long qtd) {
		//OBS - o correto seria jogar uma exception aqui
		if(qtd < 0 ) return;
		this.emEstoque =+ qtd;
	}
	
	
	
}
