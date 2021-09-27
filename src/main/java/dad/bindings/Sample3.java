package dad.bindings;

import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample3 {

	public static void main(String[] args) {
		
		//Inicializamos los StringProperty
		StringProperty nombre = new SimpleStringProperty("Perico");
		StringProperty apellidos = new SimpleStringProperty("Palotes");
		
		//Inicializamos otro String Property 
		StringProperty nombreCompleto = new SimpleStringProperty();
		nombreCompleto.bind(nombre.concat(" ").concat(apellidos));
		
		nombreCompleto.addListener((o, ov, nv) -> System.out.println("Antes :"+ov+" / Despues :"+nv));
		
		StringExpression expresion = nombre.concat(" ").concat(apellidos);
		
		nombre.set("Juna");
		nombre.set("Ana");
		nombre.set("Ana");
		nombre.set("Maca");
		
		nombreCompleto.bind(expresion);
		
		nombreCompleto.unbind();
		
		nombreCompleto.set("Adrian Jimenez");
		
		System.out.println(nombreCompleto.get());
		
		nombreCompleto.bind(nombre.concat(" ").concat(apellidos));
		
		
	}

}
