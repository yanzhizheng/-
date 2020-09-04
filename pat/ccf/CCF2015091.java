package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/24 22:05
 * @Description:
 * 数列分段
 */
public class CCF2015091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastNum = -1;
        int d;
        int count = 0;
        for(int i = 0; i < num; i++){
            d = sc.nextInt();
            if(d != lastNum){
                count++;
                lastNum = d;
            }
        }
        System.out.println(count);
    }
}
