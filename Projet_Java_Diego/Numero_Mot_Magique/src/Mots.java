
import java.util.Scanner;
import java.util.Random;
public class Mots {
	Random rand = new Random();
	int tentative = 1;
	int nombreAleatoire = (int) (Math.random() * 10.0D);
	Scanner Mot;
	String[] dictionnaire;
	String chaine = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int caractere = chaine.length();
	int a = rand.nextInt(caractere);
	int b = rand.nextInt(caractere);
	int c = rand.nextInt(caractere);

	public Mots() {
		this.Mot = new Scanner(System.in);
		this.dictionnaire = new String[] { "PAPIER", "MANGER", "ALGERIE", "CASQUETTE", "STYLO", "TACOS", "ORDINATEUR",
				"MACHINE", "ELEPHANT", "TRAPEZE" };
	}

	public void melangeTableau(String[] tab) {
		String temp;
		for (int i = tab.length -1; i > 0; --i) {
			int j = (int) (Math.random() * (double) (i + 1));
			temp = tab[i];
			tab[i] = tab[j];
			tab[j] = temp;
		}

	}

	public void afficheTableau(String[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i]);
		}

	}

	public void motUnePossibilite() {
		String motNormal = this.dictionnaire[this.nombreAleatoire];
		String motInconnue = motNormal + chaine.charAt(a) + chaine.charAt(b) + chaine.charAt(c);
		String[] lettre = motInconnue.split("");
		this.melangeTableau(lettre);
		System.out.println("Essayez de trouver le mot avec ces lettres: ");
		this.afficheTableau(lettre);
		System.out.println("");
		String proposer = this.Mot.nextLine();
		if (proposer.equals(motNormal)) {
			System.out.println("Bien Joué. Vous avez gagné!!!");
		} else {
			System.out.println("Tu as perdu !!!! Le mot était " + motNormal);
		}

	}
	
	public void motInfiniteDePossiilite(){
		String motNormal = this.dictionnaire[this.nombreAleatoire];
		String motInconnue = motNormal + chaine.charAt(a) + chaine.charAt(b) + chaine.charAt(c);
		String[] lettre = motInconnue.split("");
		this.melangeTableau(lettre);
		System.out.println("Essayez de trouver le mot avec ces lettres: ");
		this.afficheTableau(lettre);
		System.out.println("");
		String proposer = this.Mot.nextLine();
		while(!proposer.equals(motNormal)){
			this.tentative ++;
			System.out.println("Tu as faux!!!! Retente ta chance les lettres sont: ");
			this.afficheTableau(lettre);
			System.out.println("");
			proposer = this.Mot.nextLine();
		}
		if (proposer.equals(motNormal)) {
			System.out.println("Bien Joué. Vous avez gagné en " + tentative + " tentatives");
		}
	}
	
	public void motChoixDePossiilite(){
		
		System.out.println("Choisissez le nombre de tentatives que vous voulez");
		int tentatives = this.Mot.nextInt();
		String motNormal = this.dictionnaire[this.nombreAleatoire];
		String motInconnue = motNormal + chaine.charAt(a) + chaine.charAt(b) + chaine.charAt(c);
		String[] lettre = motInconnue.split("");
		this.melangeTableau(lettre);
		System.out.println("Essayez de trouver le mot avec ces lettres: ");
		this.afficheTableau(lettre);
		System.out.println("");
		String proposer = this.Mot.nextLine();
		
		while(!proposer.equals(motNormal)){
			if (tentatives == this.tentative + 1) {
				System.out.println("Vous avez perdu. La réponse était " + motNormal);
				return;
			}
			this.tentative ++;
			System.out.println("Tu as faux!!!! Retente ta chance les lettres sont: ");
			this.afficheTableau(lettre);
			System.out.println("");
			proposer = this.Mot.nextLine();
		}
		if (proposer.equals(motNormal)) {
			System.out.println("Bien Joué. Vous avez gagné en " + tentative + " tentatives");
		}
	}
	
	
	
	
}