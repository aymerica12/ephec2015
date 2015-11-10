package be.ephec.tp6;

import javax.swing.JOptionPane;

public abstract class FormeGeometrique {
	protected String couleur;
	
	public FormeGeometrique(){
		this.couleur = JOptionPane.showInputDialog("entrez la couleur");
	}
	public FormeGeometrique(String couleur){
		this.couleur = couleur;
	}
	public abstract double aire();
	public abstract double perim();
	
	public String toString(){
		return("Couleur:" + this.couleur);
	}
}
