/**
	 * @author MUTHUSUNDARAM_T
	 */
public class Bird extends Animal{
	public void eat()
	{
		System.out.println("Every birds can eat..!");
	}
	public void sleep()
	{
		System.out.println("Sleep is the best medicine..!");
	}
	public void fly()
	{
		System.out.println("Birds can fly");
	}
	public static void main(String[] args) {
		Animal ani = new Animal();
		Bird bir = new Bird();
		ani.eat();
		ani.sleep();
		bir.eat();
		bir.sleep();
		bir.fly();

	}

}
