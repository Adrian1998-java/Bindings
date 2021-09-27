package dad.bindings;


import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;

public class Sample1 {

	public static void main(String[] args) {
			
		DoubleProperty numberProperty = new SimpleDoubleProperty(3.14);
		numberProperty.addListener((o, ov, nv) -> {
			System.out.println("Antes valia " + ov +" y ahora valgo "+ nv);
		});
		
		System.out.println("Property : " + numberProperty.get());
		
		numberProperty.set(3.14);
		System.out.println("Property : " + numberProperty.get());
		numberProperty.set(8.00);
		System.out.println("Property : " + numberProperty.get());
		numberProperty.set(5.60);
		System.out.println("Property : " + numberProperty.get());
		numberProperty.set(9.11);
		System.out.println("Property : " + numberProperty.get());
		
		
		

	}

}
