package q4;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Q4Model {
	IntegerProperty nbcar;

	public Q4Model() {
		nbcar = new SimpleIntegerProperty(-1);
	}
	public IntegerProperty nbcarProperty() {
		return nbcar;
	}
	public void valideMot(String mot) {
		/**
		 * Doit valider le mot pour que le nombre de caractères 
		 * puisse être communiqué à l'interface
		 */
	}
}
