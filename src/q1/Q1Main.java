package q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q1Main {

	public static void main(String[] args) {
		Comparator<Couple<String, Integer>> compSecond = (c1, c2) -> c1
			.getSecond().compareTo(c2.getSecond());
		Comparator<Couple<String, Integer>> compPremier = (c1, c2) -> c1
			.getFirst().compareTo(c2.getFirst());
		/*
		 * q1.a. Créer une liste de trois Couple<String, Integer> Ordonner cette
		 * liste ; faire afficher le résultat
		 */
		ArrayList<Couple<String, Integer>> couple = new ArrayList<>();
		couple.add(new Couple<String, Integer>("a",2));
		couple.add(new Couple<String, Integer>("j",1));
		couple.add(new Couple<String, Integer>("f",3));
		System.out.format("q1.a - avant comparaison -> %s\n",couple);
		Collections.sort(couple,compSecond);
		System.out.format("q1.a - apres comparaison -> %s\n",couple);

		/*
		 * q1.b. Créer un comparateur permettant d’ordonner deux couples suivant
		 * leur premier élément. Ordonner la liste précédente suivant ce
		 * comparateur ; faire afficher le résultat.
		 */

		Collections.sort(couple,compPremier);
		System.out.format("q1.b -> %s\n",couple);

		/*
		 * q1.c. Donner les deux appels à la méthode sortAndPrint qui remplace
		 * le code « ordonner et afficher » des questions précédentes.
		 */

		sortAndPrint(couple,compSecond);
		sortAndPrint(couple,compPremier);
	}

	public static void sortAndPrint(List<Couple<String, Integer>> l,
			Comparator<Couple<String, Integer>> comp) {
		/*
		 * q1.c à compléter : ordonner la liste donnée en premier paramètre
		 * suivant le comparateur donné en second paramètre et afficher cette
		 * liste.
		 */
		System.out.format("q1.c avant sort&print -> %s\n",l);
		Collections.sort(l,comp);
		System.out.format("q1.c apres sort&print -> %s\n",l);


	}

}
