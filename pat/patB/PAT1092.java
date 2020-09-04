package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/23 22:41
 * @Description:最好吃的月饼 15分 4，5测试点运行超时
 */
public class PAT1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  //月饼种类
        int n = sc.nextInt();   //城市
        int[] sum = new int[m + 1]; //每种月饼的销售量
        int maxNum = sum[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                sum[j] += sc.nextInt();
                if (sum[j] > maxNum) {
                    maxNum = sum[j];
                }
            }
        }
        System.out.println(maxNum);

        int count = 0;
        for (int i = 1; i <= m; i++) {
            if (sum[i] == maxNum) {
                if (count != 0) {
                    System.out.print(" ");
                }
                System.out.print(i);
                count++;
            }
        }

    }

}
