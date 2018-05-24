package codigo;

import javax.swing.JOptionPane;

public class Acao {
	
	//Atributos
	public String mensagemErro = "";
	public int codErro;
	
	
	//M�todo para Validar e Cadastrar
	public void CadastrarProduto(String nomeProduto, String valorProduto) {
		
		//Variaveis
		codErro = 0;
		double erro;
	
		//Caso cliente deixe o campo em branco
		if(valorProduto.equals("") || nomeProduto.equals("")) {
			codErro = 1;
		}
		
		if(codErro == 0) {
		//Caso cliente digite algo diferente de um n�mero
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
			mensagemErro+="\nN�o deixe nenhum\ncampo em branco";
			
		}else if(codErro == 2) {	
			mensagemErro = "#ERRO02";
			mensagemErro+="\nCampo: Valor";
			mensagemErro+="\n\nComo resolver";
			mensagemErro+="\nDigite apenas n�meros";
			
		}
	}

	
	//M�todo para Validar e registrar pedido
	public void RegistrarPedido(String nomePedido, String escolhidoPedido, String quantidadePedido) {
		
		//Setando as variaveis para nulo [Pois ja foram usados no m�todo anterior]
		codErro = 0;
		mensagemErro = "";
		
		//Variaveis
		int erro;
		
		//Caso cliente deixe o campo em branco
		if(quantidadePedido.equals("")) {
			codErro = 1;
	
		}
		
		
		if(codErro == 0) {
		//Caso cliente digite algo diferente de um n�mero
			try {
				erro = Integer.parseInt(quantidadePedido);
			}catch(Exception e) {
				codErro = 2;
			}
			
			//Condicional - Resultado do cadastro do pedido
			if(codErro == 0) {
				
				//Istanciando a classe [Pedidos]
				Pedidos pd = new Pedidos();
				
				//Atribuindo os nomes as variaveis da classe [Pedidos]
				pd.setNomePedido(nomePedido);
				pd.setEscolhidoPedido(escolhidoPedido);
				pd.setQuantidadePedido(quantidadePedido);
				
				//Adicionando ao ArrayList
				Pedidos.dados.add(pd);
				
				//Mensagem sobre o que ocorreu
				mensagemErro = "\n\n    Produto cadastrado\n           com Sucesso!";
				
			}else if(codErro == 1) {
				mensagemErro = "#ERRO01";
				mensagemErro+="\nCampo: Quantidade";
				mensagemErro+="\n\n#Como resolver";
				mensagemErro+="\nN�o deixe nenhum\ncampo em branco";
				
			}else if(codErro == 2) {	
				mensagemErro = "#ERRO02";
				mensagemErro+="\nCampo: Quantidade";
				mensagemErro+="\n\nComo resolver";
				mensagemErro+="\nDigite apenas n�meros";
		
			}

		}
	}
}

