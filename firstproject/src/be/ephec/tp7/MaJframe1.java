package be.ephec.tp7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MaJframe1 extends JFrame implements MouseListener{
	public MaJframe1(){
		this.setBounds(500, 400, 300, 200);
		this.setVisible(true);
		this.setTitle("Ma première Jframe");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		MaJframe1 jfr1 = new MaJframe1();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("je lasse par Mouse Clicked");
		System.out.println("J'ai cliqué en x= "+ arg0.getX() + "y="+ arg0.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("je lasse par Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("je lasse par Mouse Exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("je lasse par Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("je lasse par Mouse Released");
	}
}
