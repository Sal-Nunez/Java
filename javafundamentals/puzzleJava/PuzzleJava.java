import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> get10() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(randMachine.nextInt(20)+1);
        }
        return list;
    }

    public String randLetter(String[] alphabet) {
        String letter = alphabet[randMachine.nextInt(alphabet.length)];
        return letter;
    }

    public StringBuilder generatePassword(String[] alphabet) {
        StringBuilder password = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            boolean next = randMachine.nextBoolean();
            if (next) {
                String letter = alphabet[randMachine.nextInt(alphabet.length)];
                password.append(letter);
            }
            else {
                String number = String.format("%1d", (randMachine.nextInt(9)+1));
                password.append(number);
            }
        }
        return password;
    }
}