package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LanchoneteHistorico {

	public LanchoneteHistorico() {
		
		//Janela Histórico
		JFrame cxHistorico = new JFrame("Lanchonete 8Bits - Histórico");
		cxHistorico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxHistorico.setSize(480, 270);
		cxHistorico.setLocationRelativeTo(null);
		
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
				
				//Botões
				cxHistorico.add(btnSair);
						
				//Background
				cxHistorico.add(BGHistorico);
				
				//Deixar programa visivel
				cxHistorico.setVisible(true);
		
	}
}
