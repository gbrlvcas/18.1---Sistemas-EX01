package codigo;

import javax.swing.JOptionPane;

public class Acao {
	
	//Atributos
	public String mensagemErro = "";
	public int codErro;
	
	
	//Método para Validar e Cadastrar
	public void CadastrarProduto(String nomeProduto, String valorProduto) {
		
		//Variaveis
		codErro = 0;
		double erro;
	
		//Caso cliente deixe o campo em branco
		if(valorProduto.equals("") || nomeProduto.equals("")) {
			codErro = 1;
		}
		
		if(codErro == 0) {
		//Caso cliente digite uma letra no lugar de número
		try {
		erro = Double.parseDouble(valorProduto);
		}catch(Exception e) {
			
		codErro = 2;
		}
		}
		
		//Condicional - Resultado do Cadastro
		if(codErro == 0) {
			Produto p = new Produto();
			
			//Adicionando o nome do Produto digiado a classe Produto
			p.setNomeProduto(nomeProduto);
			p.setValorProduto(Double.parseDouble(valorProduto));
			
			//Adicionando ao ArrayList
			Produto.dados.add(p);
			
			
			
			mensagemErro = "\n\n    Produto cadastrado\n           com Sucesso!";
			
		}else if(codErro == 1) {
			mensagemErro = "#ERRO01";
			mensagemErro+="\nCampo: Valor";
			mensagemErro+="\n\n#Como resolver";
			mensagemErro+="\nNão deixe nenhum\ncampo em branco";
			
		}else if(codErro == 2) {	
			mensagemErro = "#ERRO02";
			mensagemErro+="\nCampo: Valor";
			mensagemErro+="\n\nComo resolver";
			mensagemErro+="\nDigite apenas números";
			
		}
		
	
	}
}
