package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/03/05 23:35
 * @Description:1087 有多少不同的值
 * 当自然数 n 依次取 1、2、3、……、N 时，算式 ⌊n/2⌋+⌊n/3⌋+⌊n/5⌋ 有多少个不同的值？
 * （注：⌊x⌋ 为取整函数，表示不超过 x 的最大自然数，即 x 的整数部分。）
 */
public class PAT1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[15000];
        int ans = 0;
        for(int i = 1;i <= n; i++){
            int temp = i/2 + i/3 + i/5;
            if(d[temp] == 0){
                ans++;
                d[temp] = 1;
            }
        }
        System.out.println(ans);
    }
}
