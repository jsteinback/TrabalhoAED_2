package tela;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
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
	public tela() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArquivoOrigem = new JLabel("Arquivo origem:");
		lblArquivoOrigem.setBounds(19, 116, 109, 14);
		contentPane.add(lblArquivoOrigem);
		
		JLabel lblArquivoDestino = new JLabel("Arquivo destino:");
		lblArquivoDestino.setBounds(19, 189, 109, 14);
		contentPane.add(lblArquivoDestino);
		
		textField = new JTextField();
		textField.setBounds(19, 138, 402, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(19, 214, 402, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnProcessar = new JButton("Processar");
		btnProcessar.setBounds(160, 260, 89, 23);
		contentPane.add(btnProcessar);
		
		JRadioButton rdbtnCompactar = new JRadioButton("Compactar");
		rdbtnCompactar.setSelected(true);
		buttonGroup.add(rdbtnCompactar);
		rdbtnCompactar.setBounds(19, 27, 109, 23);
		contentPane.add(rdbtnCompactar);
		
		JRadioButton rdbtnDescompactar = new JRadioButton("Descompactar");
		buttonGroup.add(rdbtnDescompactar);
		rdbtnDescompactar.setBounds(19, 65, 109, 23);
		contentPane.add(rdbtnDescompactar);
	}
}
