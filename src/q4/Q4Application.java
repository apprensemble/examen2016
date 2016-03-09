package q4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Q4Application extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Q4View root = new Q4View();
		Q4Controller controller = new Q4Controller(
				root);
		root.setController(controller);
		Scene scene = new Scene(root, 520, 110);
		stage.setTitle("Examen 2016");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
