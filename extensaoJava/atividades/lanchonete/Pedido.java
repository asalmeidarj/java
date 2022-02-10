
import java.util.ArrayList;

public class Pedido {
	
	private ArrayList<Prato> itens;
	private static int contadorPedidos;
	private int numeroPedido;
	private String status;
	
	public Pedido() {
		this.itens = new ArrayList<Prato>();
		contadorPedidos++;
		this.numeroPedido = contadorPedidos;
		this.status = "Em aberto";
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public double getValorPedido() {
		double valorPedido = 0;
		for(Prato item: this.itens) {
			valorPedido += item.getPreco();
		}
		return valorPedido;
	}
	
	public ArrayList<Prato> getItens(){
		return this.itens;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void adicionarItem(Salada prato) {
		Salada copia = (Salada) prato.copia();
		copia.setQtdIngredientes(prato.getQtdIngredientes());
		this.itens.add(copia);
	}
	
	public void adicionarItem(Sanduiche prato) {
		Sanduiche copia = (Sanduiche) prato.copia();
		copia.setQtdIngredientes(prato.getQtdIngredientes());
		this.itens.add(copia);
	}
	public void adicionarItem(Prato prato) {
		Prato copia = prato.copia();
		this.itens.add(copia);
	}
	
	
	public void adicionarIngredientes(int posicao) {
		if(itens.get(posicao).getClass() == Salada.class) {
			Salada salada = (Salada) itens.get(posicao);			
			adicionarIngredientePrato(salada);
			return;
		}
		if(itens.get(posicao).getClass() == Sanduiche.class) {
			Sanduiche sanduiche = (Sanduiche) itens.get(posicao);		
			adicionarIngredientePrato(sanduiche);
			return;
		}
		System.out.println("Não é permitido ingredientes extras em massas!");
	}
	
	private void adicionarIngredientePrato(Salada salada) {
		salada.adicionarIngrediente();
	}
	
	public void adicionarIngredientePrato(Sanduiche sanduiche) {
		sanduiche.adicionarIngrediente();
	}
	
	public void finalizarPedido() {
		this.status = "Pedido em Andamento";
	}
	
}
