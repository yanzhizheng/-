package ccf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/24 22:40
 * @Description: 中间数
 * 3 4 4 6
 * 3 4 4 4 6
 */
public class CCF2016121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        for(int i = 0;i < num;i++){
            data[i] = sc.nextInt();
        }
        Arrays.sort(data);
        int left= 0;
        int right = 0;
        for(int i = 0;i < num / 2;i++){
            if(data[i] < data[num/2]){
                left++;
            }
            if(data[num-i-1] > data[num/2]){
                right++;
            }
        }
        if(left == right){
            System.out.println(data[num/2]);
        }else{
            System.out.println("-1");
        }

    }
}
