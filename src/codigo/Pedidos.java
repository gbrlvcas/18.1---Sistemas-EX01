package codigo;

import java.util.ArrayList;

public class Pedidos {
	
	//Atributos
	
	//Relacionados a pedidos
	private String nomePedido;
	private String escolhidoPedido;
	private String quantidadePedido;
	private String dataDias;
	private String dataTempo;
	private double somaPedido;
	


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
		public String getDataDias() {
			return dataDias;
		}
		public void setDataDias(String dataDias) {
			this.dataDias = dataDias;
		}
		public String getDataTempo() {
			return dataTempo;
		}
		public void setDataTempo(String dataTempo) {
			this.dataTempo = dataTempo;
		}
		public double getSomaPedido() {
			return somaPedido;
		}
		public void setSomaPedido(double somaPedido) {
			this.somaPedido = somaPedido;
		}






		//ArrayList
		public static ArrayList<Pedidos> dados = new ArrayList<>();

	}

	
	


