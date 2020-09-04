package ccf;

import java.util.Scanner;

/**
 * 小明种苹果
 * 3 3
 * 73 -8 -6 -4
 * 76 -5 -10 -8
 * 80 -6 -15 0
 */
public class CCF2019091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[] data = new int[n+1];
        int min = 0;
        int minIndex = 1;
        for(int i = 1; i <= n; i++){
            int zl = sc.nextInt();
            sum += zl;
            int dd = 0;
            for(int j = 0;j < m; j++){
                dd += sc.nextInt();
            }
            data[i] = dd;
            sum += dd;
            if(dd < min){
                min = dd;
                minIndex = i;
            }
        }
        System.out.println(sum +" " + minIndex +" " + -data[minIndex]);
    }
}