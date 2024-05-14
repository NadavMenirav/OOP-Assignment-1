//330845678 Nadav Menirav
/**
 * @author Nadav Menirav
 */
public class CountPairs {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int numI = 0, numJ = 0, target = 0, count = 0;
        if (args.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length - 1; j++) {
                numI = Integer.valueOf(args[i]);
                numJ = Integer.valueOf(args[j]);
                target = Integer.valueOf(args[args.length - 1]);
                if (numI + numJ < target) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}