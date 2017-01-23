package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaVendaDireta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdProduto;
	private JTextField textFieldPrecoUnit;
	private JTextField textFieldQuantidade;
	private JTextField textFieldDesconto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendaDireta frame = new TelaVendaDireta();
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
	public TelaVendaDireta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 200, 256);
		contentPane.add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/carrinho.png")).getImage();
		img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);  
		lblNewLabel.setIcon(new ImageIcon(img)); 
		
		JLabel lblIdProduto = new JLabel("ID Produto");
		lblIdProduto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdProduto.setBounds(10, 289, 144, 37);
		contentPane.add(lblIdProduto);
		
		JLabel lblPrecoUnit = new JLabel("PrecoUnitario");
		lblPrecoUnit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecoUnit.setBounds(126, 295, 122, 24);
		contentPane.add(lblPrecoUnit);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantidade.setBounds(236, 295, 85, 24);
		contentPane.add(lblQuantidade);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesconto.setBounds(339, 300, 78, 14);
		contentPane.add(lblDesconto);
		
		textFieldIdProduto = new JTextField();
		textFieldIdProduto.setBounds(10, 324, 86, 20);
		contentPane.add(textFieldIdProduto);
		textFieldIdProduto.setColumns(10);
		
		textFieldPrecoUnit = new JTextField();
		textFieldPrecoUnit.setBounds(126, 324, 86, 20);
		contentPane.add(textFieldPrecoUnit);
		textFieldPrecoUnit.setColumns(10);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setBounds(236, 324, 86, 20);
		contentPane.add(textFieldQuantidade);
		textFieldQuantidade.setColumns(10);
		
		textFieldDesconto = new JTextField();
		textFieldDesconto.setBounds(339, 324, 86, 20);
		contentPane.add(textFieldDesconto);
		textFieldDesconto.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total : ");
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorTotal.setBounds(369, 372, 90, 14);
		contentPane.add(lblValorTotal);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(455, 323, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblTeclasDeAtalho = new JLabel("Teclas de Atalho");
		lblTeclasDeAtalho.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeclasDeAtalho.setBounds(465, 11, 100, 14);
		contentPane.add(lblTeclasDeAtalho);
		
		JLabel lblFPesquisar = new JLabel("F4 - Pesquisar Item");
		lblFPesquisar.setBounds(465, 52, 115, 14);
		contentPane.add(lblFPesquisar);
		
		JLabel lblF = new JLabel("F5 - Cancelar Item");
		lblF.setBounds(465, 77, 100, 14);
		contentPane.add(lblF);
		
		JLabel lblFFinalizar = new JLabel("F8 - Finalizar Pedido");
		lblFFinalizar.setBounds(465, 127, 100, 14);
		contentPane.add(lblFFinalizar);
		
		JLabel lblFCancelar = new JLabel("F6 - Cancelar Cupom");
		lblFCancelar.setBounds(465, 102, 100, 14);
		contentPane.add(lblFCancelar);
		
		
		
	}
}
