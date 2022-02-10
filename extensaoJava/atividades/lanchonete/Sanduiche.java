
public class Sanduiche extends Prato implements IAdicionarIngredientes{
	
	private IngredientesExtra ingredientesExtra;
	
	public Sanduiche(String nome, double preco) {
		super(nome, preco);
		this.setTipo("Sanduiche");
		
		ingredientesExtra = new IngredientesExtra(3);
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
	
	public Sanduiche copia() {
		Sanduiche copia = new Sanduiche(this.getNome(), this.getPreco());
		copia.setQtdIngredientes(this.getQtdIngredientes());
		return copia;
	}
}
