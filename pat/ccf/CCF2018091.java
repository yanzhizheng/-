package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/26 21:59
 * @Description:
 * 在一条街上有n个卖菜的商店，按1至n的顺序排成一排，这些商店都卖一种蔬菜。
 * 第一天，每个商店都自己定了一个价格。店主们希望自己的菜价和其他商店的一致，
 * 第二天，每一家商店都会根据他自己和相邻商店的价格调整自己的价格。
 * 具体的，每家商店都会将第二天的菜价设置为自己和相邻商店第一天菜价的平均值（用去尾法取整）。
 * 注意，编号为1的商店只有一个相邻的商店2，编号为n的商店只有一个相邻的商店n-1，
 * 其他编号为i的商店有两个相邻的商店i-1和i+1。
 * 　给定第一天各个商店的菜价，请计算第二天每个商店的菜价
 */
public class CCF2018091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0;i < n; i++){
            d[i] = sc.nextInt();
        }
        for(int j = 0;j < n; j++){
            if(j == 0){
                System.out.print((d[j]+d[j+1])/2);
            }else if(j == n-1){
                System.out.print((d[j-1]+d[j])/2);
            } else{
                System.out.print((d[j-1]+d[j]+d[j+1])/3);
            }
            System.out.print(" ");
        }
    }
}
