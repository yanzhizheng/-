package ccf;


import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/26 21:02
 * @Description:
 * 小明带着N元钱去买酱油。酱油10块钱一瓶，商家进行促销，每买3瓶送1瓶，或者每买5瓶送2瓶。
 * 请问小明最多可以得到多少瓶酱油
 */
public class CCF2017091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        do{
            if(num < 30){
                count += num / 10;
                num = 0;
            }else if(num >= 30 && num < 50){
                count += 4;
                num -= 30;
            }else{
                count += 7;
                num -= 50;
            }
        }while(num > 0);
        System.out.println(count);
    }
}
