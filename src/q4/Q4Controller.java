package q4;

public class Q4Controller {
	Q4View view;
	Q4Model model;

	public Q4Controller(Q4View view) {
		super();
		this.view = view;
		model = new Q4Model();
		initialize();
	}
	public void valideMot(String mot) {
		/**
		 * Demande au modèle de valider le mot
		 */
		model.valideMot(mot);
	}
	private void initialize() {
		/**
		 * initialise le binding modèle -> vue
		 */
		view.nb.textProperty().bind(model.nbcarProperty().asString());
	}
}
