public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla harambe = new Gorilla();
		harambe.throwSomething("Banana");
		harambe.throwSomething("rocks");
		harambe.throwSomething("Poop");
		harambe.eatBananas();
		harambe.eatBananas();
		harambe.climb();
		System.out.println(String.format("Energy Level: %d", harambe.displayEnergy()));

        Bat bat = new Bat();
        System.out.println(bat.displayEnergy());
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        System.out.println(bat.displayEnergy());
	}
}