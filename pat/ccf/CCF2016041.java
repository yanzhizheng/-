package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/24 22:14
 * @Description:折点计数  既要知道从前，又要知道将输入的数据
 */
public class CCF2016041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[] data = new int[num];
        for(int i = 0;i < num; i++){
            data[i] = sc.nextInt();
        }
        for(int j = 1;j < num-1; j++){
            if( data[j-1] > data[j] && data[j+1] > data[j] ) count++; //V字形
            if(data[j-1] < data[j] && data[j] > data[j+1]) count++; //^
        }
        System.out.println(count);

    }
}
