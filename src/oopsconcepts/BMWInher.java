package oopsconcepts;
import accessModifiers.*;

public class BMWInher extends CarsInher {
	
	public BMWInher() {
		super();
	}
	public void digitalSpeed() {
		CarsInher c1 = new CarsInher();
		c1.publicSpeed = 10;
		protectedSpeed = 30;
		
	}

}
