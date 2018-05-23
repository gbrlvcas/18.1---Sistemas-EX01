package codigo;

import java.util.ArrayList;

public class Produto {

	//Atributos
	private String nomeProduto;
	private double valorProduto;
	
	//Método mágico
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	//Arraylist
	ArrayList<Produto> dados = new ArrayList<>();
	
}
