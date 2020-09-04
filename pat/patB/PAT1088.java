package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/21 21:23
 * @Description:三人行 要注意double  另外计算出发时候最好*1.0
 */
public class PAT1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int a = 99; a >= 10; a--) {
            int b = a % 10 * 10 + a / 10; //乙
            double c = Math.abs(a - b) * 1.0 / x;
            if (b == c * y) {
                System.out.printf("%d", a);
                evaluate(m, a);
                evaluate(m, b);
                evaluate(m, c);
                return;
            }
        }
        System.out.println("No Solution");

    }

    protected static void evaluate(int m, double n) {
        if (m < n) {
            System.out.print(" Cong");
        } else if (m == n) {
            System.out.print(" Ping");
        } else {
            System.out.print(" Gai");
        }

    }
}

/*解法2
import java.util.Scanner;

public class Testlambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maxJia = 0;
        int maxyi = 0;
        for(int a = 9; a >= 1; a--){
            for(int b = 9; b >= 0; b--){
                int jia = a*10 + b;
                int yi = b*10 + a;
                if(Math.abs(jia-yi) == x*yi*1.0/y){
                    maxJia = jia;
                    maxyi = yi;
                    String s1 = evaluate(m,maxJia);
                    String s2 = evaluate(m,maxyi);
                    String s3 = evaluate(m,maxyi*1.0 / y);
                    System.out.printf("%d %s %s %s",maxJia,s1,s2,s3);
                    return;
                }
            }
        }
        System.out.println("No Solution");
    }
    protected static String evaluate(int m, double n){
        if(m < n){
            return "Cong";
        }else if(m == n){
            return "Ping";
        }else{
            return "Gai";
        }
    }
}
*/
