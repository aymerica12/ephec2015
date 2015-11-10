package be.ephec.tp6;

import javax.swing.JOptionPane;

public class Cercle extends FormeGeometrique {
	public int rayon;
	public Cercle(int rayon, String couleur){
		super(couleur);
		this.rayon= rayon;
	}
	public Cercle(){
		super();
		rayon = Integer.parseInt(JOptionPane.showInputDialog("entrez le rayon"));
	}
	public double aire(){
		return (Math.PI*Math.pow(this.rayon, 2));
	}
	public double perim(){
		return(2*Math.PI*this.rayon);
	}
	public String toString(){
		return(super.toString() + "\n rayon:"+ this.rayon +"\n Aire:"+ this.aire() + "\n Perimetre:"+ this.perim());
	}
}
