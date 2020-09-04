package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/22 22:10
 * @Description:检查密码 并且只能有英文字母、数字和小数点 .，
 * 还必须既有字母也有数字
 */
public class PAT1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String patter = ""; //匹配合法字符
        for (int i = 0; i < k; i++) {
            String str = sc.next();
            if (str.length() < 6) {
                System.out.println("Your password is tai duan le.");
            } else {
                //
            }
        }
    }
}
