package oopsconcepts;

import accessModifiers.BenzInher;
import accessModifiers.CarsInher;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarsInher c = new CarsInher();
		c.increaseSpeed();
		System.out.println(c.getspeed());
		
		BenzInher bz = new BenzInher();
		bz.increaseSpeed();
		System.out.println(bz.getspeed());
		bz.ABS();

	}

}
