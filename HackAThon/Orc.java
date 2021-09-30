import java.util.*;
public class Orc extends User{

    public Orc(String name){
        super(name);
        this.health = 100;
        this.attackSpeed = 10;
        this.armour = 50;
        this.attackDamage = 50;
        this.moveList.add("Intimidate");
        this.moveList.add("Swing Club Belligerently");
        this.moveList.add("Get Sidetracked with a butterfly");
        this.moveList.add("Pick nose");
    }
}