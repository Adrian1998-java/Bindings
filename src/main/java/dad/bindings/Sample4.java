package dad.bindings;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample4 extends Application {

	private TextField nombreText;
	private TextField apellidosText;
	private Label nombreCompletoLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		nombreText = new TextField();
		apellidosText = new TextField();
		
		nombreCompletoLabel = new Label();
		
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, apellidosText, nombreCompletoLabel);
		
		Scene scene = new Scene(root);
				
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		StringExpression expresion = 
				nombreText.textProperty()
				.concat(" ")
				.concat(apellidosText.textProperty());
		
		nombreCompletoLabel.textProperty().bind(expresion);
		
		primaryStage.titleProperty().bind(
				Bindings.concat("Sample 4 ---> ").concat(nombreCompletoLabel.textProperty())
				);
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
