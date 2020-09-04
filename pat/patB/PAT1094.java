package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/22 21:40
 * @Description:1094 谷歌的招聘
 */
public class PAT1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        judge(str, k);
    }

    private static void judge(String str, int k) {
        //找到情况
        //思路： 线性遍历 步长为k 转换成整数 如果是素数则输出
        for (int i = 0; i <= str.length() - k; i++) {
          /*  int tempk  = k - 1;
            int data = 0;
            for(int j = i;j < i+k;j++ ){
                data += (str.charAt(j)-'0') * Math.pow(10,tempk--);
            }
            if(isPrime(data)){
                System.out.println(data);return;
            }*/
            String tmp = str.substring(i, i + k);
            int data = Integer.valueOf(tmp);
            if (isPrime(data)) {
                System.out.println(tmp);
                return;
            }
        }
        //没找到404
        System.out.println("404");
    }

    private static boolean isPrime(int data) {
        for (int i = 2; i <= Math.sqrt(data); i++) {
            if (data % i == 0) return false;
        }
        return true;
    }
}
