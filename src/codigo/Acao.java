package codigo;


import java.time.LocalDateTime;

import javax.swing.table.DefaultTableModel;

public class Acao {
	
	//Atributos
	public String mensagemErro = "";
	public int codErro;
	public String filtragem;
	public String filtrado;
	
	
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
		//Caso cliente digite algo diferente de um número
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

	
	//Método para Validar e registrar pedido
	public void RegistrarPedido(String nomePedido, String escolhidoPedido, String quantidadePedido) {
		
		//Setando as variaveis para nulo [Pois ja foram usados no método anterior]
		codErro = 0;
		mensagemErro = "";
		
		//Variaveis
		int erro;
		
		//Caso cliente deixe o campo em branco
		if(quantidadePedido.equals("")) {
			codErro = 1;
	
		}
		
		
		if(codErro == 0) {
		//Caso cliente digite algo diferente de um número
			try {
				erro = Integer.parseInt(quantidadePedido);
			}catch(Exception e) {
				codErro = 2;
			}
			
			//Condicional - Resultado do cadastro do pedido
			if(codErro == 0) {
				//Instanciar o objeto [Tempo]
				LocalDateTime tempo = LocalDateTime.now();
				
				//Variaveis para pegar o tempo
				int dia = tempo.getDayOfMonth();
				int mes = tempo.getMonthValue();
				int ano = tempo.getYear();
				int hora = tempo.getHour();
				int minutos = tempo.getMinute();
				int segundos = tempo.getSecond();
				
				//Concatenando os dados [Tempo]
				String dataDias = dia+"/"+mes+"/"+ano;
				String dataTempo = hora+":"+minutos+":"+segundos;
				
				//Istanciando a classe [Pedidos]
				Pedidos pd = new Pedidos();
				
				//Capturando o valor do pedido escolhido
				double valorPedidoEscolhido = 0;
				
					for(int indice = 0; indice <= Produto.dados.size(); indice++) {
						
						if(Produto.dados.get(indice).getNomeProduto().equals(escolhidoPedido)) {
							
							valorPedidoEscolhido = Produto.dados.get(indice).getValorProduto();
							break;
						}
						
					}
				
				//Somando o valor dos pedidos
				double somaPedido = Double.parseDouble(quantidadePedido) * valorPedidoEscolhido;
				
				//Atribuindo os nomes as variaveis da classe [Pedidos]
				pd.setNomePedido(nomePedido);
				pd.setEscolhidoPedido(escolhidoPedido);
				pd.setQuantidadePedido(quantidadePedido);
				pd.setSomaPedido(somaPedido);
				pd.setDataDias(dataDias);
				pd.setDataTempo(dataTempo);
				
				//Adicionando ao ArrayList
				Pedidos.dados.add(pd);
			
				
				//Mensagem sobre o que ocorreu
				mensagemErro = "\n\n    Produto cadastrado\n           com Sucesso!";
				
			}else if(codErro == 1) {
				mensagemErro = "#ERRO01";
				mensagemErro+="\nCampo: Quantidade";
				mensagemErro+="\n\n#Como resolver";
				mensagemErro+="\nNão deixe nenhum\ncampo em branco";
				
			}else if(codErro == 2) {	
				mensagemErro = "#ERRO02";
				mensagemErro+="\nCampo: Quantidade";
				mensagemErro+="\n\nComo resolver";
				mensagemErro+="\nDigite apenas números";
		
			}

		}
		
	}
	
	//Método para exibir o histórico de pedidos
	public DefaultTableModel ListarPedidos() {
		
		//DefaultTableModel [Nomear as colunas]
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Pedido");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor");
		modelo.addColumn("Horario");
		modelo.addColumn("Data");
		
		
		//USAR AS DUAS VARIAVEIS FILTRADO E FILTRAGEM PARA PODER GERAR O TABLE LIST
		
		//Realizar o for int para adicionar todos os dados cadastrados
		for (int indice = 0 ; indice < Pedidos.dados.size(); indice++) {
			modelo.addRow(new Object[]  {
				Pedidos.dados.get(indice).getNomePedido(),
				Pedidos.dados.get(indice).getEscolhidoPedido(),
				Pedidos.dados.get(indice).getQuantidadePedido(),
				Pedidos.dados.get(indice).getSomaPedido(),
				Pedidos.dados.get(indice).getDataTempo(),
				Pedidos.dados.get(indice).getDataDias()
			});
			
			}
		
			//Retornar o modelo da JTable
			return modelo;
			}
	
	
	
	//Método para exibir a estatisticas dos pedidos
	public DefaultTableModel ListarEstatisticas() {
	
		//DefaultTableModel [Nomear as colunas]
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Pedido");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor");
		modelo.addColumn("Horario");
		modelo.addColumn("Data");
		
		//Realizar o for int para adicionar todos os dados cadastrados

		for(int indice = 0 ; indice < Pedidos.dados.size(); indice++) { 
			
			System.out.println("Filtrado "+filtrado);
			
			modelo.addRow(new Object[]  {
					Pedidos.dados.get(indice).getNomePedido(),
					Pedidos.dados.get(indice).getEscolhidoPedido(),
					Pedidos.dados.get(indice).getQuantidadePedido(),
					Pedidos.dados.get(indice).getSomaPedido(),
					Pedidos.dados.get(indice).getDataTempo(),
					Pedidos.dados.get(indice).getDataDias()
			
			
				});
		
		
			}
	
		
			

		
		return modelo;
	}



	}


