import java.util.*;
public class Goblin extends User{

    public Goblin(String name){
        super(name);
        this.health = 100;
        this.attackSpeed = 30;
        this.armour = 30;
        this.attackDamage = 100;
        this.moveList.add("Kick and Scream");
        this.moveList.add("Run Away");
        this.moveList.add("Gouge Eyes");
        this.moveList.add("Kick 'em Where it Hurts");
    }
}