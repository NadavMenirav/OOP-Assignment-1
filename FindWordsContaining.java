//330845678 Nadav Menirav
/**
 * @author Nadav Menirav
 */
public class FindWordsContaining {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String last = args[args.length - 1];
        if ((args.length < 2) || (last.length() > 1)) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].contains(last)) {
                System.out.println(args[i]);
            }
        }
    }
}