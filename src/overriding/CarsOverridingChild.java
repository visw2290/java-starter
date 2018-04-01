package overriding;

/***
 * Rules for method overriding
 * The number of arguments in the overriding methods should be the same as the parent overridden method
 * The access modifiers of the overriding method cannot be more restrictive than the overridden method
 * private,static and final methods cannot be overridden as they are local to the class
 * @author Viswa
 *
 */

public class CarsOverridingChild extends CarsOverridingParent {
	
	@Override
	public void engineStart() {
		super.engineStart();
		System.out.println("This is implemented in child");
	}

}
