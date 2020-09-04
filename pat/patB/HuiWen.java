package patB;

import java.util.Scanner;

/**
 * 一个正整数，如果从左向右读（称之为正序数）和从右向左读（称之为倒序数）是一样的，
 * 这样的数就叫回文数。任取一个正整数，如果不是回文数，将该数与他的倒序数相加，
 * 若其和不是回文数，则重复上述步骤，一直到获得回文数为止。例如：68变成154（68+86），
 * 再变成605（154+451），最后变成1111（605+506），而1111是回文数。
 * 于是有数学家提出一个猜想：不论开始是什么正整数，
 * 在经过有限次正序数和倒序数相加的步骤后，都会得到一个回文数。
 * 至今为止还不知道这个猜想是对还是错。现在请你编程序验证之。
 */
public class HuiWen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            convert(num);
        }
    }

    public static void convert(int num) {
        int count = 0;
        int[] data = new int[1000];
        while (true) {
            data[count++] = num;
            int m = num;
            //反转num
            int sum = num % 10;
            while (num / 10 > 0) {
                num /= 10;
                sum = sum * 10 + num % 10;
            }
            if (sum == m) {
                //是回文数字
                break;
            } else {
                num = m + sum;
            }
        }
        System.out.println(count - 1);
        for (int i = 0; i < count - 1; i++) {
            System.out.printf("%d--->", data[i]);
        }
        System.out.printf("%d", data[count - 1]);
    }


}
