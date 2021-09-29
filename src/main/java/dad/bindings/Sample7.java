package dad.bindings;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class Sample7 extends Application {

	//vista
	private TextField numeroText;
	
	//modelo
	
	private StringProperty texto = new SimpleStringProperty("3.1416");
	private DoubleProperty numero = new SimpleDoubleProperty(6.25);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		numeroText = new TextField("Hola");
		
		VBox root = new VBox(numeroText);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		texto.addListener((o, ov, nv) -> System.out.println("old :"+ov+" and new : "+nv));
		
		numeroText.textProperty().bindBidirectional(texto);
		
		texto.bindBidirectional(numero, new NumberStringConverter());
		
		Bindings.bindBidirectional(texto, numero, new NumberStringConverter());
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
