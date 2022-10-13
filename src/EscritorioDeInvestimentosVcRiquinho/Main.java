package EscritorioDeInvestimentosVcRiquinho;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import EscritorioDeInvestimentosVcRiquinho.Cliente.Cliente;
import EscritorioDeInvestimentosVcRiquinho.Cliente.PessoaFisica;
import EscritorioDeInvestimentosVcRiquinho.Cliente.PessoaJuridica;
import EscritorioDeInvestimentosVcRiquinho.Conta.Conta;
import EscritorioDeInvestimentosVcRiquinho.Conta.ContaCDI;
import EscritorioDeInvestimentosVcRiquinho.Conta.ContaCorrente;
import EscritorioDeInvestimentosVcRiquinho.Conta.ContaInvestimentoAutomatico;
import EscritorioDeInvestimentosVcRiquinho.Investimento.Investimento;
import EscritorioDeInvestimentosVcRiquinho.Investimento.RendaFixa;
import EscritorioDeInvestimentosVcRiquinho.Investimento.RendaVariavel;

@SuppressWarnings("resource")
public class Main {

	public static void main(String[] args) {
		
		sistema();

	}

	private static void sistema() {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Conta> contas = new ArrayList<>();
		ArrayList<Investimento> investimentos = new ArrayList<>();
		int op = 0;
		do {
			try {
				Scanner s = new Scanner(System.in);
				printMenuSistema();
				op = s.nextInt();
				escolhaMenuSistema(op,clientes,contas,investimentos);
				
				
			}catch(InputMismatchException e) {
				System.out.println("Opção invalida");
			}
			
		}while(op != 0);
		
	}

	private static void escolhaMenuSistema(int op, ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		switch (op) {
		case 1:
			adicionarCliente(clientes,contas,investimentos);
			break;
		case 2:
			adicionarConta(clientes,contas,investimentos);
			break;
		case 3: 
			listarClientes(clientes);
			break;
		case 4:
			listarContas(contas);
			break;
		case 5:
			deletarContas(clientes,contas);
			break;
		case 6:
			deletarClientes(clientes,contas);
			break;
		case 7:
			simularLucros(clientes,contas);
			break;
		case 8:
			adicionarInvestimento(investimentos);
			break;
		case 9:
			listarInvestimentos(investimentos);
			break;
		case 10:
			deletarInvestimento(investimentos,contas);
			break;
		case 11:
			calcularInvestimento(clientes,contas,investimentos);  
		case 0:
			break;
		default:
			throw new InputMismatchException();
		}
		
	}
	
	private static void calcularInvestimento(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos) {
		
		Boolean valido = false;
		do {
			try {
				System.out.println("Esolha uma opção");
				printMenuRendimento();
				Scanner s = new Scanner(System.in);
				int op = s.nextInt();
				System.out.println("Qual sera o valor da CDI?");
				Float CDI = s.nextFloat();
				
				escolhaCalcularRendimento(clientes,contas,investimentos,op,CDI);
				
			}catch(InputMismatchException e) {
				
			}
		}while(!valido);
 		
		
	}

	private static void escolhaCalcularRendimento(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos,int op, Float CDI) {
		switch (op) {
		case 1: //30 dias
			calcular30dias(clientes,contas,investimentos,CDI);
			break;
		case 2: //60 dias
			calcular60dias(clientes,contas,investimentos,CDI);
			break;
		case 3: //90 dias
			calcular90dias(clientes,contas,investimentos,CDI);
			break;
		case 4: //180 dias
			calcular180dias(clientes,contas,investimentos,CDI);
			break;
		default:
			throw new InputMismatchException();
			
		}
		
	}

