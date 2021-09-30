public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();
        // System.out.println(puzzleJava.get10());
        String[] alphabet = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        // System.out.println(puzzleJava.randLetter(alphabet));
        System.out.println(puzzleJava.generatePassword(alphabet));
    }
}