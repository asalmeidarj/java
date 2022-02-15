package Lanches;

public class Tabela {
	
	public static String[] preco(Lanche lanche) {
		String[] result = {};
		if(lanche.getClass() == Bolo.class) {
			Bolo obj = (Bolo) lanche;
			return preco(obj);
		}
		if(lanche.getClass()== Lasanha.class) {
			Lasanha obj = (Lasanha) lanche;
			return preco(obj);
		}
		if(lanche.getClass() == Macarrao.class) {
			Macarrao obj = (Macarrao) lanche;
			return preco(obj);
		}
		if(lanche.getClass() == Pizza.class) {
			Pizza obj = (Pizza) lanche;
			return preco(obj);
		}
		if(lanche.getClass() == Sanduiche.class) {
			Sanduiche obj = (Sanduiche) lanche;
			return preco(obj);
		}
		return result;
	}
	
	public static String[] preco(Bolo bolo) {
		String[] tabela = {"40.90", "Bolo"};
		return tabela;
	}
	
	public static String[] preco(Lasanha lasanha) {
		String[] tabela = {"45.90", "Lasanha"};
		return tabela;
	}
	
	public static String[] preco(Macarrao macarrao) {		
		if(macarrao.getTipo() == "Talharim") {
			String[] tabela = {"28.40", "Talharim"};
			return tabela;
		}
		if(macarrao.getTipo() == "Penne") {
			String[] tabela = {"36.70", "Penne"};
			return tabela;
		}
		if(macarrao.getTipo() == "Parafuso") {
			String[] tabela = {"39.00", "Parafuso"};
			return tabela;
		}
		String[] tabela = {"Inválido", "Preço varia de acordo com o tipo"};
		return tabela;
	}
	
	public static String[] preco(Pizza pizza) {		
		if(pizza.getSabor() == "Calabresa") {
			String[] tabela = {"36.40", "Calabresa"};
			return tabela;
		}
		if(pizza.getSabor() == "Atum") {
			String[] tabela = {"40.60", "Atum"};
			return tabela;
		}
		if(pizza.getSabor() == "Quatro queijos") {
			String[] tabela = {"41.00", "Quatro queijos"};
			return tabela;
		}
		String[] tabela = {"Inválido", "Preço varia de acordo com o tipo"};
		return tabela;
	}
	
	public static String[] preco(Sanduiche sanduiche) {
		double preco = 10.00 + sanduiche.ingredientes.size() * 2;
		String[] tabela = {"" + preco, "Sanduiche"};
		return tabela;
	}
}
