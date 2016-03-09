package q3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Q3Main {

	public static void main(String[] args) {
		/*
		 * q3.b. Créer une liste de trois objets de type MonthResult à partir
		 * des fichiers du répertoire documents (q3doc1.json, q3doc2.json et
		 * q3doc3.json). Afficher cette liste.
		 */
		List<MonthResult> troisObjets = new ArrayList<>();

		Path p1 = Paths.get("documents/q2doc1.json");
		Path p2 = Paths.get("documents/q2doc2.json");
		Path p3 = Paths.get("documents/q2doc3.json");

		File f1 = p1.toFile();
		File f2 = p2.toFile();
		File f3 = p3.toFile();

		ObjectMapper mapper = new ObjectMapper();

		try {
			MonthResult m1 = mapper.readValue(f1, MonthResult.class);
			MonthResult m2 = mapper.readValue(f2, MonthResult.class);
			MonthResult m3 = mapper.readValue(f3, MonthResult.class);
			troisObjets.add(m1);
			troisObjets.add(m2);
			troisObjets.add(m3);

			System.out.format("q3.b -> liste de 3 MonthResult :\n %s -> %s\n %s -> %s\n %s -> %s\n",f1, m1, f2, m2, f3, m3);
			System.out.format("q3.b BIS avec la liste -> %s\n",troisObjets);

		}
		catch (IOException e) {
			e.printStackTrace();
		}

		//meme chose avec load
		String[] lst = {"q2doc1.json", "q2doc2.json", "q2doc3.json"};
		MonthResult nm1 = load(lst[0]);
		MonthResult nm2 = load(lst[1]);
		MonthResult nm3 = load(lst[2]);
					System.out.format("liste de 3 MonthResult :\n %s -> %s\n %s -> %s\n %s -> %s\n",lst[0], nm1, lst[1], nm2, lst[2], nm3);
	}

	public static MonthResult load(String fileName) {
		Path path = Paths.get("documents", fileName);
		File f = path.toFile();
		MonthResult m = null;
		ObjectMapper mapper = new ObjectMapper();

		/*
		 * q3.a. Compléter le code pour créer un objet MonthResult à partir des
		 * informations contenues dans le fichier de nom fileName du répertoire
		 * documents
		 */
		try {
			m = mapper.readValue(f, MonthResult.class);


		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return m;
	}
}
