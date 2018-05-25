package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import codigo.Acao;
import codigo.Pedidos;
import codigo.Produto;

public class LanchonetePedidos {

	public LanchonetePedidos() {
		
		//Janela Pedidos
		JFrame cxPedidos = new JFrame("Lanchonete 8Bits - Histórico");
		cxPedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxPedidos.setSize(480, 270);
		cxPedidos.setLocationRelativeTo(null);

//Componentes ==========================================================================================================
		
		//Descrição das caixas JText
		JTextArea txtDescricao = new JTextArea("          Nome\n\n        Pedido\n\nQuantidade");
		txtDescricao.setEditable(false);
		txtDescricao.setBounds(20, 20, 100, 200);
		txtDescricao.setOpaque(false);
		txtDescricao.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDescricao.setForeground(Color.RED);
		
		//Caixa [Nome]
		JTextField txtNome = new JTextField();
		txtNome.setBounds(130, 20, 150, 25 );
		txtNome.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		//Caixa [Pedido]
		JComboBox<String> comboPedido = new JComboBox<>();
		comboPedido.setBounds(130, 75, 150, 25 );
		comboPedido.setFont(new Font("Calibri", Font.PLAIN, 15));
		comboPedido.removeAllItems();
		comboPedido.setModel(new DefaultComboBoxModel<>(new Vector(Produto.dados)));
		
		
		//Caixa [Quantidade]
		JTextField txtQuantidade = new JTextField();
		txtQuantidade.setBounds(130, 125, 50, 25 );
		txtQuantidade.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Resultado [Pedido]
		JTextArea txtMensagem = new JTextArea("");
		txtMensagem.setBounds(300, 25, 150, 125);
		txtMensagem.setFont(new Font("Calibri", Font.BOLD, 15));
		txtMensagem.setVisible(false);
		
		
		//Instanciando a classe ação
		Acao a = new Acao();
		

//Botões ================================================================================================================

		//Novo Pedido
		JButton btnPedidoNovo = new JButton("Novo Cadastro");
		btnPedidoNovo.setBounds(50, 180, 190, 25);
		btnPedidoNovo.setFont(new Font("Calibri", Font.BOLD, 16));
		btnPedidoNovo.setBackground(Color.DARK_GRAY);
		btnPedidoNovo.setForeground(Color.RED);
		btnPedidoNovo.setVisible(false);
		
		
		//Fazer pedido
		JButton btnPedir = new JButton("Pedir");
		btnPedir.setBounds(120, 180, 70, 25);
		btnPedir.setFont(new Font("Calibri", Font.BOLD, 16));
		btnPedir.setBackground(Color.DARK_GRAY);
		btnPedir.setForeground(Color.RED);
		
		//Função [Pedir]
		btnPedir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Capturar dados
				String nomePedido = txtNome.getText();
				String escolhidoPedido = comboPedido.getSelectedItem().toString();
				String quantidadePedido = txtQuantidade.getText();
				
				Pedidos pd = new Pedidos();
				
				
				
				
				//Buscar método na classe Ação
				a.RegistrarPedido(nomePedido, escolhidoPedido, quantidadePedido);
				
				//Mostrar resultado do cadastro
				txtMensagem.setText(a.mensagemErro);
				txtMensagem.setVisible(true);
				
				if(a.codErro == 0) {
				
				//Trocando o botão de pedido
				btnPedir.setVisible(false);
				btnPedidoNovo.setVisible(true);
				
				//Função [Novo Pedido]
				btnPedidoNovo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//Limpar os campos
						txtNome.setText("");
						comboPedido.setSelectedIndex(-1);
						txtQuantidade.setText("");
						txtMensagem.setVisible(false);
						btnPedidoNovo.setVisible(false);
						btnPedir.setVisible(true);
						
					}
				});
					
				}
				
			}
		});
		
		//Sair
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(350, 180, 70, 25);
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
				cxPedidos.dispose();
				
			}
		});
		
		
//Componentes ===========================================================================================================
		
		//Background
		JLabel BGPedidos = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\18.1 - Sistemas EX01\\src\\interfaceGrafica\\BGPrincipal.gif"));
		BGPedidos.setBounds(0, 0, 480, 270);
						
		//Adicionando aos componentes
		
				//Descrição
				cxPedidos.add(txtDescricao);
				
				//Caixas
				cxPedidos.add(txtNome);
				cxPedidos.add(comboPedido);
				cxPedidos.add(txtQuantidade);
				cxPedidos.add(txtMensagem);
				
				//Botões
				cxPedidos.add(btnPedidoNovo);
				cxPedidos.add(btnPedir);
				cxPedidos.add(btnSair);
						
				//Background
				cxPedidos.add(BGPedidos);
				
				//Deixar programa visivel
				cxPedidos.setVisible(true);
		
	}
}
