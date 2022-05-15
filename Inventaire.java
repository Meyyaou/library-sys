package miniprojet;

public class Inventaire  {
	
	public static void main(String[]args) {
/* problem : j'ai crée une liste de type Livre pour stocker les données des livre, à défaut
 * de faire une base de donnée MAIS -> JE N'ARRIVE PAS A LA MANIPULER COMME IL FAUT ! 
 * Le premier probleme est que sans la methode main creer une liste de type wrapper m'affiche une erreur 
 * et deuxiement pour 'mettre à jour' les données et les manipuler je n'y arrive pas*/

		Livre[] book = new Livre[5];//création de la liste de type livre pour acceder aux att des livres
	
		//déclaration du contenu de la liste, chaque case
	book[0]= new Livre ();
	book[1]= new Livre ();
	book[2]= new Livre ();
	book[3]= new Livre ();
	book[4]= new Livre ();
	/* j'ai pensé à créer un constructeur avec les parametre (int, string, string,string,string, int) pour eviter de
	* faire une autre methode afin de mettre a jour les att de chaque livre. serait peut-etre mieux?*/
	
	
	book[0].setData(01, "Titre1", "Auteur1", "Maison Ed1", "Domaine1", 156);
	book[1].setData(02, "Titre2", "Auteur2", "Maison Ed2", "Domaine2", 321);
	book[2].setData(03, "Titre3", "Auteur3", "Maison Ed3", "Domaine3", 120);
	book[3].setData(04, "Titre4", "Auteur4", "Maison Ed4", "Domaine4", 98);
	book[4].setData(05, "Titre5", "Auteur5", "Maison Ed5", "Domaine5", 674);
	//on met à jour les att des livres
	

		public Inventaire(String T) { /*Syntax error on token "public", record expected after this token: 
			devrais-je utiliser un record? ou sinon comment regler ce prbleme*/
			
			if(book[0].contains(T)) { 
				book[0].showData();
		}
			if(book[1].contains(T)) {
				book[1].showData();
		}
			if(book[2].contains(T)) {
				book[2].showData();
		}
			if(book[3].contains(T)) { 
				book[3].showData();
		}
			if(book[4].contains(T)) {
				book[4].showData();
		}

			return;
		}//retourne les données du livre si le titre est trouvé, sinon retourne null

	}

}
