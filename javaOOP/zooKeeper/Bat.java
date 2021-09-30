public class Bat extends Mammal {
    public Bat() {
        this.setEnergyLevel(300);
    }
    public void fly(){
        System.out.println("SCREEEEEEEEEEEEEEE");
        if (this.displayEnergy() >= 50){
            this.removeEnergyLevel(50);
        } else {
            System.out.println("Too tired to fly");
        }
    }
    public void eatHumans(){
        System.out.println("NOMNOMNOMNOMNOMNOMNOM");
        this.addEnergyLevel(25);
    }
    public void attackTown(){
        if (this.displayEnergy() >= 100){
            System.out.println("SOUND OF TOWN ON FIRE");
            this.removeEnergyLevel(100);
        } else {
            System.out.println("Too tired to ATTACK THE CITY");
        }
    }
}