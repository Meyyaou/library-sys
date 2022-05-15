package miniprojet;

import java.util.Scanner;

public class Abonnement {

	int duree;
	private String type_abonne;
	String Data;//pourrait trouver structure data cap de stock diff type as enregistrement ->use an arraylist?? pour éviter la redondance

	Scanner s=new Scanner(System.in);
	

	public String New() {
		
		System.out.println("selectionner le type de l'abonné :\nEtudiant\nProf\nExterne");
		type_abonne="Etudiant"; //si input by user=> problem of conditions(meth getData) ne rentre pas dans le bloc de condition WHY???
		System.out.println("le type : "+type_abonne);

		return type_abonne;	
	}
	
	public void setType(String type) {
		this.type_abonne=type;
	}//dans le cas pour avoir le type de l'abonné from input (user)
	
	
	public void getData() {//enregistrement de l'abonné avec stockage des donnée possible dans une arraylist?
		
		System.out.println("Remplissez les informations demandées");
		System.out.println("Tapez le prenom et nom :");
		
			if (type_abonne=="Etudiant"){
				Etudiant a=new Etudiant();//creation de l'obj selon le type d'abon pour avoir ses att
				
				a.prenom=s.next();
				a.nom=s.next();
				
				System.out.println("Tapez la spécialité :");
				a.code_spe=s.next();
				
				System.out.println("Tapez le numero de carte :");
				a.n_carte=s.nextLong();
		}
		
		if(type_abonne=="Prof") {
			Prof b=new Prof();
			
			b.prenom=s.next();
			b.nom=s.next();
			
			System.out.println("Tapez la matière enseignée :");
			b.code_matiere=s.next();
		}
		
		if(type_abonne=="Externe") {
			Externe c=new Externe();
			
			c.prenom=s.next();
			c.nom=s.next();
			
			System.out.println("Tapez le nom de votre université :");
			c.univ=s.next();
		}
		
		System.out.println("Abonnement Réussi !");
	}
	
	
	public void Arret() {
		
		System.out.println("Tapez le prenom et nom :");//pas besoin de plus de renseignement vu qu'on a pas de base de donnée
		Data=s.next();
		System.out.println("Vous avez annuler votre abonnement");
	}
}
