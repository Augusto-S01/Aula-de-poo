package listaDeExercicio2.Exercicio19;

import java.util.Arrays;
import java.util.List;

public class Exercicio19 {
//	19. Identifique	 as	 classes	 e	 implemente	 um	 programa	 para	 a	 seguinte	 especificação:	 “O	
//	supermercado	 vende	 diferentes	 tipos	 de	 produtos.	 Cada	 produto	 tem	 um	 preço	 e	 uma	
//	quantidade	em	estoque.	Um	pedido	de	um	cliente	é	composto	de	itens,	onde	cada	item	
//	especifica	o	produto	que	o	cliente	deseja	e	a	respectiva	quantidade. Esse	pedido	pode	ser	
//	pago	em	dinheiro,	cheque	ou	cartão.”

	public static void main(String[] args) {
		//Criando produtos
		
		Produto mouse = new Produto("Mouse com rgb" , 49.99F ,50L );
		Produto teclado = new Produto("Teclado com mais rgb ainda" , 80F ,77L );
		Produto monitor = new Produto("Monitor Desnecessariamente grande" , 49.99F ,50L );
		Produto mousepad = new Produto("Mousepad em formato de livro" , 14.99F ,10L );
		
		Item item1 = new Item(mouse,2l,Pagamento.DINHEIRO);
		Item item2 = new Item(monitor,1l,Pagamento.CARTAO);
		
		
		List<Item> itens = Arrays.asList(item1,item2);
		Pedido pedido1 = new Pedido("Jorge",itens);
	}

}
