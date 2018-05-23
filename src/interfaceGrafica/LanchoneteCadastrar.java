package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LanchoneteCadastrar {

	public LanchoneteCadastrar() {
		
		//Janela Cadastrar
		JFrame cxCadastrar = new JFrame("Lanchonete 8Bits - Cadastrar");
		cxCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxCadastrar.setSize(480, 270);
		cxCadastrar.setLocationRelativeTo(null);
		
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
				cxCadastrar.dispose();
				
			}
		});
		
		
//Componentes ===========================================================================================================
		
		//Background
		JLabel BGCadastrar = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\18.1 - Sistemas EX01\\src\\interfaceGrafica\\BGPrincipal.gif"));
		BGCadastrar.setBounds(0, 0, 480, 270);
						
		//Adicionando aos componentes
				
				//Botões
				cxCadastrar.add(btnSair);
						
				//Background
				cxCadastrar.add(BGCadastrar);
				
				//Deixar programa visivel
				cxCadastrar.setVisible(true);
		
	}
}
