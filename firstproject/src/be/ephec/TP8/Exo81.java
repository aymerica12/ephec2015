package be.ephec.TP8;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exo81 extends JFrame implements ActionListener {
	private JCheckBox chckbxCase1;
	private JCheckBox chckbxCase2;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exo81 frame = new Exo81();
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
	public Exo81() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		chckbxCase1 = new JCheckBox("case 1");
		chckbxCase1.addActionListener(this);
		GridBagConstraints gbc_chckbxCase = new GridBagConstraints();
		gbc_chckbxCase.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxCase.gridx = 0;
		gbc_chckbxCase.gridy = 0;
		contentPane.add(chckbxCase1, gbc_chckbxCase);
		
		chckbxCase2 = new JCheckBox("case 2");
		chckbxCase2.addActionListener(this);
		GridBagConstraints gbc_chckbxCase_1 = new GridBagConstraints();
		gbc_chckbxCase_1.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxCase_1.gridx = 1;
		gbc_chckbxCase_1.gridy = 0;
		contentPane.add(chckbxCase2, gbc_chckbxCase_1);
		
		JButton btnEtat = new JButton("Etat");
		btnEtat.addActionListener(this);
		GridBagConstraints gbc_btnEtat = new GridBagConstraints();
		gbc_btnEtat.gridx = 2;
		gbc_btnEtat.gridy = 0;
		contentPane.add(btnEtat, gbc_btnEtat);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()){
		case "case 1":
			System.out.println("changement case 1");
			break;
		case "case 2":
			System.out.println("changement case 2");
			break;
		case "Etat":
			System.out.println("changement Etat "+ chckbxCase1.isSelected()+" "+ chckbxCase2.isSelected());
			
		}
		
	}

}
