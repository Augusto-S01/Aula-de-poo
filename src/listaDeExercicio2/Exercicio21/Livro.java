package listaDeExercicio2.Exercicio21;

public class Livro {
	public static Long numeroDeLivros = 0l;
	
	private Long id;
	private String nome;
	private String autor;
	private String genero;
	
	public Livro(String nome, String autor, String genero) {

		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
		numeroDeLivros++;
		this.id =  numeroDeLivros;
	}

	public static Long getNumeroDeLivros() {
		return numeroDeLivros;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}
	
	@Override
	public String toString() {
		return "ID:" + id + "\n\n" + "NOME:" + nome + "\n\n" + "AUTOR:" + autor + "\n" + "GENERO:" + genero + "\n\n" ;		
	}
	
	
	
	
	
}
