package ccf;

import java.util.Scanner;

/**
 * 201912-1: 甲乙丙丁玩一个报数游戏
 */
public class CCT2019121 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int index = 1;
        int counta = 0,countb = 0,countc = 0,countd = 0;
        while(count <= num){
            //报数小于num
            boolean flag = ff(index);
            if(!flag){
                //不符合条件
                switch (index % 4){
                    case 1:counta++;break;
                    case 2:countb++;break;
                    case 3:countc++;break;
                    case 0:countd++;break;
                    default:break;
                }
                index++;
            }else{
                //符合条件
                index++;
                count++;
            }
        }
        System.out.println(counta);
        System.out.println(countb);
        System.out.println(countc);
        System.out.println(countd);

    }
    public static boolean ff(int num){
        //判断index是否是7的倍数或者含有7的
        if(num % 7 == 0){
            return false;
        }
        do{
            if(num % 10 == 7){
                return false;
            }else{
                num /= 10;
            }
        }while(num != 0);
        return true;
    }
}
