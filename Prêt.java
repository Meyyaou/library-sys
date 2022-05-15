package miniprojet;

import java.util.Scanner;

public class Prêt {
	
	 	boolean accept=false;
		String Date_retour="27/05/2022";
		int duree=15;
		String Date_debut="12/05/2022";
		int type_livre, ref_r;
		String msg="Erreur dans le traitement de l'entrée clavier";
		//je n'ai pas pu/su utiliser tous les attributs sans base de donnée ou au moins structure de data
		
		Scanner S=new Scanner(System.in);
		
/*Etudiant A=new Etudiant();
		Prof B=new Prof();
		Externe C=new Externe();
		
		public String Type_pret() {
			System.out.println("Veuillez saisir le type de prêt que vous souhaitez effectuer :\nEtudiant\nProf\nExterne");
			type_pret=S.next();
			if(type_pret=="Etudiant"||type_pret=="Prof"||type_pret=="Externe") {
				return type_pret;
			}else
				return "Erreur";
		}
	
		public void setType_pret(String type_pret) {
			this.type_pret = type_pret;
		}
		
		public void PointB() {
		System.out.println("Le type du preteur: ");
		type_pret="Etudiant";
		System.out.println("Veuillez taper votre prenom et nom :");
			
		if(type_pret=="Etudiant") {
				;//crée obj selon le type de pret pour savoir combien add points bonus et a qui
				System.out.println("coucou");
				A.prenom=S.next();
				A.nom=S.next();
				A.AddBonus(250);
				A.IfWin();
		}
	
		if(type_pret=="Prof") {
		
			
			B.prenom=S.next();
			B.nom=S.next();
			B.AddBonus(15);
			B.IfWin();
		}			
	
			
			C.prenom=S.next();
			C.nom=S.next();
			C.AddBonus(10);
			C.IfWin();
		}CONCERNANT CES TROIS METHODES, J'AI PENSE LES SUPPRIMER PARCE QUE J'AI EU UN PROBLEME D'EXECUTION
		ET JE N'ARRIVE PAS TROP A AVOIR UNE VISION PLUS CLAIRE DE COMMENT JE POURRAIS LES UTILISER.
*/			
		public int getType_livre() {/* demande type livre dans le cas de pls de détails MAIS
			ce cas est inutile sans base de donnée*/
			
			System.out.println("Quel type de livre souhaitez vous ");
			System.out.println("1-Essai(Mémoire)\n2-Revue\n3-Scientifique");
			
			type_livre=S.nextInt();
			
			return type_livre;

		}
		
		public boolean NewPret(String t) {/*recherche du livre par titre. peut-etre faire une recherche par auteur, 
		longueur, reference ou domaine pour plus de diversité dans l'interraction avec le user */
			System.out.println("Tapez le titre que vous chercher :");
			t=S.next();
			
			Livre[] book = new Livre[5];

			book[0]= new Livre(01, "Titre1", "Auteur1", "Maison Ed1", "Domaine1", 156);
			book[1]= new Livre(02, "Titre2", "Auteur2", "Maison Ed2", "Domaine2", 321);
			book[2]= new Livre(03, "Titre3", "Auteur3", "Maison Ed3", "Domaine3", 120);
			book[3]= new Livre(04, "Titre4", "Auteur4", "Maison Ed4", "Domaine4", 98);
			book[4]= new Livre(05, "Titre5", "Auteur5", "Maison Ed5", "Domaine5", 674);
		

				if(book[0].titre.equals(t)) {
					book[0].showData();
					msg="Vous avez effectué votre prêt avec succés!";
					accept=true;
					System.out.println("Votre prêt durera "+ duree+" jours: \ndu "+Date_debut+" au "+Date_retour);
				}
				if(book[1].titre.equals(t)) {
					book[1].showData();
					msg="Vous avez effectué votre prêt avec succés!";
					accept=true;
					System.out.println("Votre prêt durera "+ duree+" jours: \ndu "+Date_debut+" au "+Date_retour);

				}
				if(book[2].titre.equals(t)) {
					book[2].showData();
					msg="Vous avez effectué votre prêt avec succés!";
					accept=true;		
					System.out.println("Votre prêt durera "+ duree+" jours: \ndu "+Date_debut+" au "+Date_retour);
				}
				if(book[3].titre.equals(t)) {  
					book[3].showData();
					msg="Vous avez effectué votre prêt avec succés!";
					accept=true;
					System.out.println("Votre prêt durera "+ duree+" jours: \ndu "+Date_debut+" au "+Date_retour);
				}
				if(book[4].titre.equals(t)) {
					book[4].showData();
					msg="Vous avez effectué votre prêt avec succés!";
					System.out.println("Votre prêt durera "+ duree+" jours: \ndu "+Date_debut+" au "+Date_retour);
				}
			// pris en compte le cas d'erreur
				
				System.out.println(msg);
				return accept;

		}
		
		public void RandomBook() {//l'utilisation de la method prédef math.random pour avoir un livre au hasard
			Livre[] book = new Livre[5];

			book[0]= new Livre(01, "Titre1", "Auteur1", "Maison Ed1", "Domaine1", 156);
			book[1]= new Livre(02, "Titre2", "Auteur2", "Maison Ed2", "Domaine2", 321);
			book[2]= new Livre(03, "Titre3", "Auteur3", "Maison Ed3", "Domaine3", 120);
			book[3]= new Livre(04, "Titre4", "Auteur4", "Maison Ed4", "Domaine4", 98);
			book[4]= new Livre(05, "Titre5", "Auteur5", "Maison Ed5", "Domaine5", 674);
			//comment faire pour ne pas répéter cette partie du code sans avoir d'erreurs
			int a= (int) (1 + (Math.random()*5));//convertion explicite de a car method nous donne un double en résultat
			System.out.println("Le livre choisi : ");
			
			switch(a) {
			case 1 :
				book[3].showData();
				break;
			
			case 2 :
				book[1].showData();	
				break;
			
			case 3 :
				book[4].showData();	
				break;
			
			case 4 :
				book[0].showData();
				break;
			
			case 5:
				book[2].showData();
				break;
			
			default : System.out.println("ERREUR D'EXECUTION !");	
			
			}/* j'ai préféré en faire un method avec un type de retour Inventaire pour pouvoir retourner les datas des
			éléments de la liste de type Livre qu'on a crée dans la classe inventaire mais il y'a toujours
			 une erreur d'execution*/
			return;
		}
		
	public void RetourPret() {
		
		System.out.println("Entrez le numéro de référence du livre à remettre");
		ref_r=S.nextInt();
		
		System.out.println("Vous avez retourné le livre avec succés");
	}/*pouvait manip le stock de livre pour incrementer ou decrementer dans le nombre de livre a chaque pret 
		mais la manipulation de la liste de livre est bloqué pour des raisons que je n'arrive pas encore a expliquer
		ni a résoudre*/


	
}
