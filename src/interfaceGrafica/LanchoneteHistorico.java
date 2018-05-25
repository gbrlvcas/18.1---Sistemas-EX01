package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import codigo.Acao;

public class LanchoneteHistorico {

	public LanchoneteHistorico() {
		
		//Janela Histórico
		JFrame cxHistorico = new JFrame("Lanchonete 8Bits - Histórico");
		cxHistorico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxHistorico.setSize(480, 270);
		cxHistorico.setLocationRelativeTo(null);
		
		//Instanciar objeto [Ação]
		Acao a = new Acao();
		
		//Tabela de histórico dos pedidos
		JTable dadosPedido = new JTable(a.ListarPedidos());
		
		
		//Barra de rolagem - As dimensões da mesma irão afetar no tamanho do JTable
		JScrollPane barra = new JScrollPane(dadosPedido);
		barra.setBounds(0, 0, 460, 170);
		
//Bloquear edição da tabela =============================================================================================
		
		//Evento do mouse
		dadosPedido.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
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
				cxHistorico.dispose();
				
			}
		});
		
		
//Componentes ===========================================================================================================
		
		//Background
		JLabel BGHistorico = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\18.1 - Sistemas EX01\\src\\interfaceGrafica\\BGPrincipal.gif"));
		BGHistorico.setBounds(0, 0, 480, 270);
						
		//Adicionando aos componentes
				
				//Tabela
				cxHistorico.add(barra);
		
				//Botões
				cxHistorico.add(btnSair);
						
				//Background
				cxHistorico.add(BGHistorico);
				
				//Deixar programa visivel
				cxHistorico.setVisible(true);
		
	}
}
