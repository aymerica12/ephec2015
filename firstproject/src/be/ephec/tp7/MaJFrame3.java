package be.ephec.tp7;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame3 extends JFrame {
	public static int NBOUTONS = 5;
	private JButton boutons[];
	public MaJFrame3(){
		this.setBounds(500, 400, 300, 200);
		this.setVisible(true);
		this.setTitle("Ma première Jframe");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container contenu = getContentPane();
		boutons = new JButton[NBOUTONS];
		for(int i = 0; i< boutons.length; i++){
			boutons[i] = new JButton("Bouton "+ i);
		}
		contenu.add(boutons[0]);
		contenu.add(boutons[1], BorderLayout.NORTH);
		contenu.add(boutons[2], BorderLayout.SOUTH);
		contenu.add(boutons[3], BorderLayout.WEST);
		contenu.add(boutons[4], BorderLayout.EAST);
		
	}
	public static void main(String[] args) {
		MaJFrame3 mjfr4 = new MaJFrame3();
	}
}