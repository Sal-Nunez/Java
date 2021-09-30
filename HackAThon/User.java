import java.util.*;
public class User  {
    protected int health;
    protected int armour;
    protected int attackDamage;
    protected int attackSpeed;
    protected String name;
    protected ArrayList<String> moveList = new ArrayList<String>();

    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getArmour() {
        return this.armour;
    }
    public void setArmour(int armour) {
        this.armour = armour;
    }
    public int getAttackDamage() {
        return this.attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public int getAttackSpeed() {
        return this.attackSpeed;
    }
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    public ArrayList<String> getMoveList(){
        return this.moveList;
    }
    public void displayMoveList(){
        for (int i = 0; i < this.moveList.size(); i++){
            System.out.println(i + " - " + this.moveList.get(i));
        }
    }
    public void attack(User target) {
        slowDisplay(String.format("This is the start of "+this.name + "'s turn\n"));
        if (!this.name.contains("Evil")){
            System.out.println("Please choose a move");
            this.displayMoveList();
            
            String moveIndex = System.console().readLine();
            boolean choiceValidMove = false;
            while(!choiceValidMove){
                try{
                    Integer why2 = Integer.parseInt(moveIndex);
                    slowDisplay(String.format("You have chosen %s\n", this.getMoveList().get(why2)));
                    choiceValidMove = true;
                } catch (Exception e){
                    System.out.println("Please choose a valid number \n");
                    moveIndex = System.console().readLine();
            }
        }

        Integer moveIdexInt = Integer.parseInt(moveIndex);
        String actualMove = this.getMoveList().get(moveIdexInt);
        int realDamage = (this.attackDamage);
        slowDisplay(String.format("%s attacks %s with %s\n",this.name,target.name, actualMove ));
        target.takeDamage(realDamage);
        } else {
            Random rand = new Random();
		    int x = rand.nextInt(this.getMoveList().size());
            String actualMove  = this.getMoveList().get(x);
            int realDamage = (this.attackDamage);
            slowDisplay(String.format("%s attacked %s with %s!\n",this.name,target.name, actualMove ));
            target.takeDamage(realDamage);

        }
        // target.setHealth(target.getHealth() - this.attackDamage))
    }
    public void slowDisplay(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            try{
            Thread.sleep(30);
            } catch (InterruptedException e) {}
        }
    }
    public void takeDamage(int damage) {
        // make damage 75% - 125% of damage
            Random rand = new Random();
            int game = rand.nextInt(51) + 75;
            double game2 = (double) game;
            double percDamage =  game2/100.0;
            double realSomething = (double) damage;
            double actualDamageNotReal =  realSomething * percDamage;
            int actualDamage = (int) actualDamageNotReal;
            int actualDmg = actualDamage - this.armour;
        if (actualDmg <= 0){
            actualDmg = 0;
        }
        this.health -= actualDmg;
        slowDisplay(String.format("%s takes %s damage, now at %s\n",this.name,actualDmg,this.health));

    }

    public void displayStats() {
        slowDisplay(String.format("%s Stats\nHealth - %d\nArmour - %d\nAttack Damage - %d\nAttack Speed - %d \n", this.name, this.health, this.armour, this.attackDamage, this.attackSpeed));
    }


    
}

