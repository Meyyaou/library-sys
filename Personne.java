package miniprojet;

public class Personne {
		
		String nom;
		String prenom;
		String date_birth;
		static int point_bonus;
	
		
		public int AddBonus(int points) {
			return (point_bonus+points);
		}//un systeme de point si qlqun lit beaucoup
		
		public void IfWin() {
			
			if(Personne.point_bonus>50)
				System.out.println("Bravo vous avez gagnez un cadeau gratuit !");
		}//avec une recompense
}
