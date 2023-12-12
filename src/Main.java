<<<<<<< HEAD
/*
 * A class responsible for running everything
 * Last update 12/12/23
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public void start(Stage stage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("PhilosophersFeast.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Philosophers Feast");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}


=======
/*
 * A class responsible for running everything
 * Last update 12/12/23
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public void start(Stage stage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("PhilosophersFeast.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Philosophers Feast");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}


>>>>>>> 86ea214af2bb1679b4414d0f940cb01828ecc034
}