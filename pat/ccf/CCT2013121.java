package ccf;

import java.util.Scanner;

public class CCT2013121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[10001];
        int maxNum = -1;
        int maxIndex = 1000;
        for(int i = 0;i < num; i++){
            int temp = sc.nextInt();
            data[temp]++;
            if(data[temp] > maxNum){
                maxNum = data[temp];
                maxIndex = temp;
            }else if(data[temp] == maxNum){
                if(temp < maxIndex){
                    maxIndex = temp;
                }
            }
        }

        System.out.println(maxIndex);
    }
}
