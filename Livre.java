package miniprojet;

public class Livre {
		
		String titre, auteur, maison_ed, domaine;
		int ref, longueur, année;
		/* Livre book1= new Livre();
		 Livre book2= new Livre();
		 Livre book3= new Livre();
		 Livre book4= new Livre();
		 Livre book5= new Livre();
		 Livre book6= new Livre();
		Livre[] book = new Livre[3];

		book[0]= new Livre();
		book[1]= new Livre();
		book[2]= new Livre();
*/		

	 public Livre(int ref, String titre, String auteur, String maison_ed, String domaine, int longueur) {
		
		 this.titre=titre;
		this.auteur=auteur;
		 this.maison_ed=maison_ed;
		 this.domaine=domaine;
		 this.ref=ref;
		 this.longueur=longueur;
	
	 } //pour mettre a jour les données d'un livre si on rajoute un livre
		
	 



		public void showData(){ 
			
			System.out.print("Informations du livre:\nTitre: "+ titre+ "\nAuteur: "+auteur +"\nMaison d'édition: "+maison_ed+"\nDomaine: "+domaine+"\nNuméro de référence: "+ref +"\n");
		//CODE	System.out.println();
			
		}//to access les data si le user le demande


		public boolean contains(String t) {
			
			if(t==titre) {
				System.out.println("hello");
				return true;
			}
			return false;
		}//recherche d'un livre par titre
	
}
	