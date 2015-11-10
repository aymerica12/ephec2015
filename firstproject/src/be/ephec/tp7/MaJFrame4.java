package be.ephec.tp7;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaJFrame4 extends JFrame implements ActionListener {
	private JPanel contentPane;
	private int nbLignes = 4;
	private int nbColonnes = 5;
	JButton tabButton[][] = new JButton [nbLignes][nbColonnes];
	
	public MaJFrame4(){
			this.setBounds(500, 400, 300, 200);
			this.setVisible(true);
			this.setTitle("Ma première Jframe");
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			contentPane = new JPanel();
			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			contentPane.setLayout(gbl_contentPane );
			GridBagConstraints gbc = new GridBagConstraints();
			for(int i = 0; i<nbColonnes; i++){
				for( int j = 0; j<nbLignes ;j++ ){
					tabButton[j][i] = new JButton("Bouton " + ((j+1) + i*nbLignes));
					tabButton[j][i].addActionListener(this);
					gbc.gridx = j ;
					gbc.gridy = i;
					contentPane.add(tabButton[j][i], gbc);
					
				}
			}
			tabButton[nbLignes-1][nbColonnes-1].setText("quitter");
	}
		
		public static void main(String[] args) {
			MaJFrame4 jfr1 = new MaJFrame4();
			jfr1.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()){
			case "Bouton 1": System.out.println("J'ai cliqué sur le bouton 1"); break;
			case "Bouton 2": System.out.println("J'ai cliqué sur le bouton 2"); break;
			case "quitter" : this.dispose(); break;
			default : System.out.println("on a cliqué ailleurs");
			}
			
		}

}
