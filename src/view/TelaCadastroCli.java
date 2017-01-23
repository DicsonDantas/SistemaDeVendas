package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import model.DAO.ClienteDAO;
import model.dominio.Cliente;

public class TelaCadastroCli extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField campoNome;
	private JTextField campoEndereco;
	private JTextField campoTel;
	private JTextField campoCpf;
	private JTextField campoEmail;
	private JTextField campoDataNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaCadastroCli dialog = new TelaCadastroCli();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaCadastroCli() {
		setBounds(100, 100, 450, 409);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel painelCadastro = new JPanel();
		painelCadastro.setBorder(new TitledBorder(null, "Formulario de Cadastro", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		painelCadastro.setBounds(73, 29, 294, 258);
		contentPanel.add(painelCadastro);
		
		JLabel lblNome = new JLabel("Nome : ");
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco :");
		
		campoEndereco = new JTextField();
		campoEndereco.setColumns(10);
		
		campoTel = new JTextField();
		campoTel.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone : ");
		
		JLabel lblCpf = new JLabel("CPF :");
		
		campoCpf = new JTextField();
		campoCpf.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email : ");
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cli = new Cliente(); 
				ClienteDAO  clidao = new ClienteDAO();
				
				cli.setNome(campoNome.getText());
				cli.setCpf(campoCpf.getText());
				cli.setEmail(campoEmail.getText());
				cli.setDatanasc(campoDataNasc.getText());	
				cli.setTelefone(campoTel.getText());
				
				clidao.incluir(cli);
				
			
			}
		});
		
		JLabel lblDatanasc = new JLabel("DataNasc :");
		
		campoDataNasc = new JTextField();
		campoDataNasc.setColumns(10);
		GroupLayout gl_painelCadastro = new GroupLayout(painelCadastro);
		gl_painelCadastro.setHorizontalGroup(
			gl_painelCadastro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelCadastro.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelCadastro.createSequentialGroup()
							.addComponent(lblNome)
							.addGap(18)
							.addComponent(campoNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelCadastro.createSequentialGroup()
							.addGroup(gl_painelCadastro.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEndereco)
								.addComponent(lblTelefone, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblCpf)
								.addComponent(lblEmail))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_painelCadastro.createParallelGroup(Alignment.LEADING)
								.addComponent(campoEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(campoCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(campoTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(campoEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(campoDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(92))
				.addGroup(gl_painelCadastro.createSequentialGroup()
					.addGap(43)
					.addComponent(lblDatanasc)
					.addContainerGap(186, Short.MAX_VALUE))
				.addGroup(gl_painelCadastro.createSequentialGroup()
					.addContainerGap(115, Short.MAX_VALUE)
					.addComponent(botaoSalvar)
					.addGap(104))
		);
		gl_painelCadastro.setVerticalGroup(
			gl_painelCadastro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelCadastro.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(campoNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereco)
						.addComponent(campoEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(campoCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(campoEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDatanasc)
						.addComponent(campoDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(botaoSalvar)
					.addContainerGap())
		);
		painelCadastro.setLayout(gl_painelCadastro);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
