# library-sys
				Rapport du miniprojet "Système de gestion de bibliothèque" :

	J'ai commencé ce mini projet avec l'idée de faire un programme, sur console seulement, qui pourrait permettre à un utilisateur
de lancer des demandes assez simples et au programme d'y répondre en utilisant le plus et le mieux que possible les concepts vus en cours
d'introduction à la programmation orientée objet(objets, héritage, polymorphismes, constructeurs etc.).
	
	Avant toutes choses je tiens à préciser que je n'ai en aucun cas respecté les principes s.o.l.i.d pour ce qui est de ma modeste 
conception. Tout comme j'ai ommis l'utilisation d'un design pattern pour mon programme. Par choix et aussi parce que je n'ai pas eu assez 
de temps pour les maîtriser et bien les comprendre. 	

	Tout d'abord j'ai essayé de faire un diagramme de classe, afin de savoir ce que j'allais mettre dans mon code, et ce que j'allais
peut-être changer. Je ne l'ai pas totalement respecté, ce qui peut être justifié par le fait que ça soit mon tout premier projet en Java(et
plus généralement en POO). Il y a eu des méthodes et attributs que j'ai enlevé, d'autres que j'ai ajouté... J'ai essayé en tous cas d'être 
fidèle au premier modèle du projet pour ne pas trop m'éparpiller.

Ceci est la première version de ce projet, j'espère grâce à vos remarques l'améliorer.

	Sur ce fichier texte, je noterai et justifirai mes choix par rapport aux méthodes choisies ainsi qu'au raisonnement que j'ai pu
avoir. On peut commencer par la classe main (principale) :
	classe1 : Bibli; j'y ai importé la classe Scanner pour pouvoir lire des données du clavier (pour le côté interractif)
en utilisant un bloc de conditions (switch vu le nombre de conditions à traiter) avec les deux services proposés : Abonnement ou Prêt.

	classe2 : Prêt; (Scanner importé) C'est probablement la classe avec laquelle j'ai eu le plus de mal, sûrement car j'avais eu trop d'idées des 
méthodes que je pouvais y appliquer. Expliquons d'abord son utilité: Elle sert à manipuler tout ce qui se rapporte au service "PRÊT",
c'est-à-dire qu'il y aura des méthodes qui utiliseront les livres pour les emprunter ou les reprendre. C'est pour cela que j'y ai fait
deux principales catégories de méthode: celle qui prête et celle qui retourne. Comme on peut le voir j'y ai mis beaucoup d'attributs, que
je n'ai malheureusement pas pu utiliser totalement à cause du problème de base de données( que je vous explique plus en détails dans la classe
conçernée), mais j'ai essayé d'en utiliser au maximum...
Et voici ce qui suit en commentaire :

J'AI D'ABORD CREER DES OBJETS DE TYPE ETUDIANT,PROF, EXTERNE POUR LES MANIPULER DANS LA CLASSE. ENSUITE J'AI VOULU RETOURNER LE TYPE DE PRÊT
C'EST-A-DIRE DE QUEL TYPE EST L'OBJET CREER AFIN DE LUI RAJOUTER DES POINTS BONUS (PLUS DE DETAILS CLASSE PERSONNE). FINALEMENT J'AI PREFERER
LES "SUPPRIMER" CAR J'AI EU AFFAIRE A LA FAMEUSE ERREUR STACKOVERFLOW, ET JE N'AI PAS EU PLUS DE TEMPS POUR ESSAYER DE PENSER A UNE AUTRE
MANIERE DE LES UTILISER, OU DE LES CONCEVOIR

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

