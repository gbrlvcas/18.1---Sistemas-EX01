package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import codigo.Acao;
import codigo.Pedidos;

public class LanchoneteEstatisticas {

	public LanchoneteEstatisticas() {
		
		//Janela Estatisticas
		JFrame cxEstatisticas = new JFrame("Lanchonete 8Bits - Estatisticas");
		cxEstatisticas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxEstatisticas.setSize(480, 270);
		cxEstatisticas.setLocationRelativeTo(null);
		
//Componentes ===========================================================================================================
		
		//Escolher o tipo de filtro
		JComboBox<String> comboFiltragem = new JComboBox<>();
		comboFiltragem.setBounds(10, 10, 100, 30);
		comboFiltragem.addItem("Filtrar por");
		comboFiltragem.addItem("Nome");
		comboFiltragem.addItem("Produto");
		comboFiltragem.addItem("Data");
		
		
		//Escolher a filtragem desejada
		JComboBox<String> comboFiltrado = new JComboBox<>();
		comboFiltrado.setBounds(120, 10, 200, 30);
		
		//Instanciar objeto [Ação]
		Acao a = new Acao();
		
		//Tabela de estatisticas dos pedidos
		JTable estatisticasPedidos = new JTable();
		a.filtragem = "Filtrar por";
		
		//Barra de rolagem
		JScrollPane barra = new JScrollPane(estatisticasPedidos);
		barra.setBounds(0, 50, 460, 140);
		
		//Seleção JComboBox
		
		comboFiltragem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Variavel
				a.filtragem = comboFiltragem.getSelectedItem().toString();
			
				//Remover do combo toda vez que o filtro for alterado
				comboFiltrado.removeAllItems();
				
				//Condicional e adicionar valores ao segundo comb
			
				switch(a.filtragem) {
				
				case "Filtrar por":
					comboFiltrado.setSelectedIndex(-1);
					
				break;
				
				case "Nome":
					for(Pedidos i: Pedidos.dados) {
						comboFiltrado.addItem(i.getNomePedido());
					}
				break;
				
				case "Produto":
					for(Pedidos i: Pedidos.dados) {
						comboFiltrado.addItem(i.getEscolhidoPedido());
					}
				break;
				
				case "Data":
					for(Pedidos i: Pedidos.dados) {
						comboFiltrado.addItem(i.getDataDias());
					}
				break;
				}
	
		}
		});
		
				
				//Botão para filtrar
				JButton btnFiltrar = new JButton("Filtrar");
				btnFiltrar.setBounds(330, 10, 100, 30);
				btnFiltrar.setFont(new Font("Calibri", Font.BOLD, 16));
				btnFiltrar.setBackground(Color.DARK_GRAY);
				btnFiltrar.setForeground(Color.RED);
				
				//Função do botão
				btnFiltrar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Capturando o valor selecionado do combo filtrado
						a.filtrado = comboFiltrado.getSelectedItem().toString();
						
						//Instanciando a classe [Classe: Acao / Método: Listar Estatistica]
						a.ListarEstatisticas();
						
						
						
					}
				});
		
		

	
		
//Botões ================================================================================================================
		
		//Sair
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(370, 200, 70, 25);
		btnSair.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSair.setBackground(Color.DARK_GRAY);
		btnSair.setForeground(Color.RED);
		
		//Função [Sair]
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Redirecionar para parte Principal
				LanchonetePrincipal LP = new LanchonetePrincipal();
				
				//Fechar janela atual
				cxEstatisticas.dispose();
				
			}
		});
		
		
//Componentes ===========================================================================================================
		
		//Background
		JLabel BGEstatisticas = new JLabel(new ImageIcon(getClass().getResource("/BG.gif")));
		BGEstatisticas.setBounds(0, 0, 480, 270);
						
		//Adicionando aos componentes
		
				//Componentes
				cxEstatisticas.add(comboFiltragem);
				cxEstatisticas.add(comboFiltrado);
				cxEstatisticas.add(comboFiltrado);
				cxEstatisticas.add(barra);
				
				//Botões
				cxEstatisticas.add(btnSair);
				cxEstatisticas.add(btnFiltrar);
						
				//Background
				cxEstatisticas.add(BGEstatisticas);
				
				//Deixar programa visivel
				cxEstatisticas.setVisible(true);
		
	}
}
