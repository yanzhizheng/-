package patB;
import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/21 21:23
 * @Description:三人行
 */
public class ThreeMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maxJia = 0;
        int maxyi = 0;
        for (int a = 9; a >= 1; a--) {
            for (int b = 9; b >= 0; b--) {
                int jia = a * 10 + b;
                int yi = b * 10 + a;
                if (Math.abs(jia - yi) == x * yi * 1.0 / y) {
                    maxJia = jia;
                    maxyi = yi;
                    String s1 = evaluate(m, maxJia);
                    String s2 = evaluate(m, maxyi);
                    String s3 = evaluate(m, maxyi * 1.0 / y);
                    System.out.printf("%d %s %s %s", maxJia, s1, s2, s3);
                    return;
                }
            }
        }
        System.out.println("No Solution");
    }

    protected static String evaluate(int m, double n) {
        if (m < n) {
            return "Cong";
        } else if (m == n) {
            return "Ping";
        } else {
            return "Gai";
        }
    }
}
