package listaDeExercicio2.Exercicio19;

import java.util.List;

public class Pedido {
	private String cliente;
	private List<Item> itens;
	
	
	public Pedido(String cliente, List<Item> itens) {
		this.cliente = cliente;
		this.itens = itens;
		
		descontarEstoques();
	}


	public String getCliente() {
		return cliente;
	}
	
	
	public void adicionarItem(Item item) {
		this.itens.add(item);
		item.getProduto().diminuirEstoque(item.getQuantidade());
	}


	private void descontarEstoques() {
		itens.forEach( item -> {
			Produto produto = item.getProduto();
			produto.diminuirEstoque(item.getQuantidade());
		});
		
	}
	
}
