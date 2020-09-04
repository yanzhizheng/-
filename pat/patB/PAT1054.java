package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/03/02 23:17
 * @Description:求平均值 一个“合法”的输入是 [−1000,1000] 区间内的实数，
 * 并且最多精确到小数点后 2 位。
 * <p>
 * 字符匹配：
 * 1.字符串含有字母 不合格，
 * 2.小数点后数字>2不合格
 * 3.
 */
public class PAT1054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int num = sc.nextInt();
        double sum = 0.0;
        int count = 0;
        while (num-- != 0) {
            s = sc.next();
            if (judge(s)) {
                count++;
                sum += Double.valueOf(s);
            }
        }
        if (count == 0) {
            System.out.println("The average of 0 numbers is Undefined");
            return;
        }else if(count == 1){
            System.out.printf("The average of 1 number is %.2f", sum);
            return;
        } else {
            System.out.printf("The average of %d numbers is %.2f", count,
                    sum * 1.0 / count);
        }
    }

    private static boolean judge(String s) {
        if ((s.charAt(0)=='-' && s.length()==1) ||
                s.matches(".*[a-z]+.*") ||
                (s.contains(".") && s.length() - s.indexOf('.') > 3) ||
                (Double.valueOf(s) > 1000.00 || Double.valueOf(s) < -1000.00)) {
            //含有字母的
            System.out.println("ERROR: " + s + " is not a legal number");
            return false;
        }
        return true;
    }
}
/*6
- -1.1 0.111 1.1 -1000 1000.1*/