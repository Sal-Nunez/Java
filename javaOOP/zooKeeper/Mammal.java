public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	public int displayEnergy() {
		return energyLevel;
	}

	public void addEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
	public void removeEnergyLevel(int energyLevel) {
		this.energyLevel -= energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}