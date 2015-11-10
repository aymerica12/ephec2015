package be.ephec.tp6;

import javax.swing.JOptionPane;

public class Etu implements Affichage, Comparable<Etu>{
	private int num;
	private String nom;
	public Etu(String nom, String prenom){
		this.nom = nom;
		this.num = num;
	}
	public Etu(){
		this.nom = JOptionPane.showInputDialog("entrez votre nom");
		this.num = Integer.parseInt(JOptionPane.showInputDialog("entrez votre numéro"));
	}
	public void affiche(){
		System.out.println(this.toString());
	}
	public String toString(){
		return(" nom:"+ this.nom + "\n prénom:"+ this.num );
	}
	@Override
	public int compareTo(Etu o) {
		return (this.num-o.num);
	}

}
