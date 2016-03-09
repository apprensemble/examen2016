package q4;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Q4View extends BorderPane {
	Q4Controller controller;
	Label motLabel, nbCar;
	TextField mot, nb;
	Button valider;

	public Q4View() {
		super();
		motLabel = new Label("Taper un mot, une expression :             ");
		nbCar = new Label("Nb de caractères :                                  ");
		mot = new TextField();
		nb = new TextField();
		nb.setDisable(true);
		valider = new Button("Ok");
		VBox vbox = new VBox();
		vbox.getChildren().addAll(getMotBox(), getLongueurBox());
		setCenter(vbox);
		initialize();
	}

	public void setController(Q4Controller controller) {
		this.controller = controller;
	}

	private void initialize() {
		/**
		 * initialise les actions
		 */
	}

	private HBox getMotBox() {
		HBox hbMot = new HBox();
		hbMot.setPadding(new Insets(10, 10, 10, 10));
		hbMot.setSpacing(20);
		hbMot.getChildren().addAll(motLabel, mot, valider);
		return hbMot;
	}

	private HBox getLongueurBox() {
		HBox hbLongueur = new HBox();
		hbLongueur.setPadding(new Insets(10, 10, 10, 10));
		hbLongueur.setSpacing(20);
		hbLongueur.getChildren().addAll(nbCar, nb);
		return hbLongueur;
	}

	public void insertNbcar(Number n) {
		/**
		 * insère un nombre dans le champ nb
		 */
		String s = String.valueOf(n);
		nb.setText(s);
	}

	public void valideMot() {
		/**
		 * Demande au contrôleur de valider le mot saisi
		 */
	}
}
