package patB;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 比较此对象与指定对象的顺序。
 * 如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。
 * @Author: yanzz
 * @Date: 2020/02/27 13:28
 * @Description:1015 德才论
 * 四类人： 德才兼备
 * 德分和才分均不低于此线的被定义为“才德全尽”
 * 才分不到但德分到线的一类考生属于“德胜才”
 * 德才分均低于 H，但是德分不低于才分的考生属于“才德兼亡”但尚有“德胜才”者
 */
class Stu implements Comparable<Stu> {
    String id;
    int df;
    int cf;
    int flag;
    int sum;

    @Override
    public int compareTo(Stu o) {
        //类别小的排在前面
        if(this.flag != o.flag){
            return this.flag>o.flag?1:-1;
        }
        //类别相同，总分大的在前
        else if(this.sum != o.sum){
            return this.sum>o.sum?1:-1;
        }
        //总分相同，德分大德在前
        else if(this.df != o.df){
            return this.df>o.df?1:-1;
        }
        //德分相同，准考证小德在前
        else return this.id.compareTo(o.id);
    }
}

public class PATB1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //考生总数
        int L = sc.nextInt();   //录取最低分  德，才>=L
        int H = sc.nextInt();   //优先录取先
        String id;
        int df, cf;
        Stu[] ss = new Stu[10001];
        int count = N;
        for (int i = 0; i < N; i++) {
            id = sc.next();
            df = sc.nextInt();
            cf = sc.nextInt();
            Stu s = new Stu();
            s.sum = df + cf;
            s.df = df;
            s.cf = cf;
            s.id= id;
            if (df < L || cf < L) {
                s.flag = 5;
                count--;    //合格数减1
            } else {
                if (df >= H) {
                    if (cf >= H) {
                        s.flag = 1;
                    } else {
                        s.flag = 2;
                    }
                }else if (df > cf) {
                    s.flag = 3;
                } else {
                    s.flag = 4;
                }
            }
            ss[i] = s;
        }
        Arrays.sort(ss,0,N);
        System.out.println(count);
        for(int i = 0; i < count;i++){
            System.out.printf("%s %d %d\n",ss[i].id,ss[i].df,ss[i].cf);
        }
    }
}
