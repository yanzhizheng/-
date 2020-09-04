package ccf;

import java.util.Scanner;

public class CCF2014031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[1001];
        int sum = 0;
        for(int i = 0;i < num;i++){
            int index = sc.nextInt();
            index = index < 0?-index:index;
            data[index]++;
            if(data[index] == 2){
                sum++;
                data[index] = 0;
            }
        }
        System.out.println(sum);
    }
}
