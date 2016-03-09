package q3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q3Main {

	public static void main(String[] args) {
		/*
		 * q3.b. Créer une liste de trois objets de type MonthResult à partir
		 * des fichiers du répertoire documents (q3doc1.json, q3doc2.json et
		 * q3doc3.json). Afficher cette liste.
		 */
	}

	public static MonthResult load(String fileName) {
		Path path = Paths.get("documents", fileName);
		File f = path.toFile();
		MonthResult m = null;
		/*
		 * q3.a. Compléter le code pour créer un objet MonthResult à partir des
		 * informations contenues dans le fichier de nom fileName du répertoire
		 * documents
		 */
		return m;
	}
}
