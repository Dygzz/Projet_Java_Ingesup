
import java.util.Scanner;

public class Numero {
	int nombreAleatoire = (int) (Math.random() * 101.0D);
	int tentative = 1;
	Scanner nombre;

	public Numero() {
		this.nombre = new Scanner(System.in);
	}

	public void unePossibilite() {
		System.out.println("Choisissez un Nombre, vous avez une chance");
		int choisie = this.nombre.nextInt();
		if (this.nombreAleatoire == choisie) {
			System.out.println("Bien Joué Vous avez gagné");
		} else {
			System.out.println("Vous avez Perdu :D, la solution était " + this.nombreAleatoire);
		}

	}

	public void infiniteDePossibilite() {
		System.out.println("Choisisez un nombre vous avez un nombre infini de possibilités");
		int choisie = this.nombre.nextInt();

		while (choisie != this.nombreAleatoire) {
			++this.tentative;
			if (choisie < this.nombreAleatoire) {
				System.out.println("Le nombre est supérieur à " + choisie);
				choisie = this.nombre.nextInt();
			} else if (choisie > this.nombreAleatoire) {
				System.out.println("Le nombre est inférieur à " + choisie);
				choisie = this.nombre.nextInt();
			}
		}

		if (this.nombreAleatoire == choisie) {
			System.out.println("Bien Joué Vous avez gagné en " + this.tentative + " tentatives");
		}

	}

	public void choixDePossibilite() {
		System.out.println("Choisissez le nombre de tentatives que vous voulez");
		int tentatives = this.nombre.nextInt();
		System.out.println("Tenter un nombre");
		int choisie = this.nombre.nextInt();

		while (choisie != this.nombreAleatoire) {
			if (tentatives == this.tentative + 1) {
				System.out.println("Vous avez perdu. La réponse était " + this.nombreAleatoire);
				return;
			}

			++this.tentative;
			if (choisie < this.nombreAleatoire) {
				System.out.println("Le nombre est supérieur à " + choisie);
				choisie = this.nombre.nextInt();
			} else if (choisie > this.nombreAleatoire) {
				System.out.println("Le nombre est inférieur à " + choisie);
				choisie = this.nombre.nextInt();
			}
		}

		if (this.nombreAleatoire == choisie) {
			System.out.println("Bien Joué Vous avez gagné en " + this.tentative + " tentatives");
		}

	}
}