package ccf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/26 21:13
 * @Description:　给定n个数，请找出其中相差（差的绝对值）最小的两个数，输出它们的差值的绝对值。
 */
public class CCF2017121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] d  = new int[num];
        for(int i = 0; i < num; i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        //排序后的两个数最小相邻
        int min = 10001;
        int res;
        for(int j = 1; j < num; j++){
            res = d[j]-d[j-1];
            if( res < min ){
                min = res;
            }
        }
        System.out.println(min);
    }
}
