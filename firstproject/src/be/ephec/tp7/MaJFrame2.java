package be.ephec.tp7;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaJFrame2 extends JFrame {
	private JButton jButtonOK;
	public MaJFrame2(){
		this.setBounds(500, 400, 300, 200);
		this.setVisible(true);
		this.setTitle("Ma première Jframe");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jButtonOK = new JButton("ok");
		this.setLayout(new FlowLayout());
		this.getContentPane().add(jButtonOK);
	}
	
	public static void main(String[] args) {
		MaJFrame2 mjfr1 = new MaJFrame2();
	}
}
