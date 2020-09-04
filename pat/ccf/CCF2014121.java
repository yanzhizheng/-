package ccf;

import java.util.Scanner;

public class CCF2014121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dd = new int[1001];
        int[] record = new int[num];
        for(int i = 0;i < num;i++){
            int temp = sc.nextInt();
            dd[temp]++;
            record[i] = dd[temp];
        }
        for(int temp : record){
            System.out.printf("%d ",temp);
        }
    }
}
