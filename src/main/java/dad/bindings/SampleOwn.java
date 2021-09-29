package dad.bindings;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class SampleOwn extends Application {

	//vista
	private TextField operando1;
	private TextField operando2;
	private TextField resultado;
	
	//modelo
	private IntegerProperty numero1 = new SimpleIntegerProperty();
	private IntegerProperty numero2 = new SimpleIntegerProperty();
	
	private StringProperty texto1 = new SimpleStringProperty();
	private StringProperty texto2 = new SimpleStringProperty();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		operando1 = new TextField();
		operando2 = new TextField();
		resultado = new TextField();
		
		VBox root = new VBox();
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(operando1, operando2, resultado);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Sumador");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		operando1.textProperty().bindBidirectional(texto1);
		operando2.textProperty().bindBidirectional(texto2);
		
		texto1.bindBidirectional(numero1, new NumberStringConverter());
		texto2.bindBidirectional(numero2, new NumberStringConverter());
		
		resultado.textProperty().bind(
				numero1.add(numero2).asString()
				);
		
//		operando1.textProperty().bind(texto1.asString());
//		operando2.textProperty().bind(texto2.asString());
//		resultado.textProperty().bind(texto1.add(texto2).asString());
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
