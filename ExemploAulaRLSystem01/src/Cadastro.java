import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtTxtidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 159);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 124, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnGo = new JButton("Cadastrar");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setIdade(Integer.parseInt(txtTxtidade.getText()));
				JOptionPane.showMessageDialog(null,  cliente.salvar());
			}
		});
		btnGo.setBounds(65, 71, 89, 23);
		frame.getContentPane().add(btnGo);
		
		JLabel lblidade = new JLabel("Idade");
		lblidade.setBounds(10, 46, 46, 14);
		frame.getContentPane().add(lblidade);
		
		txtTxtidade = new JTextField();
		txtTxtidade.setBounds(66, 41, 124, 20);
		frame.getContentPane().add(txtTxtidade);
		txtTxtidade.setColumns(10);
	}
}
