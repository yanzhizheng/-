package ccf;

import java.util.Scanner;

/**
 * 小明上学
 * 小明是汉东省政法大学附属中学的一名学生，他每天都要骑自行车往返于家和学校。
 * 为了能尽可能充足地睡眠，他希望能够预计自己上学所需要的时间。
 * 他上学需要经过数段道路，相邻两段道路之间设有至多一盏红绿灯。
 * 京州市的红绿灯是这样工作的：每盏红绿灯有红、黄、绿三盏灯和一个能够显示倒计时的显示牌。
 * 假设红绿灯被设定为红灯 r 秒，黄灯 y 秒，绿灯 g 秒，那么从 0 时刻起，[0,r) 秒内亮红灯，车辆不许通过；
 * [r, r+g) 秒内亮绿灯，车辆允许通过；[r+g, r+g+y) 秒内亮黄灯，车辆不许通过，然后依次循环。
 * 倒计时的显示牌上显示的数字 l（l > 0）是指距离下一次信号灯变化的秒数。
 * 1-2-3红灯过后绿灯-->黄灯
 * 0 10 sum+=10; 10
 * 1 5  此时红灯等5s sum+=5 15;
 * 0 11 sum+=11; 26
 * 2 2 黄灯2 sum+=2;28亮红灯30 58
 * 0 6 64
 * 0 3 67
 * 3 10 能通过
 * 0 3 70
 */
public class CCF2018121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,y,g;
        int n;
        r = sc.nextInt();  //红灯
        y = sc.nextInt(); //黄
        g = sc.nextInt();   //绿
        n = sc.nextInt();
        int k, t; //k表示经过一段路耗时ts，k取0，1，2，3
        int sum = 0; //记录所花时间
        for(int i = 0;i < n; i++){
            k = sc.nextInt();
            t = sc.nextInt();
            if(k == 0 || k == 1){
                //k=0时候经过一段路 k=1等红灯耗时t
                sum += t;
            }
            if(k == 2){
                sum = sum + t + r;//还要等一个红灯
            }
            //k==3不需要等 k=3是绿灯可以直接同行
        }
        System.out.println(sum);
    }
}
