package codigo;

import java.util.ArrayList;

public class Pedidos {
	
	//Atributos
	private String nomePedido;
	private String escolhidoPedido;
	private String quantidadePedido;
	
	//Método mágico
	public String getNomePedido() {
		return nomePedido;
	}
	public void setNomePedido(String nomePedido) {
		this.nomePedido = nomePedido;
	}
	public String getEscolhidoPedido() {
		return escolhidoPedido;
	}
	public void setEscolhidoPedido(String escolhidoPedido) {
		this.escolhidoPedido = escolhidoPedido;
	}
	public String getQuantidadePedido() {
		return quantidadePedido;
	}
	public void setQuantidadePedido(String quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}
	
	//ArrayList
	public static ArrayList<Pedidos> dados = new ArrayList<>();
	

}
