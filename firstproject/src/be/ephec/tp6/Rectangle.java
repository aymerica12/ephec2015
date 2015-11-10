package be.ephec.tp6;

import javax.swing.JOptionPane;

public class Rectangle extends FormeGeometrique {
	private int longueur;
	private int largeur;
	public Rectangle(String couleur, int longueur,int largeur){
		super(couleur);
		this.largeur = largeur;
		this.longueur = longueur;
		
	}
	public Rectangle(){
		super();
		this.largeur = Integer.parseInt(JOptionPane.showInputDialog("entrez la largeur"));
		this.longueur = Integer.parseInt(JOptionPane.showInputDialog("entrez la longeur"));
	}
	public double aire(){
		return(longueur*largeur);
	}
	public double perim(){
		return(2*(longueur+largeur));
	}
	public String toString(){
		return(super.toString() + "\n Longueur:"+ this.longueur + "\n Largeur:"+ this.largeur +"\n Aire:"+ this.aire() + "\n Perimetre:"+ this.perim());
	}
}
