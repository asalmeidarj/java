import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	private static Scanner ler = new Scanner(System.in);
	private static Cliente cliente;
	private static ArrayList<Prato> menu = new ArrayList<Prato>();
	
	public static void main(String[] args) {
		
		// Criar pratos		
		Prato saladaSimples = new Salada("Salada Simples", 10);
		Prato saladaEspecial = new Salada("Salada Especial", 20);		
		Prato lasanha = new Massa("Lasanha");
		Prato macarrao = new Massa("Macarrão");
		Prato inhoque = new Massa("Inhoque");
		Prato mistoQuente = new Sanduiche("Misto quente", 8);
		Prato beirute = new Sanduiche("Beirute", 9);
		
		// Adicionar pratos ao menu (cardápio)
		menu.add(saladaSimples);
		menu.add(saladaEspecial);
		menu.add(lasanha);
		menu.add(macarrao);
		menu.add(inhoque);
		menu.add(mistoQuente);
		menu.add(beirute);
		
				
		// Criar Cliente		
		System.out.println("Digite o seu nome? ");	
		String nomeCliente = ler.next();		
		cliente = new Cliente(nomeCliente);
		
		
		//Boas vindas
		msgBoasVindas();
		
		// Montar o pedido
		adicionarPratosAoPedido();
		
		// Ingredientes Extras
		adicionarIngredientes();
		
		// 

	}
	
	
	private static void msgBoasVindas() {
		System.out.println();
		System.out.printf(
				"É um prazer , %s, receber você em nossa loja!", cliente.getNome());
	}
	
	private static void adicionarPratosAoPedido() {
		boolean stop = false;
				
		while(!stop) {
			exibirMenu();
			System.out.println();
			System.out.println("Digite o número do prato no menu para adicionar ao seu pedido.");
			
			int indice = ler.nextInt() - 1;
			if(indice >= 0 && indice < menu.size()) {
				cliente.adicionarItemPedido(menu.get(indice));
				System.out.println("Item Adicionado com sucesso!");
			} else {
				System.out.println("Escolha um número de prato válido.");
				continue;
			}
			
			System.out.println("Deseja adicionar mais pratos ao pedido? digite 'S' para sim" );
			String resp = ler.next();
			if(resp.equals("s") || resp.equals("S")) {
				continue;
			}
			System.out.println("Ok. Entendi.");
			exibirPedido();
			stop = true;
		}
	}
	
	private static void exibirMenu() {
		System.out.println();
		System.out.printf("%n*******************     CARDÁPIO     ******************* %n");
		System.out.printf("%-8s %-12s %-20s %-6s %n", "Número", "Tipo", "Desc.", "Preço");
		int i = 1;
		for(Prato prato: menu) {		
			System.out.printf("%-8d %-12s %-20s %.2f", i, prato.getTipo(), prato.getNome(), prato.getPreco());
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println("* Ingredientes adicionais para salada custam R$ 1,00 por ingrediente");
		System.out.println("** Ingredientes adicionais para sanduíche custam R$ 3,00 por ingrediente");		
	}
	
	private static void exibirPedido() {
		System.out.printf("%n*******************     Pedido %s   ******************* %n", cliente.getStatusPedido());
		System.out.printf("%-8s %-20s %-6s %-26s %n", "Item", "Desc.", "Preço", "Qtd. (Ingredientes extras)");
		int i = 0;
		for(Prato prato: cliente.getPedido().getItens()) {
			i++;
			if(prato.getClass() == Salada.class) {
				Salada novo = (Salada) prato.copia();
				System.out.printf("%-8d %-20s %-6.2f %-26d %n", i, prato.getNome(), prato.getPreco(), novo.getQtdIngredientes());
				continue;
			}
			if(prato.getClass() == Sanduiche.class) {
				Sanduiche novo = (Sanduiche) prato.copia();
				System.out.printf("%-8d %-20s %-6.2f %-26d %n", i, prato.getNome(), prato.getPreco(), novo.getQtdIngredientes());
				continue;
			}
			System.out.printf("%-8d %-20s %-6.2f %-26d %n", i, prato.getNome(), prato.getPreco(), 0);
		}
		System.out.println("Valor Total "  + cliente.getPedido().getValorPedido());
	}
	
	private static void adicionarIngredientes() {
		System.out.println("Gostaria  de adicionar algum ingrediente extra nas Saladas ou Sanduíche? digite s para Sim." );
		System.out.println("* Limite de 3 ingredientes em cada item");
		
		String resp = ler.next();
		if(resp.equals("s") || resp.equals("S")) {
			exibirPedido();
			System.out.println("Digite o número do item que deseja adicionar ingredinte");
			int num = ler.nextInt() - 1;
			cliente.getPedido().adicionarIngredientes(num);
			adicionarIngredientes();
		} else {
			finalizarPedido();
		}
		
	}
	
	private static void finalizarPedido() {
		cliente.getPedido().finalizarPedido();
		exibirPedido();
	}
	
}
