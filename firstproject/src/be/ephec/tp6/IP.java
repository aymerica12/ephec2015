package be.ephec.tp6;

public class IP extends TrenteDeuxBits implements Affichage, Comparable<IP>{
	public IP(){
		super();	
	}
	
	public IP(String adresse){
		super(adresse);
	}
	
	public char getClasse(){
		char classe ='E';
		if(this.getOct1()>=0 && this.getOct1()<=127){
			classe ='A';
		}
		if(this.getOct1()>=128 && this.getOct1()<=191){
			classe ='B';
		}
		if(this.getOct1()>=192 && this.getOct1()<=223){
			classe ='C';
		}
		if(this.getOct1()>=224 && this.getOct1()<=239){
			classe ='D';
		}
		return classe;
	}
	
	public boolean isPrive(){
		if(this.getOct1() == 10) return true;
		if(this.getOct1() == 172 && this.getOct2()==16)return true;
		if(this.getOct1() == 172 && this.getOct2()==31)return true;
		if(this.getOct1() == 192 && this.getOct2()==168)return true;
		return false;
	}
	
	public String toString(){
		return super.toString();
	}
	
	public String toString1(){
		return ""+this.getOct1();
	}
	
	public String toString2(){
		return ""+this.getOct2();
	}
	
	public String toString3(){
		return ""+this.getOct3();
	}
	
	public String toString4(){
		return ""+this.getOct4();
	}
	
	public int getDefaultMask(){
		int ones=0;
		if(this.getClasse()=='A') return ~ones<<24;
		if(this.getClasse()=='B') return ~ones<<16;
		if(this.getClasse()=='C') return ~ones<<8;
		return ones;		
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(IP o) {
		
		return (this.valeur-o.valeur);
	}
}
