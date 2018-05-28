package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LanchonetePrincipal {

	public LanchonetePrincipal() {
		
		//Janela principal
		JFrame cxPrincipal = new JFrame("Lanchonete 8Bits");
		cxPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxPrincipal.setSize(480, 270);
		cxPrincipal.setLocationRelativeTo(null);
		
		
//Botões ================================================================================================================
		
		//Cadastro
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(10, 20, 100, 25);
		btnCadastro.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCadastro.setBackground(Color.DARK_GRAY);
		btnCadastro.setForeground(Color.RED);
		
		//Função [Cadastro]
		btnCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Redirecionar para parte de Cadastro
				LanchoneteCadastrar LC = new LanchoneteCadastrar();
			
				//Fechar janela atual
				cxPrincipal.dispose();
			
			
			
				
			}
		});
		
		
		//Fim [Cadastro]=================================================================================================
		

		//Pedidos
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setBounds(120, 20, 100, 25);
		btnPedidos.setFont(new Font("Calibri", Font.BOLD, 16));
		btnPedidos.setBackground(Color.DARK_GRAY);
		btnPedidos.setForeground(Color.RED);
		
		//Função [Pedidos]
		btnPedidos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Redirecionar para parte Pedidos
				LanchonetePedidos LP = new LanchonetePedidos();
				
				//Fechar janela atual
				cxPrincipal.dispose();
				
				
			}
		});
		
		//Fim [Pedidos]=================================================================================================
		
		//Histórico
		JButton btnHistorico = new JButton("Histórico");
		btnHistorico.setBounds(230, 20, 100, 25);
		btnHistorico.setFont(new Font("Calibri", Font.BOLD, 16));
		btnHistorico.setBackground(Color.DARK_GRAY);
		btnHistorico.setForeground(Color.RED);
		
		//Função [Histórico]
		btnHistorico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Redirecionar para parte de Histórico
				LanchoneteHistorico LH = new LanchoneteHistorico();
				
				//Fechar janela atual
				cxPrincipal.dispose();
				
			}
		});
		
		//Fim [Histórico]=================================================================================================
		
		//Estatisticas
		JButton btnEstatisticas = new JButton("Estatisticas");
		btnEstatisticas.setBounds(340, 20, 109, 25);
		btnEstatisticas.setFont(new Font("Calibri", Font.BOLD, 16));
		btnEstatisticas.setBackground(Color.DARK_GRAY);
		btnEstatisticas.setForeground(Color.RED);
		
		//Função [Estatisticas]
		btnEstatisticas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Redirecionar para parte de Estatisticas
				LanchoneteEstatisticas LE = new LanchoneteEstatisticas();
				
				//Fechar janela atual
				cxPrincipal.dispose();
				
			}
		});
		
		//Fim [Histórico]=================================================================================================
		
		
		
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

				//Fechar janela atual
				cxPrincipal.dispose();
				
			}
		});
		
	
//Adicionar os componentes ===========================================================================================================
		
		//Background
		JLabel BGPrincipal = new JLabel(new ImageIcon(getClass().getResource("/BG.gif")));
		BGPrincipal.setBounds(0, 0, 480, 270);
				
		//Adicionando aos componentes
		
				//Botões
				cxPrincipal.add(btnCadastro);
				cxPrincipal.add(btnPedidos);
				cxPrincipal.add(btnHistorico);
				cxPrincipal.add(btnEstatisticas);
				cxPrincipal.add(btnSair);
				
				//Background
				cxPrincipal.add(BGPrincipal);
		
		//Deixar programa visivel
		cxPrincipal.setVisible(true);
		
		
		
		
	}
}
