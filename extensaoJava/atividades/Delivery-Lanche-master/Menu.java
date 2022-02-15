package Lanches;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<String> ingredientes = new ArrayList<String>();
	private ArrayList<String> molhos = new ArrayList<String>();
	private ArrayList<String> tiposMassasDeBolo = new ArrayList<String>();
	private ArrayList<String> tiposRecheiosDeBolo = new ArrayList<String>();
	private ArrayList<String> tiposCoberturasDeBolo = new ArrayList<String>();
	private ArrayList<String> tiposDeMacarrao = new ArrayList<String>();
	private ArrayList<String> tiposSaboresDePizza = new ArrayList<String>();
	private ArrayList<Lanche> opcoes = new ArrayList<Lanche>();
		
	public Menu() {		
		adicionarIngredientes();
		adicionarMolhos();
		adicionarTiposMassasDeBolo();
		adicionarTiposRecheiosDeBolo();
		adicionarTiposCoberturasDeBolo();
		adicionarTiposDeMacarrao();
		adicionarTiposSaboresDePizza();
		adicionarBolos();
		adicionarMassas();
		adicionarSanduiches();
	}
	
	private void adicionarIngredientes() {		
		ingredientes.add("queijo");
		ingredientes.add("presunto");
		ingredientes.add("bacon");
		ingredientes.add("alface");
		ingredientes.add("tomate");
		ingredientes.add("catupiry");
		ingredientes.add("maionese");
		ingredientes.add("abacaxi");
		ingredientes.add("batata palha");
		ingredientes.add("mostarda");
	}
	
	private void adicionarMolhos() {
		molhos.add("Molho ao sugo");
		molhos.add("Molho branco");
		molhos.add("Molho bolonhesa");
	}
	
	private void adicionarTiposMassasDeBolo() {
		tiposMassasDeBolo.add("Red velvet");
		tiposMassasDeBolo.add("Amanteigada");
	}
	
	private void adicionarTiposRecheiosDeBolo() {
		tiposRecheiosDeBolo.add("Cream Cheese");
		tiposRecheiosDeBolo.add("Castanha");
	}
	
	private void adicionarTiposCoberturasDeBolo() {
		tiposCoberturasDeBolo.add("Chantilly");
		tiposCoberturasDeBolo.add("Caramelo");
	}
	
	private void adicionarTiposDeMacarrao() {
		tiposDeMacarrao.add("Talharim");
		tiposDeMacarrao.add("Penne");
		tiposDeMacarrao.add("Parafuso");
	}
	
	private void adicionarTiposSaboresDePizza() {
		tiposSaboresDePizza.add("Calabresa");
		tiposSaboresDePizza.add("Atum");
		tiposSaboresDePizza.add("Quatro queijos");
	}
	
	private void adicionarBolos() {		
		Bolo bolo = new Bolo();	
		opcoes.add(bolo);	
	}
	
	private void adicionarMassas() {		
		adicionarLasanha();
		adicionarMacarrao();
		adicionarPizza();
	}

	private void adicionarLasanha() {
		Lasanha lasanha = new Lasanha();
		opcoes.add(lasanha);	
	}
	
	private void adicionarMacarrao() {
		Macarrao macarrao = new Macarrao();
		opcoes.add(macarrao);				
	}
	
	private void adicionarPizza() {
		Pizza pizza = new Pizza();
		opcoes.add(pizza);
	}
	
	private void adicionarSanduiches() {
		Sanduiche sanduiche = new Sanduiche();
		opcoes.add(sanduiche);
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public ArrayList<String> getMolhos() {
		return molhos;
	}

	public ArrayList<String> getTiposMassasDeBolo() {
		return tiposMassasDeBolo;
	}

	public ArrayList<String> getTiposRecheiosDeBolo() {
		return tiposRecheiosDeBolo;
	}

	public ArrayList<String> getTiposCoberturasDeBolo() {
		return tiposCoberturasDeBolo;
	}
	
	public ArrayList<String> getTiposDeMacarrao() {
		return tiposDeMacarrao;
	}
	
	public ArrayList<String> getTiposSaboresDePizza() {
		return tiposSaboresDePizza;
	}

	public ArrayList<Lanche> getOpcoes() {
		return opcoes;
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		for(Lanche lanche: menu.opcoes) {		
			System.out.println(lanche.getClass().getSimpleName());
		}
	}

}
