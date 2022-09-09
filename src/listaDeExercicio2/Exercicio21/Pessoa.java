package listaDeExercicio2.Exercicio21;

public class Pessoa {
	public static Long numeroDePessoas = 0l;
	
	private Long id;
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		numeroDePessoas++;
		this.id = numeroDePessoas;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "ID:" + id + "\n" + "NOME:" + nome + "\n" + "CPF:" + cpf;		
	}

	
	
}
