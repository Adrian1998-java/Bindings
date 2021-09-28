package dad.bindings;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Sample6 extends Application {

	private TextField izquierdaText, derechaText;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		izquierdaText = new TextField();
		
		derechaText = new TextField();
		
		HBox root = new HBox(5, izquierdaText, derechaText);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		izquierdaText.textProperty().bindBidirectional(derechaText.textProperty());
		
		

	}

	public static void main(String[] args) {
		launch(args);

	}

}
