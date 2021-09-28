package dad.bindings;

import com.sun.javafx.binding.SelectBinding.AsString;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleExpression;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample5 extends Application {

	private Label ancho;
	private Label alto;
	private Label area;
	private Label posX;
	private Label posY;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ancho = new Label("ancho = xxx");
		alto = new Label("alto = xxx");
		area = new Label("area = xxx");
		
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(ancho, alto, area);

		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("(x,y)");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ancho.textProperty().bind(
				Bindings.concat("Ancho = ")
				.concat(primaryStage.widthProperty().asString("%.0f"))
				);
		
		alto.textProperty().bind(
				Bindings.concat("Alto = ")
				.concat(primaryStage.heightProperty().asString("%.0f"))
				);
		
		primaryStage.titleProperty().bind(
				Bindings
					.concat("(")
					.concat(primaryStage.xProperty().asString())
					.concat(",")
					.concat(primaryStage.yProperty().asString())
					.concat(")")
				);
		
		DoubleExpression area = primaryStage.widthProperty().multiply(primaryStage.heightProperty());
		
		this.area.textProperty().bind(
				Bindings
				.concat("Area = ")
				.concat(area.asString("%.0f"))
				.concat(" px^2")
				);
		
	
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
