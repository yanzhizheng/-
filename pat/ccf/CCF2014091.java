package ccf;

import java.util.Scanner;

/**
 * 给定n个不同的整数，问这些数中有多少对整数，它们的值正好相差1。
 */
public class CCF2014091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[10001];
        int privot = 0,next = 0;
        int sum = 0;
        for(int i= 0; i < num;i++){
            int temp = sc.nextInt();
            data[temp]++;
            if(temp != 0){
                privot = data[temp-1];
            }
            if(next != 10000){
                next = data[temp+1];
            }
            if(privot != 0){
                sum++;
            }
            if(next != 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
