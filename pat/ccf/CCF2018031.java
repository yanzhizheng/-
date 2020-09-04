package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/26 21:24
 * @Description:　如果跳到了方块上，但没有跳到方块的中心则获得1分；
 * 跳到方块中心时，若上一次的得分为1分或这是本局游戏的第一次跳跃则此次得分为2分，
 * 否则此次得分比上一次得分多两分（即连续跳到方块中心时，总得分将+2，+4，+6，+8...）
 *     1 1 2 2 2 1 1 2 2 0
 * 得分1 1 2 4 6 1 1 2 4
 * 2 2 2
 * 1 1
 * 1 -> 2
 * 2 1
 * 2 2
 *
 */
public class CCF2018031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;    //总分数
        int num;
        int m = 1;
        while(true){
            num = sc.nextInt();
            if(num == 0) break;
           if(num == 1){
                sum += 1;
                m = 1;
            }
            if(num == 2){
               sum += 2*m;
               m++;
           }
        }
        System.out.println(sum);
    }
}
