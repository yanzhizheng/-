package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/03/01 23:45
 * @Description:外观数列
 * d, d1, d111, d113, d11231, d112213111, ...
 * d, d1,d111,d113, d11231 d112213111
 * 1个d 3个1
 * 1个d,2个1 1个3
 * 1d 21 12 13 11
 */
public class PAT1084 {

    static String str = new String("");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int count = 1;
        //先统计str中每个字符的个数，然后在拼接成新的str
        str += d ;
        while(count < n){
            str = f(str);
            count++;
        }
        System.out.println(str);
    }

    private static String f(String str){
        StringBuffer s = new StringBuffer("");
        int cnt = 0;
        char c = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                cnt++;
            }else{
                s.append(c).append(cnt);
                c = str.charAt(i);
                cnt = 1;
            }
        }
        if(cnt > 0){
            s.append(c).append(cnt);
        }
        return s.toString();
    }
}
