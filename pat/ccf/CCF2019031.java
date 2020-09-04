package ccf;

import java.util.Scanner;

/**
 * 80分 代码超时 没办法
 */
public class CCF2019031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0, min=0,mid=0,temp;
        int index = n>>1 ;
        boolean flag = n%2==0?true:false;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if(flag){
                //n为偶数
                if(i == index || i == index-1){
                    mid += temp;
                }
            }else{
                //奇数
                if(i == index){
                    mid = temp;
                }
            }
            if(i == 0){
                min = temp;
            }
            if(i == n-1){
                max = temp;
            }
        }
        if(max < min){
            temp = max;
            max = min;
            min =temp;
        }
        if(!flag){
            System.out.printf("%d %d %d",max,mid,min);
        }else{
            System.out.printf("%d %.1f %d",max,mid/2.0,min);
        }
    }
}

