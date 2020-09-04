package patB;

import java.util.Scanner;

/**
 * 寻找素数对：给一个偶数等于两个最近的素数和
 */
public class PAT1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int half = num / 2;
            for (int i = half; i >= 2; i--) {
                int m = num - i;
                if (isPrime(i) && isPrime(m)) {
                    System.out.println(i + " " + m);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
