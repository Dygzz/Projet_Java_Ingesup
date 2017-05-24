import java.util.Scanner;

public class Main {
	private static Scanner pris;

	public static void main(String[] args) {
		Jeu();
	}

	public static void Jeu() {
		System.out.println(
				"Salut à quel jeu voulez vous jouer: tapez 1 pour Numéro Magique et tapez 2 pour le mot magique ");
		pris = new Scanner(System.in);
		int choix = pris.nextInt();
		if (choix == 1) {
			Numero JeuNombre = new Numero();
			System.out.println("Quel mode de jeux voulez vous choisir");
			System.out.println("1 pour un nombre infini de possibilités");
			System.out.println("2 pour une seule chance");
			System.out.println("3 pour choisir son nombre de tentatives");
			int possibilite = pris.nextInt();
			if (possibilite == 1) {
				JeuNombre.infiniteDePossibilite();
			} else if (possibilite == 2) {
				JeuNombre.unePossibilite();
			} else if (possibilite == 3) {
				JeuNombre.choixDePossibilite();
			}
		} 
		else if (choix == 2) {
			Mots JeuMot = new Mots();
			System.out.println("Quel mode de jeux voulez vous choisir");
			System.out.println("1 pour un nombre infini de possibilités");
			System.out.println("2 pour une seule chance");
			System.out.println("3 pour choisir son nombre de tentatives");
			int possibilite = pris.nextInt();
			if (possibilite == 1) {
				JeuMot.motInfiniteDePossiilite();
			} else if (possibilite == 2) {
				JeuMot.motUnePossibilite();
			} else if (possibilite == 3) {
				JeuMot.motChoixDePossiilite();
			}
		}

		System.out.println("Vous voulez rejouer 1 pour Oui et 2 pour Non");
		int rejoue = pris.nextInt();
		if (rejoue == 1) {
			Jeu();
		} else if (rejoue == 2) {
			System.out.println("Merci d\'avoir joué. Mauvaise journée");
		}

	}
}