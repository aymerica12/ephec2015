package be.ephec.tp6;

public class tableau {
	public static void affiche(Affichage monTab[]){
		for(int i=0; i>monTab.length ; i++){
			monTab[i].affiche();
		}
	}
}
