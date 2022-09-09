package listaDeExercicio2.Exercicio22;

public class Pessoa {
	public static Long numeroDePessoas = 0l;
	
	private Long id;
	private String nome;
	private Long idade;
	private Pessoa pai;
	private Pessoa mae;
	private Boolean jaEhMae;
	private Boolean jaEhPai;
	
	
	
	
	public Pessoa(String nome, Long idade) {
		this.nome = nome;
		this.idade = idade;
		numeroDePessoas++;
		this.id = numeroDePessoas;
	}



	public Long getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public Long getIdade() {
		return idade;
	}



	public Pessoa getPai() {
		return pai;
	}



	public Pessoa getMae() {
		return mae;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setIdade(Long idade) {
		this.idade = idade;
	}



	public void setPai(Pessoa pai) {
		this.pai = pai;
	}



	public void setMae(Pessoa mae) {
		this.mae = mae;
	}



	public Boolean getJaEhMae() {
		return jaEhMae;
	}



	public void setJaEhMae(Boolean jaEhMae) {
		this.jaEhMae = jaEhMae;
	}



	public Boolean getJaEhPai() {
		return jaEhPai;
	}



	public void setJaEhPai(Boolean jaEhPai) {
		this.jaEhPai = jaEhPai;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
