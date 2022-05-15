package miniprojet;

import java.util.Scanner;

public class Bibli {

	public static void main(String[]args) {
	
		int Service;
		String abo_type;
		boolean abonnement, pret, rand_mode;
	
		/*j'utilise la classe main pour le c�t� interactif avec l'utilisateur donc pour �a je cr�e l'objet de type Scanner, 
		pour l'entr�e utilisateur*/
		
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("Bonjour et bienvenu.e dans la biblioth�que en ligne");
		System.out.println("Pour choisir un service entre ceux propos�s :");
		System.out.println("1 : Abonnement\n2: Pr�t");
		System.out.println("Veuillez s�l�ctionner parmis les chiffres :");
		
		Service=s.nextInt();
		
		Abonnement A=new Abonnement();
		Pr�t P=new Pr�t();
		//cr�e 2 obj abonnement et pret pour les manip et appeler leurs methods & att
		
		//j'utilise un switch pour faciliter l'utilisation de conditions
		switch(Service) {
		case 1: 	 
					System.out.println("Pour renouveler un abonnement, taper true\nPour arr�ter un abonnement, taper false");
					
					abonnement=s.nextBoolean();							
					
					if(abonnement==true) {
						System.out.println("D�but de renouvellement...");	
							abo_type=A.New(); 
							A.setType(abo_type);
							A.getData();
						}
					else {
							System.out.println("D�but d'arr�t...");
							A.Arret();
						}		
				break;
		
		case 2: 
		
			System.out.println("Pour emprunter un nouveau livre, taper true\nPour retourner un livre taper false");
			
			pret=s.nextBoolean();
			
			if(pret==true) {
					
				System.out.println("D�but du pr�t...");
				System.out.println("Voulez vous activer le mode random : si oui, tapez true");
				//au cas o� le user n'a pas de choix precis il aura un livre au hasard
				rand_mode=s.nextBoolean();
				
					if(rand_mode==false) {
							P.NewPret("Titre");
						}
						else {
							P.RandomBook();
					}
					
			}	else {
					System.out.println("D�but du retour...");
					P.RetourPret();
				}
				break;
				
		default : 
			System.out.println("Erreur: le service demand� n'existe pas");	
		}
		
		System.out.println("Bonne continuation !");
		
		s.close();
	}
	
	
}
