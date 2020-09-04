package ccf;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/24 22:10
 * @Description:数位之和
 */
public class CCF2015121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i++){
            sum += (ch[i]-'0');
        }
        System.out.println(sum);
    }
}
