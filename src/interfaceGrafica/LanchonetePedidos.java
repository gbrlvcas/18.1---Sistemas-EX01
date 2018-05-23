package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		
		
//Botões ================================================================================================================

		
		//Sair
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(350, 180, 70, 25);
		btnSair.setFont(new Font("Calibri", Font.BOLD, 16));
		btnSair.setBackground(Color.DARK_GRAY);
		btnSair.setForeground(Color.RED);
		
		//Função[Sair]
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
				
				//Botões
				cxPedidos.add(btnSair);
						
				//Background
				cxPedidos.add(BGPedidos);
				
				//Deixar programa visivel
				cxPedidos.setVisible(true);
		
	}
}
