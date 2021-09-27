package dad.bindings;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample2 {

	public static void main(String[] args) {
		
		StringProperty nombre = new SimpleStringProperty("");
		nombre.set("Mario");
		nombre.addListener((o, ov, nv) -> System.out.println("Antes : "+ov+" / Despues : "+nv));
		
		nombre.set("Mario");
		nombre.set("Adrian");
		nombre.set("Marieta");
		
		System.out.println(nombre.get());
		
		
	}

}
