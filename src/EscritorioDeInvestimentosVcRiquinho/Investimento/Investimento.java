package EscritorioDeInvestimentosVcRiquinho.Investimento;

public abstract class Investimento {

	public static Long numeroDeInvestimentos = 0l;
	
	private String nome;
	private String descricao;
	private Float rendimentoMensal;
	protected Long id;
	
	public Investimento(String nome, String descricao, Float rendimentoMensal) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.rendimentoMensal = rendimentoMensal;
		this.id = newID();
	}
	
	private Long newID() {
		numeroDeInvestimentos++;
		return numeroDeInvestimentos;
	}
	
	public Long getID() {
		return id;
	}

	public static Long getNumeroDeInvestimentos() {
		return numeroDeInvestimentos;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Float getRendimentoMensal() {
		return rendimentoMensal;
	}

	public Long getId() {
		return id;
	}

	public static void setNumeroDeInvestimentos(Long numeroDeInvestimentos) {
		Investimento.numeroDeInvestimentos = numeroDeInvestimentos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setRendimentoMensal(Float rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
	

	
}
