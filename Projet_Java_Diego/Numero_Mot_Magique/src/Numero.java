
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
			System.out.println("Bien Jou� Vous avez gagn�");
		} else {
			System.out.println("Vous avez Perdu :D, la solution �tait " + this.nombreAleatoire);
		}

	}

	public void infiniteDePossibilite() {
		System.out.println("Choisisez un nombre vous avez un nombre infini de possibilit�s");
		int choisie = this.nombre.nextInt();

		while (choisie != this.nombreAleatoire) {
			++this.tentative;
			if (choisie < this.nombreAleatoire) {
				System.out.println("Le nombre est sup�rieur � " + choisie);
				choisie = this.nombre.nextInt();
			} else if (choisie > this.nombreAleatoire) {
				System.out.println("Le nombre est inf�rieur � " + choisie);
				choisie = this.nombre.nextInt();
			}
		}

		if (this.nombreAleatoire == choisie) {
			System.out.println("Bien Jou� Vous avez gagn� en " + this.tentative + " tentatives");
		}

	}

	public void choixDePossibilite() {
		System.out.println("Choisissez le nombre de tentatives que vous voulez");
		int tentatives = this.nombre.nextInt();
		System.out.println("Tenter un nombre");
		int choisie = this.nombre.nextInt();

		while (choisie != this.nombreAleatoire) {
			if (tentatives == this.tentative + 1) {
				System.out.println("Vous avez perdu. La r�ponse �tait " + this.nombreAleatoire);
				return;
			}

			++this.tentative;
			if (choisie < this.nombreAleatoire) {
				System.out.println("Le nombre est sup�rieur � " + choisie);
				choisie = this.nombre.nextInt();
			} else if (choisie > this.nombreAleatoire) {
				System.out.println("Le nombre est inf�rieur � " + choisie);
				choisie = this.nombre.nextInt();
			}
		}

		if (this.nombreAleatoire == choisie) {
			System.out.println("Bien Jou� Vous avez gagn� en " + this.tentative + " tentatives");
		}

	}
}