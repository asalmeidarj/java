package Lanches;

import java.util.Scanner;
import java.util.ArrayList;

public class ProgramaMain {
	
	private static Menu menu = new Menu();
	private static Scanner ler = new Scanner(System.in);
	private static Lanche escolha;
	private static boolean concluido = false;
	
	public static void main(String[] args) {
		
		int escolhaDoTipoLanche = escolherTipoLanche();
		
		detalharEscolha(escolhaDoTipoLanche);
		
		if(concluido) {
			mensagemTempoDeEntrega();
			finalizarPedido();
			agradecimento();
		} else {
			pedidoCancelado();
		}		
	}
	
	public static void mensagemTempoDeEntrega() {
	    pularLinhas(1);
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Para cálculo do tempo de entrega, precisamos saber a distãncia até sua casa! ");
		System.out.println(" ");
		System.out.println(" Qual a distância da sua casa? (em km) ");
		double distancia = ler.nextDouble();
		calcularTempo(distancia);
		
	}
	
	public static void calcularTempo(double distancia) {
		double inteira,resto;
		double tempoTotal = (distancia*10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
		
	}
	
	public static void pularLinhas(int quantLinhas) {
            for(int i = 0; i < quantLinhas; i++)
            System.out.println("");
    }
	
	public static void agradecimento() {
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
		System.out.println(" ");
		
	}
	
	public static int escolherTipoLanche() {
		int escolhaDoTipoLanche;

		while(true) {			
			System.out.println("--------------------------Bem vindos do Delivery do Java Express---------------------------");
			System.out.println("");
			System.out.println("-----------------------------------Menu de opções------------------------------------------");
			System.out.println("[ 0 ] - Cancelar pedido");
			exibirOpcoesDeLanches();
			System.out.println("Escolha a opção desejada:");
			
			escolhaDoTipoLanche = ler.nextInt();
			
			if(escolhaDoTipoLanche < 0  || escolhaDoTipoLanche > menu.getOpcoes().size()) {
				System.out.println("Digite um número válido!");
				continue;
			}
			break;
		}
		return escolhaDoTipoLanche;
	}
	
	private static void exibirOpcoesDeLanches() {
		int count = 1;
		for(Lanche lanche: menu.getOpcoes()) {
			String nome = lanche.getClass().getSimpleName();
			String[] result = Tabela.preco(lanche);
			String preco = (result[0] == "Inválido") ? result[1] : ("R$ " + result[0]);
			System.out.println("[ " + count + " ] - " + nome + "..... " + preco);
			count++;
		}
		
		System.out.println("** Cobramos R$ 2 reais por cada ingrediente no sanduíche");
	}

	private static void detalharEscolha(int escolha) {
		if(escolha == 0) {
			return;
		}
		detalhar(menu.getOpcoes().get(escolha-1));
	}
	
	private static void detalhar(Lanche lanche) {
		if(lanche.getClass() == Bolo.class) {
			Bolo obj = (Bolo) lanche;
			detalhar(obj);
		}
		if(lanche.getClass()== Lasanha.class) {
			Lasanha obj = (Lasanha) lanche;
			detalhar(obj);
		}
		if(lanche.getClass() == Macarrao.class) {
			Macarrao obj = (Macarrao) lanche;
			detalhar(obj);
		}
		if(lanche.getClass() == Pizza.class) {
			Pizza obj = (Pizza) lanche;
			detalhar(obj);
		}
		if(lanche.getClass() == Sanduiche.class) {
			Sanduiche obj = (Sanduiche) lanche;
			detalhar(obj);
		}
	}
	
	private static void detalhar(Bolo bolo) {
		System.out.println("                    Você escolheu Bolo. Digite as opções de Massa, Recheio e Cobertura");
   	 	System.out.println("___________________________________________________________________________________________________________ ");
		
   	 	int massa = escolherMassa();
		if(massa == 0) {
			return;
		}
		
		int recheio = escolherRecheio();
		if(recheio == 0) {
			return;
		}
		
		int cobertura = escolherCobertura();
		if(cobertura == 0) {
			return;
		}
		
		bolo.setMassa(menu.getTiposMassasDeBolo().get(massa-1));
		bolo.setRecheio(menu.getTiposRecheiosDeBolo().get(recheio-1));
		bolo.setCobertura(menu.getTiposCoberturasDeBolo().get(cobertura-1));		
		escolha = bolo;
		
		concluido = true;
	}
	
	private static void detalhar(Macarrao macarrao) {
		System.out.println("                    Você escolheu Macarrao. Digite as opções de tipo de macarrão");
   	 	System.out.println("___________________________________________________________________________________________________________ ");
		
   	 	int tipo = escolherTipoDeMacarrao();
		if(tipo == 0) {
			return;
		}
		
		int molho = escolherMolho();
		if(molho == 0) {
			return;
		}
		
		macarrao.setTipo(menu.getTiposDeMacarrao().get(tipo-1));
		macarrao.setMolho(menu.getMolhos().get(molho-1));		
		escolha = macarrao;
		
		concluido = true;
	}
	
	private static int escolherMassa() {
		int tipoMassa;
		while(true) {
			System.out.println("-----------------------------------Qual o tipo de massa você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getTiposMassasDeBolo()) {
	   	 		System.out.println("[ " + count + " ]" + tipo);
	   	 		count++;
	   	 	}
	   	 	
	   	 	tipoMassa = ler.nextInt();
	   	  
		   	if(tipoMassa < 0 || tipoMassa > menu.getTiposMassasDeBolo().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return tipoMassa;
	}
	
	private static int escolherRecheio() {
		int tipoRecheio;
		while(true) {
			System.out.println("-----------------------------------Qual o tipo de recheio você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getTiposRecheiosDeBolo()) {
	   	 		System.out.println("[ " + count + " ]" + tipo);
	   	 		count++;
	   	 	}
	   	 	
	   	 	tipoRecheio = ler.nextInt();
	   	  
		   	if(tipoRecheio < 0 || tipoRecheio > menu.getTiposRecheiosDeBolo().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return tipoRecheio;
	}
	
	private static int escolherCobertura() {
		int tipoCobertura;
		while(true) {
			System.out.println("-----------------------------------Qual o tipo de cobertura você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getTiposCoberturasDeBolo()) {
	   	 		System.out.println("[ " + count + " ]" + tipo);
	   	 		count++;
	   	 	}
	   	 	
	   	 	tipoCobertura = ler.nextInt();
	   	  
		   	if(tipoCobertura < 0 || tipoCobertura > menu.getTiposCoberturasDeBolo().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return tipoCobertura;
	}
	
	private static int escolherTipoDeMacarrao() {
		int tipoMacarrao;
		while(true) {
			System.out.println("-----------------------------------Qual o tipo de macarrão você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getTiposDeMacarrao()) {
	   	 		Macarrao macarrao = new Macarrao();
	   	 		macarrao.setTipo(tipo);
	   	 		String[] result = Tabela.preco(macarrao);
	   	 		String preco = (result[0] == "Inválido") ? result[1] : ("R$ " + result[0]);
	   	 		System.out.println("[ " + count + " ]" + tipo + "..... " + preco);
	   	 		count++;
	   	 	}
	   	 	
	   	 tipoMacarrao = ler.nextInt();
	   	  
		   	if(tipoMacarrao < 0 || tipoMacarrao > menu.getTiposDeMacarrao().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return tipoMacarrao;
	}
	
	private static void detalhar(Lasanha lasanha) {
		System.out.println("                    Você escolheu Lasanha. Escolha a opção de molho");
   	 	System.out.println("___________________________________________________________________________________________________________ ");
		
   	 	int molho = escolherMolho();
		if(molho == 0) {
			return;
		}
		
		lasanha.setMolho(menu.getTiposMassasDeBolo().get(molho - 1));	
		escolha = lasanha;
		
		concluido = true;
	}
	
	private static int escolherMolho() {
		int tipoMolho;
		while(true) {
			System.out.println("-----------------------------------Qual o tipo de molho você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getMolhos()) {
	   	 		System.out.println("[ " + count + " ]" + tipo);
	   	 		count++;
	   	 	}
	   	 	
	   	 tipoMolho = ler.nextInt();
	   	  
		   	if(tipoMolho < 0 || tipoMolho > menu.getMolhos().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return tipoMolho;
	}
	
	private static void detalhar(Pizza pizza) {
		System.out.println("                    Você escolheu Pizza. Digite a opção do sabor da pizza");
   	 	System.out.println("___________________________________________________________________________________________________________ ");
		
   	 	int sabor = escolherSabor();
		if(sabor == 0) {
			return;
		}
		
		pizza.setSabor(menu.getTiposSaboresDePizza().get(sabor-1));		
		escolha = pizza;		
		concluido = true;
	}
	
	private static int escolherSabor() {
		int sabor;
		while(true) {
			System.out.println("-----------------------------------Qual sabor você quer?-----------------------------------------");
	   	 	pularLinhas(1);
	   	 	System.out.println("[ 0 ] - Cancelar pedido.");
	   	 	
	   	 	int count = 1;
	   	 	for(String tipo: menu.getTiposSaboresDePizza()) {
	   	 		Pizza pizza = new Pizza();
	   	 		pizza.setSabor(tipo);
	   	 		String[] result = Tabela.preco(pizza);
	   	 		String preco = (result[0] == "Inválido") ? result[1] : ("R$ " + result[0]);
	   	 		System.out.println("[ " + count + " ]" + tipo + "..... " + preco);
	   	 		count++;
	   	 	}
	   	 	
	   	 sabor = ler.nextInt();
	   	  
		   	if(sabor < 0 || sabor > menu.getTiposSaboresDePizza().size()) {
		   		System.out.println("Digite um número válido.");
		   		continue;
		   	}
		   	break;	   	 	
		}
		return sabor;
	}
	
	private static void detalhar(Sanduiche sanduiche) {
		System.out.println("                    Você escolheu Sanduiche. Digite a opção de ingredientes");
   	 	System.out.println("___________________________________________________________________________________________________________ ");
		
   	 	ArrayList<Integer> ingredientes = escolherIngrediente();
   	 	
		for(int num: ingredientes) {
			sanduiche.ingredientes.add(menu.getIngredientes().get(num - 1));
		}	
		escolha = sanduiche;		
		concluido = true;
	}
	
	private static ArrayList<Integer> escolherIngrediente() {
		ArrayList<Integer> ingredientes = new ArrayList<Integer>();
		
		int stop = 0;
		while(stop < 10) {
			System.out.println(
					"----------------------------------- Qual o ingrediente deseja adicionar ?-----------------------------------------");
			pularLinhas(1);
			System.out.println("[ 0 ] - Cancelar pedido.");
			
			

			int count = 1;
			for (String ingrediente : menu.getIngredientes()) {
				System.out.println("[ " + count + " ] - " + ingrediente);
				count++;
			}
			System.out.println("[ 99 ] - Para não adicionar mais ingredientes" );
			
			int resp = ler.nextInt();
			
			if(resp == 99) {
				break;
			}			
			if (resp < 0 || resp > menu.getIngredientes().size()) {
				System.out.println("Digite um número válido.");
				continue;
			}
			
			ingredientes.add(resp);
			System.out.println("Ingrediente adicionado com sucesso!");
			stop++;
		}
		
		return ingredientes;
	}
	
	
	private static void finalizarPedido() {
		if(escolha.getClass() == Bolo.class) {
			Bolo obj = (Bolo) escolha;
			finalizarPedido(obj);
		}
		if(escolha.getClass()== Lasanha.class) {
			Lasanha obj = (Lasanha) escolha;
			finalizarPedido(obj);
		}
		if(escolha.getClass() == Macarrao.class) {
			Macarrao obj = (Macarrao) escolha;
			finalizarPedido(obj);
		}
		if(escolha.getClass() == Pizza.class) {
			Pizza obj = (Pizza) escolha;
			finalizarPedido(obj);
		}
		if(escolha.getClass() == Sanduiche.class) {
			Sanduiche obj = (Sanduiche) escolha;
			finalizarPedido(obj);
		}
	}
	
	private static void finalizarPedido(Bolo obj) {
		double preco = Double.parseDouble(Tabela.preco(obj)[0]);
		obj.setPreco(preco);
		obj.fecharPedido();
	}
	
	private static void finalizarPedido(Lasanha obj) {
		double preco = Double.parseDouble(Tabela.preco(obj)[0]);
		obj.setPreco(preco);
		obj.fecharPedido();
	}
	
	private static void finalizarPedido(Macarrao obj) {
		double preco = Double.parseDouble(Tabela.preco(obj)[0]);
		obj.setPreco(preco);
		obj.fecharPedido();
	}
	
	private static void finalizarPedido(Pizza obj) {
		double preco = Double.parseDouble(Tabela.preco(obj)[0]);
		obj.setPreco(preco);
		obj.fecharPedido();
	}
	
	private static void finalizarPedido(Sanduiche obj) {
		double preco = Double.parseDouble(Tabela.preco(obj)[0]);
		obj.setPreco(preco);
		obj.fecharPedido();
	}
		
	private static void pedidoCancelado() {
		System.out.println("É uma pena ir embora sem experimentar um lanche de nosso cardápio");
	}
	
}
