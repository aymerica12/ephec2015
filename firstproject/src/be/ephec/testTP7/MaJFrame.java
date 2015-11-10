package be.ephec.testTP7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrame frame = new MaJFrame();
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
	public MaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{103, 96, 102, 115, 0};
		gbl_contentPane.rowHeights = new int[]{50, 67, 77, 58, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNom = new JLabel("Nom:");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.EAST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 0;
		contentPane.add(lblNom, gbc_lblNom);
		
		txtNom = new JTextField();
		txtNom.setText("Baurain");
		GridBagConstraints gbc_txtNom = new GridBagConstraints();
		gbc_txtNom.insets = new Insets(0, 0, 5, 5);
		gbc_txtNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNom.gridx = 1;
		gbc_txtNom.gridy = 0;
		contentPane.add(txtNom, gbc_txtNom);
		txtNom.setColumns(10);
		
		JButton jbtnOk = new JButton("OK");
		
		jbtnOk.addActionListener(this);
		GridBagConstraints gbc_jbtnOk = new GridBagConstraints();
		gbc_jbtnOk.insets = new Insets(0, 0, 5, 5);
		gbc_jbtnOk.gridx = 2;
		gbc_jbtnOk.gridy = 0;
		contentPane.add(jbtnOk, gbc_jbtnOk);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom:");
		GridBagConstraints gbc_lblPrenom = new GridBagConstraints();
		gbc_lblPrenom.anchor = GridBagConstraints.EAST;
		gbc_lblPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenom.gridx = 0;
		gbc_lblPrenom.gridy = 1;
		contentPane.add(lblPrenom, gbc_lblPrenom);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Aymeric");
		GridBagConstraints gbc_txtPrenom = new GridBagConstraints();
		gbc_txtPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrenom.gridx = 1;
		gbc_txtPrenom.gridy = 1;
		contentPane.add(txtPrenom, gbc_txtPrenom);
		txtPrenom.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("pas des couilles");
				JButton jButtonCancel = new JButton("cancel");
				jButtonCancel.addActionListener(this);
			}
		});
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 1;
		contentPane.add(btnCancel, gbc_btnCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Cancel":
			txtPrenom.setText("");
			txtNom.setText("");
			break;
		case "OK":
			System.out.println("Bonjour "+ txtNom.getText()+" "+txtPrenom.getText());
		}
	}

}
