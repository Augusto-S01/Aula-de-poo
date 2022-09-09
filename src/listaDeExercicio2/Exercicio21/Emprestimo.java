package listaDeExercicio2.Exercicio21;

public class Emprestimo {
	public static Long numeroDeEmprestimos = 0l;
	
	private Long id;
	private Pessoa pessoa;
	private Livro livro;
	
	public Emprestimo(Pessoa pessoa, Livro livro) {
		super();
		this.pessoa = pessoa;
		this.livro = livro;
		numeroDeEmprestimos++;
		this.setId(numeroDeEmprestimos);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "ID:" + id + "\n" + "Pessoa: \n" + pessoa.toString() + "\n" + "Livro: \n" + livro.toString() ;		
	}
	
	
	
	
	
}
