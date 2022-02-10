
public class Salada extends Prato implements IAdicionarIngredientes {
	
	private IngredientesExtra ingredientesExtra;
	
	public Salada(String nome, double preco) {
		super(nome, preco);
		this.setTipo("Salada");
		
		ingredientesExtra = new IngredientesExtra(1);
	}
	
	
	public int getQtdIngredientes() {
		return this.ingredientesExtra.getQuantidade();
	}
	
	public void setQtdIngredientes(int quantidade) {
		this.ingredientesExtra.setQuantidade(quantidade);
	}
	
	public void adicionarIngrediente() {
		ingredientesExtra.adicionar();
	}
	
	public double getPreco() {
		return super.getPreco() + this.ingredientesExtra.getValorTotal();
	}
	
	public Salada copia() {
		Salada copia = new Salada(this.getNome(), this.getPreco());
		copia.setQtdIngredientes(this.getQtdIngredientes());
		return copia;
	}
}
