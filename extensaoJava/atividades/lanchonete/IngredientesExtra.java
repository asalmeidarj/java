
public class IngredientesExtra {
	
	private int quantidade;
	private double valorUnitario;
	
	
	public IngredientesExtra(double valor) {
		this.valorUnitario = valor;
	}
	
	public IngredientesExtra(double valor, int quantidade) {
		this.valorUnitario = valor;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return valorUnitario;
	}
	public void adicionar() {
		if(this.quantidade < 3) {
			this.quantidade++;
			System.out.println("Ingrediente Adicionado ao prato");
		} else {
			System.out.println("Não pode mais adicionar ingredientes neste prato!");
		}
	}
	
	public double getValorTotal() {
		return quantidade * valorUnitario;
	}
	
	
}
