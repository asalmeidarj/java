package Lanches;
import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche{
	private double tempoTotal;
	private double preco;
		
	List<String> ingredientes = new ArrayList<>();
	
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		
	}
	
	public void getIngrediente() {
		System.out.println("  Você escolheu os ingredientes: " + this.ingredientes);
		
	}
	
	public Sanduiche() {
		
	}
	
	
	
    
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public void calcularTempo(double distancia) {
		double inteira,resto;
		this.tempoTotal = (distancia * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
	}
	
	@Override
	public void fecharPedido() {
		
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ " + getPreco());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

	
	

}
