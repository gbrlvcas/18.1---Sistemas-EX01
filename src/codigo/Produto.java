package codigo;

import java.util.ArrayList;

public class Produto {

	//Atributos
	private String nomeProduto;
	private double valorProduto;
	
	//M�todo m�gico
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
	
	//ArrayList
	public static ArrayList<Produto> dados = new ArrayList<>();
	
	//M�todo para exibir apenas o nome
	public String toString() {
		return nomeProduto;
	}
	
}
