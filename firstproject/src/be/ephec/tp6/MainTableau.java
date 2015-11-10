package be.ephec.tp6;

import java.util.Arrays;

public class MainTableau {

	public static void main(String[] args) {
		Etu tabEtu[] = new Etu[3];
		IP tabIp[] = new IP[3];
		for(int i=0; i<tabEtu.length; i++){
			tabEtu[i] = new Etu();
		}
		for(int i=0; i<tabIp.length; i++){
			tabIp[i] = new IP();
		}
		Arrays.sort(tabEtu);
		Arrays.sort(tabIp);
		tableau.affiche(tabEtu);
		tableau.affiche(tabIp);
	}

}
