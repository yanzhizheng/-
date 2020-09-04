package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/26 20:50
 * @Description:分蛋糕
 */
public class CCF2017031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < num; i++){
            int ai = sc.nextInt();
            sum += ai;
            if(sum >= k){
                count++; //人数加1
                sum = 0; //分配下一个人
            }
        }
        if(sum != 0) count += 1;
        System.out.println(count);
    }
}
