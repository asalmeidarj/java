
public class Cliente {
	
	private String nome;
	private Pedido pedido;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.pedido = new Pedido();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarItemPedido(Prato prato) {
		pedido.adicionarItem(prato);
	}
	
	public String getStatusPedido() {
		return pedido.getStatus();
	}
}
