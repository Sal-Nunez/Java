import java.util.*;
public class Lion extends User{

    public Lion(String name){
        super(name);
        this.health = 1000;
        this.attackSpeed = 1000;
        this.armour = 5000;
        this.attackDamage = 5000;
        this.moveList.add("Roar");
        this.moveList.add("Scratch");
        this.moveList.add("Consumes");
        this.moveList.add("Pounce");
    }
}