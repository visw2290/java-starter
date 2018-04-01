package oopsconcepts;

public class InterfaceDemo implements CarsInterface, BMWInterface {

	@Override
	public void flickerHeadLight() {
		System.out.println("Implemented flicker headlight");
		
	}

	@Override
	public void engineType(boolean keyless, String cyl) {
		System.out.println("Implemented the engine with functions");
		
	}

}
