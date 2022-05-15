package miniprojet;

import java.util.Scanner;

public class Bibli {

	public static void main(String[]args) {
	
		int Service;
		String abo_type;
		boolean abonnement, pret, rand_mode;
	
		/*j'utilise la classe main pour le côté interactif avec l'utilisateur donc pour ça je crée l'objet de type Scanner, 
		pour l'entrée utilisateur*/
		
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("Bonjour et bienvenu.e dans la bibliothèque en ligne");
		System.out.println("Pour choisir un service entre ceux proposés :");
		System.out.println("1 : Abonnement\n2: Prêt");
		System.out.println("Veuillez séléctionner parmis les chiffres :");
		
		Service=s.nextInt();
		
		Abonnement A=new Abonnement();
		Prêt P=new Prêt();
		//crée 2 obj abonnement et pret pour les manip et appeler leurs methods & att
		
		//j'utilise un switch pour faciliter l'utilisation de conditions
		switch(Service) {
		case 1: 	 
					System.out.println("Pour renouveler un abonnement, taper true\nPour arrêter un abonnement, taper false");
					
					abonnement=s.nextBoolean();							
					
					if(abonnement==true) {
						System.out.println("Début de renouvellement...");	
							abo_type=A.New(); 
							A.setType(abo_type);
							A.getData();
						}
					else {
							System.out.println("Début d'arrêt...");
							A.Arret();
						}		
				break;
		
		case 2: 
		
			System.out.println("Pour emprunter un nouveau livre, taper true\nPour retourner un livre taper false");
			
			pret=s.nextBoolean();
			
			if(pret==true) {
					
				System.out.println("Début du prêt...");
				System.out.println("Voulez vous activer le mode random : si oui, tapez true");
				//au cas où le user n'a pas de choix precis il aura un livre au hasard
				rand_mode=s.nextBoolean();
				
					if(rand_mode==false) {
							P.NewPret("Titre");
						}
						else {
							P.RandomBook();
					}
					
			}	else {
					System.out.println("Début du retour...");
					P.RetourPret();
				}
				break;
				
		default : 
			System.out.println("Erreur: le service demandé n'existe pas");	
		}
		
		System.out.println("Bonne continuation !");
		
		s.close();
	}
	
	
}
