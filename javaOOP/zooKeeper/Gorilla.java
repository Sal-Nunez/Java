public class Gorilla extends Mammal{
	public void throwSomething(String something) {
		System.out.println(String.format("Gorilla tries to throw %s", something));
		if (this.displayEnergy() >= 5) {
			this.removeEnergyLevel(5);
			System.out.println(String.format("Threw %s Succesfully", something));
		} else {
			System.out.println("Gorilla is too tired.");
		}
	}
	public void eatBananas() {
		System.out.println("Gorilla eats banana.");
		this.addEnergyLevel(10);
		System.out.println("EnergyLevel: " + this.displayEnergy());
	}
	public void climb() {
		System.out.println("Gorilla tries to climb.");
		if (this.displayEnergy() >= 10) {
			this.removeEnergyLevel(10);
			System.out.println("Climbed Succesfully");
		} else {
			System.out.println("Gorilla is too tired.");
		}
	}

}