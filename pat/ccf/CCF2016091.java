package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/24 22:27
 * @Description:
 */
public class CCF2016091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  d = 0;
        int max = 0;
        int temp;
        for(int i = 0;i < num;i++){
            if(i == 0) {
                d = sc.nextInt();
            }else{
                temp = sc.nextInt();
                int res = Math.abs(temp - d);
                d = temp;
                if(res > max){
                    max = res;
                }
            }

        }
        System.out.println(max);
    }
}
