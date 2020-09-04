package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/22 20:49
 * @Description: 小赌怡情
 */
public class PAT1071 {
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum = sc.nextInt();
        int k = sc.nextInt();
        int n1, b, t, n2;
        for (int i = 0; i < k; i++) {
            n1 = sc.nextInt();
            b = sc.nextInt();
            t = sc.nextInt();
            n2 = sc.nextInt();
            judge(n1, b, t, n2);
            if (sum == 0) {
                System.out.println("Game Over.");
                break; //这个位置之前放在judge
                // 之前结果报错， 先进性游戏在判断
            }
        }
    }

    public static void judge(int n1, int b, int t, int n2) {

        if (sum < t) {
            System.out.println("Not enough tokens.  Total = " + sum + ".");
            return;
        } /*else if(n1 < n2){
            //第二个数比第一个大
            if(b == 1){
                print(true,t);
            }else{
               print(false,t);
            }
        }else{
            //n1>n2
            if(b == 0){
                print(true,t);
            }else{
                print(false,t);
            }
        }*/
        int res = n1 < n2 ? 1 : 0;
        if (b == res) {
            print(true, t);
        } else {
            print(false, t);
        }
    }

    private static void print(boolean flag, int t) {
        if (flag) {
            //赢了
            sum += t;
            System.out.println("Win " + t + "!  Total = " + sum + ".");
        } else {
            //输了
            sum -= t;
            System.out.println("Lose " + t + ".  Total = " + sum + ".");

        }
    }
}
