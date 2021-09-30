import java.util.*;
public class Game{
    
    public static void main(String[] args){
        ArrayList<String> creatures = new ArrayList<String>();
        creatures.add("Goblin");
        creatures.add("Orc");
        creatures.add("Lion");
        User player = new User("Player");
        User computer = new User("Computer");

        System.out.println("------------------------");
        System.out.println("| Welcome to the game! |");
        System.out.println("------------------------");
        System.out.println("Please choose a creature:");
        for (int i = 0; i < creatures.size(); i++){
            System.out.println(i + " - " + creatures.get(i));
        }
        boolean choiceValid = false;
        String choice = System.console().readLine();
        while(!choiceValid){
            try{
                Integer why = Integer.parseInt(choice);
                System.out.printf("You have chosen %s\n", creatures.get(why));
                choiceValid = true;
            } catch (Exception e){
                System.out.println("Please choose a valid number - idiot");
                choice = System.console().readLine();
            }
        }
        System.out.println("------------------------");
        System.out.println("Please choose your name!");
        String userName =  System.console().readLine();
        // while()
        Integer whyBetter = Integer.parseInt(choice);
        if (creatures.get(whyBetter).equals("Goblin")){
            player = new Goblin("Hero " + userName);
        } else if (creatures.get(whyBetter).equals("Orc")){
            player = new Orc("Hero " + userName);
        } else if (creatures.get(whyBetter).equals("Lion")){
            player = new Lion("Hero " + userName);
        }
        
		Random rand = new Random();
		int x = rand.nextInt(creatures.size());
        // System.out.println(x);
        if (creatures.get(x).equals("Goblin")){
            computer = new Goblin("Evil Goblin");
        } else if (creatures.get(x).equals("Orc")){
            computer = new Orc("Evil Orc");
        } else if (creatures.get(x).equals("Lion")){
            computer = new Lion("Evil Lion");
        }
         
        System.out.println("------------------------");
        player.displayStats();
        System.out.println("------------------------");
        computer.displayStats();
    

        while(player.getHealth() > 0 && computer.getHealth()  > 0){
            if(player.getAttackSpeed() >= computer.getAttackSpeed()){
        System.out.println("------------------------");
                // this.turn(player, computer);
                // System.out.println("")
                player.attack(computer);
                if(computer.getHealth() <= 0){
                    break;
                }
        System.out.println("------------------------");
                computer.attack(player);
            } else{
                System.out.println("------------------------");
                // this.turn(computer, player);
                computer.attack(player);
                if(player.getHealth() <= 0){
                    break;
                }
                System.out.println("------------------------");
                player.attack(computer);
            }
        }
        System.out.println("------------------------");
        if(player.getHealth() <= 0){
            System.out.println("Player: " + player.getName() + " has died."); 
        } else {
            System.out.println("Computer: " + computer.getName() + " has died.");
        }
        System.out.println("------------------------");
        slowDisplaySlower ("|     GAME OVER!        |");
        System.out.println("\n------------------------");

    }
        public static void slowDisplaySlower(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            try{
            Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}