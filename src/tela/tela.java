import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class tela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
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
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 487, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnCompactat = new JRadioButton("Compactar");
		rdbtnCompactat.setBounds(24, 25, 77, 23);
		frame.getContentPane().add(rdbtnCompactat);
		
		JRadioButton rdbtnDescompactar = new JRadioButton("Descompactar");
		rdbtnDescompactar.setBounds(24, 73, 109, 23);
		frame.getContentPane().add(rdbtnDescompactar);
		
		JLabel lblArquivoOrigem = new JLabel("Arquivo origem");
		lblArquivoOrigem.setBounds(24, 121, 109, 14);
		frame.getContentPane().add(lblArquivoOrigem);
		
		JLabel lblArquivoDestino = new JLabel("Arquivo destino");
		lblArquivoDestino.setBounds(24, 205, 109, 14);
		frame.getContentPane().add(lblArquivoDestino);
		
		textField = new JTextField();
		textField.setBounds(24, 146, 430, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 231, 430, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnProcessar = new JButton("Processar");
		btnProcessar.setBounds(24, 289, 89, 23);
		frame.getContentPane().add(btnProcessar);
	}
}
