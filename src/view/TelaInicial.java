package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.Normalizer.Form;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		super("Sistema de Vendas"); 
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		JMenuItem mntmRealizarCadastro = new JMenuItem("Realizar Cadastro");
		mntmRealizarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Sistema de Cadastro de Cliente");
			TelaCadastroCli formcadastro = new TelaCadastroCli();
			formcadastro.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            formcadastro.setTitle("Cadastro de Clientes");
            formcadastro.setLocationRelativeTo(null);
            formcadastro.setResizable(false);
            formcadastro.setVisible(true);
			  
			}
			
			
		});
		menuCadastro.add(mntmRealizarCadastro);
		
		JMenuItem mntmAlterarCadastro = new JMenuItem("Alterar Cadastro");
		menuCadastro.add(mntmAlterarCadastro);
		
		JMenuItem mntmExcluirCadastro = new JMenuItem("Excluir Cadastro");
		menuCadastro.add(mntmExcluirCadastro);
		
		JMenu menuOpAdministrativas = new JMenu("Op. Administrativas");
		menuBar.add(menuOpAdministrativas);
		
		JMenuItem mntmAbrirCaixa = new JMenuItem("Abrir caixa");
		menuOpAdministrativas.add(mntmAbrirCaixa);
		
		JMenuItem mntmFecharCaixa = new JMenuItem("Fechar caixa");
		menuOpAdministrativas.add(mntmFecharCaixa);
		
		JMenuItem mntmIncluirItem = new JMenuItem("Incluir item");
		mntmIncluirItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Sistema de Inclusão de itens!");
				TelaCadastroItem telacadastroitem = new TelaCadastroItem();
				telacadastroitem.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				telacadastroitem.setTitle("Cadastro de Itens");
				telacadastroitem.setLocationRelativeTo(null);
				telacadastroitem.setResizable(false);
				telacadastroitem.setVisible(true);
			
			
			}
		});
		menuOpAdministrativas.add(mntmIncluirItem);
		
		JMenuItem mntmExcluirItem = new JMenuItem("Excluir item");
		menuOpAdministrativas.add(mntmExcluirItem);
		
		JMenuItem mntmAlterarItem = new JMenuItem("Alterar item");
		menuOpAdministrativas.add(mntmAlterarItem);
		
		JMenu menuRealizarPedido = new JMenu("Pedido");
		menuBar.add(menuRealizarPedido);
		
		JMenuItem mntmEfetuarPedido = new JMenuItem("Efetuar pedido");
		menuRealizarPedido.add(mntmEfetuarPedido);
		
		JMenuItem mntmFinalizarPedido = new JMenuItem("Finalizar Pedido");
		menuRealizarPedido.add(mntmFinalizarPedido);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnVendaDireta = new JButton("Venda Direta");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVendaDireta, -120, SpringLayout.EAST, contentPane);
		btnVendaDireta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnVendaDireta);
		
		JButton btnVendaFidelizada = new JButton("Venda Fidelizada");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVendaFidelizada, 67, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVendaFidelizada, -120, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVendaDireta, 0, SpringLayout.WEST, btnVendaFidelizada);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVendaDireta, -6, SpringLayout.NORTH, btnVendaFidelizada);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVendaFidelizada, 49, SpringLayout.NORTH, contentPane);
		contentPane.add(btnVendaFidelizada);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCadastrarCliente, 6, SpringLayout.SOUTH, btnVendaFidelizada);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCadastrarCliente, 67, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCadastrarCliente, -120, SpringLayout.EAST, contentPane);
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Sistema de Cadastro de Cliente");
				TelaCadastroCli formcadastro = new TelaCadastroCli();
				formcadastro.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	            formcadastro.setTitle("Cadastro de Clientes");
	            formcadastro.setLocationRelativeTo(null);
	            formcadastro.setResizable(false);
	            formcadastro.setVisible(true);
			}
		});
		contentPane.add(btnCadastrarCliente);
		
		JButton btnCadastrarItem = new JButton("Cadastrar Item");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCadastrarItem, 6, SpringLayout.SOUTH, btnCadastrarCliente);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCadastrarItem, 67, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCadastrarItem, -120, SpringLayout.EAST, contentPane);
		btnCadastrarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sistema de Inclusão de itens!");
				TelaCadastroItem telacadastroitem = new TelaCadastroItem();
				telacadastroitem.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				telacadastroitem.setTitle("Cadastro de Itens");
				telacadastroitem.setLocationRelativeTo(null);
				telacadastroitem.setResizable(false);
				telacadastroitem.setVisible(true);
			}
		});
		contentPane.add(btnCadastrarItem);
		
		JButton btnFecharCaixa = new JButton("Fechar Caixa");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFecharCaixa, 6, SpringLayout.SOUTH, btnCadastrarItem);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFecharCaixa, 67, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFecharCaixa, -120, SpringLayout.EAST, contentPane);
		contentPane.add(btnFecharCaixa);
	}
}