	private static void calcular180dias(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos, Float CDI) {
Float rendimento = 0f;
		
		for(int i = clientes.size(); i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			Float taxaDeServico;
			if(cliente instanceof PessoaFisica) {
				taxaDeServico = PessoaFisica.taxaDeServico;
			}else {
				taxaDeServico = PessoaJuridica.taxaDeServico;	
			}
			
			
			for(int j = cliente.getContas().size(); j < cliente.getContas().size(); j++) {
				Conta conta = cliente.getContas().get(j);
				if(conta instanceof ContaCorrente) {
					rendimento =+ (conta.getDinheiro()*taxaDeServico);
				}else if(conta instanceof ContaCDI) {
					Float lucroDaConta = conta.getDinheiro()*(CDI/30);
					rendimento =+ (lucroDaConta+conta.getDinheiro())*taxaDeServico;
				}else if(conta instanceof ContaInvestimentoAutomatico) {
					Investimento investimento = ((ContaInvestimentoAutomatico) conta).getInvestimento();
					
					if(investimento instanceof RendaFixa) {
						if(((RendaFixa) investimento).getCarencia() < 180) {
							System.out.println("Carencia de conta Investimento Automatico de ID: "+ conta.getId() + "Não está valida ainda" );
							System.out.println("Será desconsiderada");
						}else {
							rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*6)+conta.getDinheiro()*taxaDeServico;
						}
						
					}else {
						//rendaVariavel
						rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*6)+conta.getDinheiro()*taxaDeServico;
					}
				}
			}
		
		}
		
	}

	private static void calcular90dias(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos, Float CDI) {
Float rendimento = 0f;
		
		for(int i = clientes.size(); i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			Float taxaDeServico;
			if(cliente instanceof PessoaFisica) {
				taxaDeServico = PessoaFisica.taxaDeServico;
			}else {
				taxaDeServico = PessoaJuridica.taxaDeServico;	
			}
			
			
			for(int j = cliente.getContas().size(); j < cliente.getContas().size(); j++) {
				Conta conta = cliente.getContas().get(j);
				if(conta instanceof ContaCorrente) {
					rendimento =+ (conta.getDinheiro()*taxaDeServico);
				}else if(conta instanceof ContaCDI) {
					Float lucroDaConta = conta.getDinheiro()*(CDI/30);
					rendimento =+ (lucroDaConta+conta.getDinheiro())*taxaDeServico;
				}else if(conta instanceof ContaInvestimentoAutomatico) {
					Investimento investimento = ((ContaInvestimentoAutomatico) conta).getInvestimento();
					
					if(investimento instanceof RendaFixa) {
						if(((RendaFixa) investimento).getCarencia() < 90) {
							System.out.println("Carencia de conta Investimento Automatico de ID: "+ conta.getId() + "Não está valida ainda" );
							System.out.println("Será desconsiderada");
						}else {
							rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*3)+conta.getDinheiro()*taxaDeServico;
						}
						
					}else {
						//rendaVariavel
						rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*3)+conta.getDinheiro()*taxaDeServico;
					}
				}
			}
		
		}
		
	}

	private static void calcular60dias(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos, Float CDI) {
		Float rendimento = 0f;
		
		for(int i = clientes.size(); i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			Float taxaDeServico;
			if(cliente instanceof PessoaFisica) {
				taxaDeServico = PessoaFisica.taxaDeServico;
			}else {
				taxaDeServico = PessoaJuridica.taxaDeServico;	
			}
			
			
			for(int j = cliente.getContas().size(); j < cliente.getContas().size(); j++) {
				Conta conta = cliente.getContas().get(j);
				if(conta instanceof ContaCorrente) {
					rendimento =+ (conta.getDinheiro()*taxaDeServico);
				}else if(conta instanceof ContaCDI) {
					Float lucroDaConta = conta.getDinheiro()*(CDI/30);
					rendimento =+ (lucroDaConta+conta.getDinheiro())*taxaDeServico;
				}else if(conta instanceof ContaInvestimentoAutomatico) {
					Investimento investimento = ((ContaInvestimentoAutomatico) conta).getInvestimento();
					
					if(investimento instanceof RendaFixa) {
						if(((RendaFixa) investimento).getCarencia() < 60) {
							System.out.println("Carencia de conta Investimento Automatico de ID: "+ conta.getId() + "Não está valida ainda" );
							System.out.println("Será desconsiderada");
						}else {
							rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*2)+conta.getDinheiro()*taxaDeServico;
						}
						
					}else {
						//rendaVariavel
						rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal()*2)+conta.getDinheiro()*taxaDeServico;
					}
				}
			}
		
		}
		
	}

	private static void calcular30dias(ArrayList<Cliente> clientes, ArrayList<Conta> contas,
	ArrayList<Investimento> investimentos, Float CDI) {
		Float rendimento = 0f;
		
		for(int i = clientes.size(); i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			Float taxaDeServico;
			if(cliente instanceof PessoaFisica) {
				taxaDeServico = PessoaFisica.taxaDeServico;
			}else {
				taxaDeServico = PessoaJuridica.taxaDeServico;	
			}
			
			
			for(int j = cliente.getContas().size(); j < cliente.getContas().size(); j++) {
				Conta conta = cliente.getContas().get(j);
				if(conta instanceof ContaCorrente) {
					rendimento =+ (conta.getDinheiro()*taxaDeServico);
				}else if(conta instanceof ContaCDI) {
					Float lucroDaConta = conta.getDinheiro()*(CDI/30);
					rendimento =+ (lucroDaConta+conta.getDinheiro())*taxaDeServico;
				}else if(conta instanceof ContaInvestimentoAutomatico) {
					Investimento investimento = ((ContaInvestimentoAutomatico) conta).getInvestimento();
					
					if(investimento instanceof RendaFixa) {
						if(((RendaFixa) investimento).getCarencia() < 30) {
							System.out.println("Carencia de conta Investimento Automatico de ID: "+ conta.getId() + "Não está valida ainda" );
							System.out.println("Será desconsiderada");
						}else {
							rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal())+conta.getDinheiro()*taxaDeServico;
						}
						
					}else {
						//rendaVariavel
						rendimento+= (conta.getDinheiro()*investimento.getRendimentoMensal())+conta.getDinheiro()*taxaDeServico;
					}
				}
			}
		
		}
	}

	private static void printMenuRendimento() {
		System.out.println("1 - 30  dias");
		System.out.println("2 - 60  dias");
		System.out.println("3 - 90  dias");
		System.out.println("4 - 180 dias");
		
	}

	private static void printMenuSistema() {
		System.out.println("1 - adicionar um cliente");
		System.out.println("2 - adicionar uma conta ao cliente por ID");
		System.out.println("3 - listar clientes");
		System.out.println("4 - listar contas");
		System.out.println("5 - deletar conta por ID");
		System.out.println("6 - deletar cliente por ID");
		System.out.println("7 - simular lucros");
		System.out.println("8 - adicionar um investimento");
		System.out.println("9 - listar um investimento");
		System.out.println("10 - deletar um investimento por ID");
		System.out.println("11 - calcular investimentos");
		System.out.println("0 - sair");
		
	}

	private static void deletarInvestimento(ArrayList<Investimento> investimentos, ArrayList<Conta> contas) {
		
		if(investimentos.isEmpty()) {
			System.out.println("Não há investimentos cadastrados");
			return;
		}
		
		
		Boolean valido = false;
		do {
			try {
				Long id;
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o ID do investimento ou digite 0 para voltar");
				id = s.nextLong();
				
				if(id == 0) {
					return;
				}
				
				investimentos.forEach( i -> {
					if(id == i.getID()) {
						excluirInvestimento(investimentos,contas,id,i);
					}
				});
				valido = true;
				
			}catch(InputMismatchException e) {
				valido = false;
				
			}
		}while(!valido);
		
	}

	private static void excluirInvestimento(ArrayList<Investimento> investimentos, ArrayList<Conta> contas, Long id, Investimento investimento) {		
		Boolean existeConta = false;
		for (int i = 0; i < contas.size(); i++) {
			if(contas.get(i) instanceof ContaInvestimentoAutomatico) {
				if(((ContaInvestimentoAutomatico) contas.get(i)).getInvestimento().getID() == id) {
					System.out.println("Conta de id: " + contas.get(i).getId() +  "Contem esse investimento favor excluir ela antes de tentar excluir investimento");
					existeConta = true;
					break;
				}
			}
		}
		
		if(!existeConta) {
			investimentos.remove(investimento);
			System.out.println("Investimento removido com sucesso");
		}
		
	
		
	}

	private static void listarInvestimentos(ArrayList<Investimento> investimentos) {
		if(investimentos.isEmpty()) {
			System.out.println("Não há investimentos cadastrados!");
		}else {
			investimentos.forEach( i -> {
				System.out.println(i);
			});
		}
		
	}

	private static void adicionarInvestimento(ArrayList<Investimento> investimentos) {
		Boolean valido = false;
		int op;
		
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite a opção desejada");
				System.out.println("1 - Renda fixa");
				System.out.println("2 - Renda variavel");
				System.out.println("0 - voltar");
				op = s.nextInt();
				Investimento investimento;
				
				switch (op) {
				case 1:
					investimento = criarRendaFixa();
					investimentos.add(investimento);
					break;
				case 2:
					investimento = criarRendaVariavel();
					investimentos.add(investimento);
					break;
				case 0:
					return;
				default:
					throw new InputMismatchException();
				}
				investimentos.add(investimento);
				System.out.println("Investimento criado com sucesso");
				valido = true;
				
			}catch(InputMismatchException e) {
				valido = false;
				System.out.println("Ops tivemos um erro, vamos recomeçar");
			}
		}while(!valido);
		
	}

	private static RendaVariavel criarRendaVariavel() {
		Boolean valido = false;
		RendaVariavel investimento = null;
		String nome;
		String descricao;
		Float rendimentoMensal;
		
		
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o nome do investimento");
				nome = s.next();
				System.out.println("Digite a descrição do investimento");
				descricao = s.next();
				System.out.println("Digite o rendimento mensal");
				rendimentoMensal = s.nextFloat();
				
				investimento = new RendaVariavel(nome, descricao, rendimentoMensal);
			}catch(InputMismatchException e) {
				valido = false;
				System.out.println("Ops tivemos um erro, vamos recomeçar");
			}
		}while(!valido);
		
		return investimento;
	}

	private static RendaFixa criarRendaFixa() {
		Boolean valido = false;
		RendaFixa investimento = null;
		String nome;
		String descricao;
		Float rendaVariavel;
		Float carencia;
		
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o nome do investimento");
				nome = s.next();
				System.out.println("Digite a descrição do investimento");
				descricao = s.next();
				System.out.println("Digite o rendimento mensal");
				rendaVariavel = s.nextFloat();
				System.out.println("Digite a carencia");
				carencia = s.nextFloat();
				
				investimento = new RendaFixa(nome, descricao, rendaVariavel, carencia);
			}catch(InputMismatchException e) {
				valido = false;
				System.out.println("Ops tivemos um erro, vamos recomeçar");
			}
		}while(!valido);
		
		return investimento;
	}

	private static void simularLucros(ArrayList<Cliente> clientes, ArrayList<Conta> contas) {
		// TODO Auto-generated method stub
		
	}



	private static void deletarClientes(ArrayList<Cliente> clientes, ArrayList<Conta> contas) {
		
		if(clientes.isEmpty()) {
			System.out.println("Não há clientes cadastrados!");
			return;
		}
		
		
		
		Boolean valido = false;
		do {
			try {
				Long id;
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o ID do cliente ou digite 0 para voltar");
				id = s.nextLong();
				if(id == 0) {
					return;
				}
				
				clientes.forEach( c -> {
					if(c.getId() == id) {
						excluirCliente(c,clientes,contas);
					}
				});
				valido = true;
				
				
				
			}catch(InputMismatchException e) {
				System.out.println("Numero invalido tente novamente");
				valido = false;
			}
		}while(!valido);
		
	}

	private static void excluirCliente(Cliente c, ArrayList<Cliente> clientes, ArrayList<Conta> contas) {
		 ArrayList<Conta> contasDoCliente = c.getContas();
		 contasDoCliente.forEach( cdc -> {
			 System.out.println("conta de id: " + cdc.getId() + " removida com sucesso!");
			 contas.remove(cdc);
		 });
		 System.out.println("Cliente removido com sucesso!");
		 clientes.remove(c);
	}

	private static void deletarContas(ArrayList<Cliente> clientes, ArrayList<Conta> contas) {
		if(clientes.isEmpty()) {
			System.out.println("Não há clientes cadastrados!");
			return;
		}
		
		
		
		Boolean valido = false;
		do {
			try {
				Long id;
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o ID da  conta ou digite 0 para voltar");
				id = s.nextLong();
				if(id == 0) {
					return;
				}
				
				contas.forEach( conta -> {
					if(conta.getId() == id) {
						excluirConta(conta,clientes,contas);
					}
				});
				

				valido = true;
				
				
				
			}catch(InputMismatchException e) {
				System.out.println("Numero invalido tente novamente");
				valido = false;
			}
		}while(!valido);
		
	}

	private static void excluirConta(Conta conta, ArrayList<Cliente> clientes, ArrayList<Conta> contas) {
		clientes.forEach( cliente -> {
			cliente.getContas().forEach( contaDoCliente -> {
				if(contaDoCliente.equals(conta)) {
					if(cliente.getContas().size() <= 1) {
						System.out.println("Não foi possivel excluir conta, cliente possui apenas ela");
					}else {
						contas.remove(conta);
					}
				};
			});
		});
		
		
		
	}

	private static void listarContas(ArrayList<Conta> contas) {
		if(!contas.isEmpty()) {
			contas.forEach( c -> {
				System.out.println(c);
			});
		}else {
			System.out.println("Não há contas cadastradas");
		}
		
	}

	private static void adicionarConta(ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		Boolean valido = false;
		Long id;
		Boolean clienteEncontrada = false;
		Cliente cliente = null;
		do {
			try {
				System.out.println("Digite o id do cliente");
				Scanner s = new Scanner(System.in);
				id = s.nextLong();
				for(int i = 0; i < clientes.size();i++ ) {
					if(clientes.get(i).getId() == id) {
						clienteEncontrada = true;
						cliente = clientes.get(i);
					}
				}
				if(clienteEncontrada) {
					if(cliente.getContas().size() == 3 ) {
						System.out.println("Cliente ja possui os tres tipos de conta");
						return;
					}
					escolherTipoNovoDeConta(cliente,valido,clientes,contas,investimentos);
					
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Erro vamos tentar novamente");
				valido = false;
			};
		}while(!valido);
		
	}
	
	private static void escolherTipoNovoDeConta(Cliente cliente, Boolean valido, ArrayList<Cliente> clientes, ArrayList<Conta> contas,
			ArrayList<Investimento> investimentos) {
		Scanner s = new Scanner(System.in);
		if(investimentos.isEmpty()) {
			System.out.println("Digite o tipo de conta que deseja adicionar");
			printMenuCriarContaComInvestimento();
			int op;
			op = s.nextInt();
			Boolean possuiEsseTipoJa = false;
			switch (op) {
			case 1: //
				for(int i = 0;i < cliente.getContas().size(); i++) {
					if(cliente.getContas().get(i) instanceof ContaCorrente) {
						System.out.println("Ja possui conta desse tipo");
						possuiEsseTipoJa = true;
					};
				}
				if(!possuiEsseTipoJa) {
					Conta novaConta = criarContaCorrente();
					cliente.getContas().add(novaConta);
					contas.add(novaConta);
				}
				break;
			case 2:
				
				for(int i = 0;i < cliente.getContas().size(); i++) {
					if(cliente.getContas().get(i) instanceof ContaCDI) {
						System.out.println("Ja possui conta desse tipo");
						possuiEsseTipoJa = true;
					};
				}
				if(!possuiEsseTipoJa) {
					Conta novaConta = criarContaCDI();
					cliente.getContas().add(novaConta);
					contas.add(novaConta);
				}
				break;
			case 3:
				for(int i = 0;i < cliente.getContas().size(); i++) {
					if(cliente.getContas().get(i) instanceof ContaInvestimentoAutomatico) {
						System.out.println("Ja possui conta desse tipo");
						possuiEsseTipoJa = true;
					};
				}
				if(!possuiEsseTipoJa) {
					Conta novaConta = criarContaInvestimentoAutomatico(investimentos);
					cliente.getContas().add(novaConta);
					contas.add(novaConta);
				}
				break;
			default:
				throw new InputMismatchException();
			}
			valido = true;
			
			
		}else {
			System.out.println("Digite o tipo de conta que deseja adicionar");
			printMenuCriarContaSemInvestimento();
			int op;
			op = s.nextInt();
			Boolean possuiEsseTipoJa = false;
			switch (op) {
			case 1: //
				for(int i = 0;i < cliente.getContas().size(); i++) {
					if(cliente.getContas().get(i) instanceof ContaCorrente) {
						System.out.println("Ja possui conta desse tipo");
						possuiEsseTipoJa = true;
					};
				}
				if(!possuiEsseTipoJa) {
					Conta novaConta = criarContaCorrente();
					cliente.getContas().add(novaConta);
					contas.add(novaConta);
				}
				break;
			case 2:
				
				for(int i = 0;i < cliente.getContas().size(); i++) {
					if(cliente.getContas().get(i) instanceof ContaCDI) {
						System.out.println("Ja possui conta desse tipo");
						possuiEsseTipoJa = true;
					};
				}
				if(!possuiEsseTipoJa) {
					Conta novaConta = criarContaCDI();
					cliente.getContas().add(novaConta);
					contas.add(novaConta);
				}
				break;
			default:
				throw new InputMismatchException();
			}
			valido = true;
			
		}
		
	}

	private static void printMenuCriarContaComInvestimento() {
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta CDI");
		System.out.println("3 - Conta Investimento Automatico");
		
	}
	
	private static void printMenuCriarContaSemInvestimento() {
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta CDI");
		System.out.println("3 - Conta Investimento Automatico");
		
	}

	private static void listarClientes(ArrayList<Cliente> clientes) {
		if(!clientes.isEmpty()) {
			clientes.forEach( c -> {
				System.out.println(c);
				System.out.println("--------------------------------------------------");
			
			});
		}else {
			System.out.println("Não há clientes cadastrados! ");
		}
		

		
	}

	private static void adicionarCliente(ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		int op = 0;
		Boolean valido = false;
		do {
			try {
				Scanner s = new Scanner(System.in);
				printMenuCriarCliente();
				op = s.nextInt();
				escolhaMenuCriarCliente(op,clientes,contas,investimentos);
				valido = true;
			}catch(InputMismatchException e) {
				System.out.println("opção invalida");
				valido = false;
			}
		}while(!valido);
		

	}
	
	private static void printMenuCriarCliente() {
		System.out.println("1 - Pessoa Fisica");
		System.out.println("2 - Pessoa Juridica");
		System.out.println("0 - voltar");
		
	}

	private static void escolhaMenuCriarCliente(int op, ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		switch (op) {
		case 1:
			criarPessoaFisica(clientes,contas,investimentos);
			break;
		case 2:
			criarPessoaJurifica(clientes,contas,investimentos);
		case 0:
			break;
		default:
			throw new InputMismatchException();
		}
		
	}

	private static void criarPessoaJurifica(ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		Boolean valido = false;
		String nome = null;
		String email = null;
		ArrayList<Conta> contasDoCliente = new ArrayList<Conta>();
		String cNPJ = null;
		
		
		do {
			try {
				System.out.println("Criando pessoa juridica");
				Long id = Cliente.numeroDeClientes + 1l;
				System.out.println("Cliente de ID: " + id);
				Scanner s = new Scanner(System.in);
				System.out.println("Nome do cliente:");
				nome = s.next();
				System.out.println("Email do cliente:");
				email = s.next();
				System.out.println("CNPJ do cliente:");
				cNPJ = s.next();
				
				System.out.println("A conta inicial do cliente sera?");
				Conta contaInicial = criarContaInicial(investimentos);
				contasDoCliente.add(contaInicial);
				PessoaJuridica pj = new PessoaJuridica(nome, email, contasDoCliente, cNPJ);
				clientes.add(pj);
				contas.add(contaInicial);
				
				
				valido = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Opção invalida , reiniciando fluxo");
				valido = false;
			}
		}while(!valido);
		
	}

	private static Conta criarContaInicial(ArrayList<Investimento> investimentos) {
		int op = 0;
		Boolean valido = false;
		do {
			try {
				Scanner s = new Scanner(System.in);
				if(investimentos.isEmpty()) {
					printMenuCriarContaSemInvestimento();
					op = s.nextInt();
					Conta conta = escolhaMenuCriarContaInicialSemInvestimento(op);
					valido = true;
					return conta;
				}else {
					printMenuCriarContaComInvestimento();
					op = s.nextInt();
					Conta conta = escolhaMenuCriarContaInicialComInvestimento(op,investimentos);
					valido = true;
					return conta;
				}
			}catch(InputMismatchException e ) {
				System.out.println("Opção invalida reiniciando fluxo");
				valido = false;
			}
		}while(!valido);
		return null;
	}

	private static Conta escolhaMenuCriarContaInicialComInvestimento(int op, ArrayList<Investimento> investimentos) {
		Conta conta;
		switch (op) {
		case 1:
			conta = criarContaCorrente();
			return conta;
		case 2:
			conta = criarContaCDI();
			return conta;
		case 3:
			conta = criarContaInvestimentoAutomatico(investimentos);
			return conta;
		default:
			throw new InputMismatchException();
		}

	}
	
	private static Conta escolhaMenuCriarContaInicialSemInvestimento(int op) {
		Conta conta;
		switch (op) {
		case 1:
			conta = criarContaCorrente();
			return conta;
		case 2:
			conta = criarContaCDI();
			return conta;
		default:
			throw new InputMismatchException();
		}

	}

	private static ContaInvestimentoAutomatico criarContaInvestimentoAutomatico(ArrayList<Investimento> investimentos) {
		
		Float dinheiro = dinheiroInicial();
		Investimento investimento = escolharInvestimento(investimentos);
		ContaInvestimentoAutomatico conta = new ContaInvestimentoAutomatico(dinheiro,investimento);
		return conta;
	}



	private static Investimento escolharInvestimento(ArrayList<Investimento> investimentos) {
		Boolean valido = false;
		Investimento investimento = null;
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o id do investimento:");
				investimento = investimentos.get(s.nextInt());
				
			}catch(Exception e) {
				valido = false;
				System.out.println("Erro, vamos reiniciar");
			}
		}while(!valido);
		return investimento;
	}

	private static ContaCDI criarContaCDI() {
		Float dinheiro = dinheiroInicial();
		ContaCDI conta = new ContaCDI(dinheiro);
		return conta;
	}

	private static ContaCorrente criarContaCorrente() {
		Float dinheiro = dinheiroInicial();
		ContaCorrente conta = new ContaCorrente(dinheiro);
		return conta;
	}
	
	private static Float dinheiroInicial() {
		Boolean valido = false;
		Float dinheiroInicial = null;
		do {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Digite o dinheiro inicial da conta");
				dinheiroInicial = s.nextFloat();
				valido = true;
			}catch(InputMismatchException e) {
				System.out.println("Erro tente novamente");
				valido = false;
			}
		}while(!valido);
		return dinheiroInicial;
	}



	private static void criarPessoaFisica(ArrayList<Cliente> clientes, ArrayList<Conta> contas, ArrayList<Investimento> investimentos) {
		Boolean valido = false;
		String nome = null;
		String email = null;
		ArrayList<Conta> contasDoCliente = new ArrayList<Conta>();
		String cpf = null;
		
		
		do {
			try {
				System.out.println("Criando pessoa fisica");
				Long id = Cliente.numeroDeClientes + 1l;
				System.out.println("Cliente de ID: " + id);
				Scanner s = new Scanner(System.in);
				System.out.println("Nome do cliente:");
				nome = s.next();
				System.out.println("Email do cliente:");
				email = s.next();
				System.out.println("cpf do cliente:");
				cpf = s.next();
				
				System.out.println("A conta inicial do cliente sera?");
				Conta contaInicial = criarContaInicial(investimentos);
				contasDoCliente.add(contaInicial);
				PessoaFisica pf = new PessoaFisica(nome, email, contasDoCliente, cpf);
				clientes.add(pf);
				contas.add(contaInicial);
				
				
				valido = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Opção invalida , reiniciando fluxo");
				valido = false;
			}
		}while(!valido);
	}






}
