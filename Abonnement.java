package miniprojet;

import java.util.Scanner;

public class Abonnement {

	int duree;
	private String type_abonne;
	String Data;//pourrait trouver structure data cap de stock diff type as enregistrement ->use an arraylist?? pour �viter la redondance

	Scanner s=new Scanner(System.in);
	

	public String New() {
		
		System.out.println("selectionner le type de l'abonn� :\nEtudiant\nProf\nExterne");
		type_abonne="Etudiant"; //si input by user=> problem of conditions(meth getData) ne rentre pas dans le bloc de condition WHY???
		System.out.println("le type : "+type_abonne);

		return type_abonne;	
	}
	
	public void setType(String type) {
		this.type_abonne=type;
	}//dans le cas pour avoir le type de l'abonn� from input (user)
	
	
	public void getData() {//enregistrement de l'abonn� avec stockage des donn�e possible dans une arraylist?
		
		System.out.println("Remplissez les informations demand�es");
		System.out.println("Tapez le prenom et nom :");
		
			if (type_abonne=="Etudiant"){
				Etudiant a=new Etudiant();//creation de l'obj selon le type d'abon pour avoir ses att
				
				a.prenom=s.next();
				a.nom=s.next();
				
				System.out.println("Tapez la sp�cialit� :");
				a.code_spe=s.next();
				
				System.out.println("Tapez le numero de carte :");
				a.n_carte=s.nextLong();
		}
		
		if(type_abonne=="Prof") {
			Prof b=new Prof();
			
			b.prenom=s.next();
			b.nom=s.next();
			
			System.out.println("Tapez la mati�re enseign�e :");
			b.code_matiere=s.next();
		}
		
		if(type_abonne=="Externe") {
			Externe c=new Externe();
			
			c.prenom=s.next();
			c.nom=s.next();
			
			System.out.println("Tapez le nom de votre universit� :");
			c.univ=s.next();
		}
		
		System.out.println("Abonnement R�ussi !");
	}
	
	
	public void Arret() {
		
		System.out.println("Tapez le prenom et nom :");//pas besoin de plus de renseignement vu qu'on a pas de base de donn�e
		Data=s.next();
		System.out.println("Vous avez annuler votre abonnement");
	}
}
