package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import codigo.Acao;

public class LanchoneteCadastrar {

	public LanchoneteCadastrar() {
		
		//Janela Cadastrar
		JFrame cxCadastrar = new JFrame("Lanchonete 8Bits - Cadastrar");
		cxCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxCadastrar.setSize(480, 270);
		cxCadastrar.setLocationRelativeTo(null);
		
//Componentes ==========================================================================================================
		
		//Descrição das caixas JText
		JTextArea txtDescricao = new JTextArea("Produto\n\n     Valor");
		txtDescricao.setEditable(false);
		txtDescricao.setBounds(20, 20, 70, 100);
		txtDescricao.setOpaque(false);
		txtDescricao.setFont(new Font("Calibri", Font.BOLD, 20));
		
		//Caixa [Produto]
		JTextField txtProduto = new JTextField();
		txtProduto.setBounds(100, 25, 150, 25 );
		txtProduto.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		//Caixa [Valor]
		JTextField txtValor = new JTextField();
		txtValor.setBounds(100, 75, 100, 25 );
		txtValor.setFont(new Font("Calibri", Font.PLAIN, 15));
		
		//Resultado [Cadastro]
		JTextArea txtMensagem = new JTextArea("");
		txtMensagem.setBounds(300, 25, 150, 125);
		txtMensagem.setFont(new Font("Calibri", Font.BOLD, 15));
		txtMensagem.setVisible(false);

		
		
		//Instanciando o construtor
		Acao a = new Acao();
		
		

//Botões ================================================================================================================
		
		//Cadastrar Novamente
		JButton btnCadastrarNovo = new JButton("Cadastrar Novamente");
		btnCadastrarNovo.setBounds(50, 120, 190, 25);
		btnCadastrarNovo.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCadastrarNovo.setBackground(Color.DARK_GRAY);
		btnCadastrarNovo.setForeground(Color.RED);
		btnCadastrarNovo.setVisible(false);

		//Cadastrar
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(100, 120, 100, 25);
		btnCadastrar.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCadastrar.setBackground(Color.DARK_GRAY);
		btnCadastrar.setForeground(Color.RED);
		
		//Função[Cadastrar]
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//Atribuir valores digitados no JText
				String nomeProduto = txtProduto.getText();
				String valorProduto = txtValor.getText();
				
				//Buscar método na classe Ação
				a.CadastrarProduto(nomeProduto, valorProduto);
				
				//Mostrar resultado do cadastro
				txtMensagem.setText(a.mensagemErro);
				txtMensagem.setVisible(true);
				
				if(a.codErro == 0) {
					
				//Trocando o botão Cadastrar
				btnCadastrar.setVisible(false);
				btnCadastrarNovo.setVisible(true);
				
				//Função [Cadastrar Novamente]
				btnCadastrarNovo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//Limpar os campos
						txtProduto.setText("");
						txtValor.setText("");
						txtMensagem.setVisible(false);
						btnCadastrarNovo.setVisible(false);
						btnCadastrar.setVisible(true);
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
		
		
//Adicionar aos componentes ===========================================================================================================
		
		//Background
		JLabel BGCadastrar = new JLabel(new ImageIcon("C:\\Users\\Gbrlvcas\\Desktop\\Programacao\\18.1 - Sistemas EX01\\src\\interfaceGrafica\\BGPrincipal.gif"));
		BGCadastrar.setBounds(0, 0, 480, 270);
						
		//Adicionando aos componentes
		
				//Descrição
				cxCadastrar.add(txtDescricao);			
				
				//Caixas
				cxCadastrar.add(txtProduto);
				cxCadastrar.add(txtValor);
				cxCadastrar.add(txtMensagem);
				
				//Botões
				cxCadastrar.add(btnCadastrarNovo);
				cxCadastrar.add(btnCadastrar);
				cxCadastrar.add(btnSair);
						
				//Background
				cxCadastrar.add(BGCadastrar);
				
				//Deixar programa visivel
				cxCadastrar.setVisible(true);
				
		
	}
}
