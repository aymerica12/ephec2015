package be.ephec.tp82;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Exo2 extends JFrame implements ActionListener{
	private JRadioButton rdbtnRadio1;
	private JRadioButton rdbtnRadio2;
	private JRadioButton rdbtnRadio3;
	private JButton btnEtat;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exo2 frame = new Exo2();
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
	public Exo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 129);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("choissisez une option"));
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		rdbtnRadio1 = new JRadioButton("Radio 1");
		rdbtnRadio1.addActionListener(this);
		GridBagConstraints gbc_rdbtnRadio1 = new GridBagConstraints();
		gbc_rdbtnRadio1.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnRadio1.gridx = 0;
		gbc_rdbtnRadio1.gridy = 0;
		panel.add(rdbtnRadio1, gbc_rdbtnRadio1);
		
		rdbtnRadio2 = new JRadioButton("Radio 2");
		rdbtnRadio2.addActionListener(this);
		GridBagConstraints gbc_rdbtnRadio2 = new GridBagConstraints();
		gbc_rdbtnRadio2.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnRadio2.gridx = 1;
		gbc_rdbtnRadio2.gridy = 0;
		panel.add(rdbtnRadio2, gbc_rdbtnRadio2);
		
		rdbtnRadio3 = new JRadioButton("Radio 3");
		rdbtnRadio3.addActionListener(this);
		GridBagConstraints gbc_rdbtnRadio3 = new GridBagConstraints();
		gbc_rdbtnRadio3.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnRadio3.gridx = 2;
		gbc_rdbtnRadio3.gridy = 0;
		panel.add(rdbtnRadio3, gbc_rdbtnRadio3);
		
		btnEtat = new JButton("Etat");
		btnEtat.addActionListener(this);
		GridBagConstraints gbc_btnEtat = new GridBagConstraints();
		gbc_btnEtat.insets = new Insets(0, 0, 0, 5);
		gbc_btnEtat.gridx = 3;
		gbc_btnEtat.gridy = 0;
		panel.add(btnEtat, gbc_btnEtat);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()){
		case "Radio 1":
			System.out.println("changement radio 1");
			break;
		case "Radio 2":
			System.out.println("changement radio 2");
			break;
		case "Radio 3":
			System.out.println("changement radio 3");
			break;
		case "Etat":
			System.out.println("Etat: "+ rdbtnRadio1.isSelected()+ " "+ rdbtnRadio2.isSelected() + " "+ rdbtnRadio3.isSelected());
			
		}
	}

}
