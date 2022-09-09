package listaDeExercicio2.Exercicio20;


public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bem vindo a agenda em java");
		Agenda agenda = new Agenda();
		

		int opcao = 420;
		
		do {
			opcao = Agenda.menu(opcao);
			switch (opcao) {
			case 1:
				agenda.novoContato();
				break;
			case 2:
				agenda.listarContatos();
				break;
			case 3:
				agenda.excluirContato();
				break;
			}
			
		}while(opcao != 0);
		
		
	}
}
