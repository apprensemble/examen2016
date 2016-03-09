package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2Main {

	public static void main(String[] args) {
		List<Integer> lint = Arrays.asList(100, 10, 40, 90, 20, 80, 50, 60, 70,
				30);
		/*
		 * q2: Classer les nombres de lint en deux sous-listes
		 * contenant l’une les nombres strictement supérieurs à 50 et l’autre
		 * les autres mises dans une même structure. Déterminer la structure à
		 * utiliser et remplir celle-ci. Afficher les deux listes résultats.
		 */
			String sup50 = "sperieur a 50";
			String autre = "les autres";
		Map<String, List<Integer>> classement = new HashMap<>();
				classement.put(sup50,new ArrayList<>());
				classement.put(autre,new ArrayList<>());
		lint.forEach(i -> {
			if (i>50) {
				classement.get(sup50).add(i);
			}
			else {
				classement.get(autre).add(i);
			}
		});
		System.out.format("superieur a 50 -> %s\n",classement.get(sup50));
		System.out.format("les autres -> %s\n",classement.get(autre));
		
		
	}

}
