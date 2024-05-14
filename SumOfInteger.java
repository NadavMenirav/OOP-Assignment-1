//330845678 Nadav Menirav
/**
 * @author Nadav Menirav
 */
public class SumOfInteger {
    /**
     * @param num
     * @return the sum of its digits
     */
    public static int digitSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + digitSum(num / 10);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 0, sum = 0;
        if (args.length < 1) {
            System.out.println("Invalid input");
            return;
        }
        num = Integer.valueOf(args[0]);
        sum = digitSum(num);
        System.out.println(sum);
    }
}