...Après cela j'ai crée une méthode non nécessaire (getType_Livre)(car il n'y a pas de base de données) qui demande et retourne le type du livre que
le prêteur cherche à avoir (L'idée était de l'utiliser pour savoir quel livre décrémenter de la base de données lors du prêt, et lequel incrémenter 
lors du retour-> une manipulation simple de base de données).Puis une méthode (NewPret) qui recherche le livre entré par le titre. Dans celle-ci, j'ai crée une liste
de type Livre (pour remplacer la base de données) où j'y ai classé des valeurs d'attributs de livre (en faisant appel au constructeur Livre). Elle retourne les infos
sur le livre choisi ainsi que la durée du prêt et deux dates(prêt et retour) qui sont prédéfinies(je pense faire appel à la classe Date?). Et puis la methode RandomBook
qui retourne un livre au hasard en utilisant la methode prédéfinie de la classe Math : Random qui retourne un double au hasard. Et enfin la methode RetourPret qui demande
numéro de référence pour retourner un simple message qui dit que le livre est retourné(j'aurai voulu en faire plus pour cette méthode).

	classe3 : Abonnement; (Scanner importé) avec 4 méthodes: la premiere New pour demander le type de l'abonné -J'ai eu un problème avec cette méthode, je n'arrive pas
à prendre la valeur du type de l'abonné depuis l'entrée clavier pour une raison que j'ignore; si je le fais le compilateur exécute le code en ignorant les conditions de la
troisieme méthode-seconde method: setType pour essayer de regler le probleme précédent(mais ça ne le règle pas); prendre le type en entrée et le retourner. 3eme methode: getData
pour prendre les infos de chaque héritiers de "Personne" en créant les objets et en "enregistrant" les valeurs de leurs attributs. Enfin : Arret pour arreter l'abonnement qui, vu que
je n'ai pas non plus de base de données pour les personnes abonnés de cette bibliotheque, ne peut faire que demander des infos sur la personne et afficher un message qui dit que son 
abonnement est annulé. 

	classe4 : (super1)Personne; une classe mère avec peu de méthodes : la premiere AddBonus qui ajoute des points bonus aux lecteurs de livre (l'attribut est d'ailleurs static-> toutes les
personnes l'ont) la seconde ifwin pour savoir si on peut afficher un message qui récompense la personne. je n'ai pas utilisé tous les attributs de cette classe.

	classe5 : (sous-classe1)Etudiant ; je n'ai pas mis de méthodes dans cette classe, seulement des attributs

	classe6 : (sous-classe1)Prof; de même dans celle ci

	classe7 : (sous-classe1)Externe; dans cette classe aussi

	classe8 : (super2)Livre; une superclasse qui a un constructeur avec les parametres qui représente des caractéristiques (attributs)
des livres (auteur, titre, numéro de ref etc.). Elle possède une autre methode showData pour afficher les infos sur un livre. J'ai eu beaucoup de mal a trouver l'idée d'utiliser
une liste de type livre pour stocker les données (pour faire une sorte de rassemblement de données). J'ai d'abord fait un brouillon assez peu organisé et qui regroupait pleins d'erreurs
avec une classe que j'avais nommée Inventaire que voici :

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

... Au final, il y a des détails que j'ai gardé. D'autres non.

	classe9 : (sous-classe2)Revue; que des attributs

	classe10 : (sous-classe2)Essai; la même chose

	classe11 : (sous-classe2)Scientific; des attributs seulement ici aussi, avec l'idée d'utiliser une arraylist pour faire un index du livre 
scientifique, par exemple si on cherche le mot "java" dans le livre en question on aura la liste des pages où il apparaît.


	
	interface : Document pour ce qui est de celle ci, j'ai voulu l'utiliser afin d'y mettre certaines méthodes abstraites pour enrichir un peu plus les livres
mais je n'ai pas eu d'idées pour être honnête. 
	
	enumeration : j'ai même pensé à créer une enumération, pour faires livres des constantes qui ont des paramètres (leurs attributs) à la place de la base de 
données.

	Voilà globalement ce que j'ai fait. J'espère que je n'ai pas fait trop d'erreurs graves, ou peut-être que si, comme ça j'en apprendrai d'avantage. J'aimerai vraiment avoir vos 
remarques sur tout ce que je devrais améliorer, revoir, arranger, ajouter ou enlever. J'essayerai de perfectionner ce projet pour arriver à une version décente et acceptable.
En tous les cas ça m'a beaucoup apporté de faire ce mini projet, j'ai pu en apprendre plus sur les principes solid, les design patterns les plus simples, certaines erreurs -stackoverflow 
ou arrayindexoutofbound- à comment les arranger et les comprendre. A mon avis je devrais encore me perfectionner sur comment mieux traiter les sous-classes(les miennes étaient vides ce qui
est dommage), essayer d'utiliser un peu plus l'encapsulation et le polymorphisme. Mais aussi apprendre à choisir les interfaces et quoi y mettre ainsi qu'un choix plus aiguïsé des modificateurs(
qui ici je l'admet ont été un peu choisis sans réelle réflexion). Normalement je vous enverrai toutes mes questions par email pour ne pas trop vous déranger par rapport à ça.

Cordialement, 
Merci pour votre lecture,
Yaou Mey G10L1



ps: la raison pour laquelle je n'ai pas pu utiliser de base de données est principalement le temps. J'ai essayé de télécharger JavaDB
mais pour pouvoir connaître les commandes sql (qui je sais pourtant sont simples) je n'ai pas pu avoir du temps pour cela. J'espère que ce 
que j'ai fait aura au moins été correct.
