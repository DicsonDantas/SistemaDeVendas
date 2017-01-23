package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ControleItem;
import model.DAO.ItemDAO;
import model.dominio.Item;

public class TelaCadastroItem extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoPreco;
	private JTextField campoDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroItem frame = new TelaCadastroItem();
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
	public TelaCadastroItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :  ");
		lblNome.setBounds(108, 56, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblPreco = new JLabel("Preco : ");
		lblPreco.setBounds(108, 81, 46, 14);
		contentPane.add(lblPreco);
		
		JLabel lblDescricao = new JLabel("Descricao : ");
		lblDescricao.setBounds(89, 108, 56, 14);
		contentPane.add(lblDescricao);
		
		campoNome = new JTextField();
		campoNome.setBounds(146, 53, 86, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoPreco = new JTextField();
		campoPreco.setBounds(146, 78, 86, 20);
		contentPane.add(campoPreco);
		campoPreco.setColumns(10);
		campoDescricao = new JTextField();
		campoDescricao.setBounds(146, 106, 86, 20);
		contentPane.add(campoDescricao);
		campoDescricao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ControleItem controleitem = new ControleItem(); 
				Item item = new Item(); 
				ItemDAO itemdao = new ItemDAO(); 
				
				try {

					item.setNome(campoNome.getText());
					item.setPreco(Double.valueOf(campoPreco.getText()));
					item.setDescricao(campoDescricao.getText());
						
					itemdao.incluir(item);
					
				} catch (Exception e) {
					e.getMessage(); 
				}
				
				

			}
		});
		btnSalvar.setBounds(143, 151, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblCadastroDeItem = new JLabel("Cadastro de Item");
		lblCadastroDeItem.setBounds(153, 11, 102, 14);
		contentPane.add(lblCadastroDeItem);
	}
}
