package ccf;

import javafx.geometry.Pos;

import java.util.*;

/**
 * @Author: yanzz
 * @Date: 2020/03/01 22:38
 * @Description: 回收站选址
 */
class Position {
    int x;
    int y;
}

public class CCF2019122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Position[] d = new Position[1001];
        int[] res = new int[5];
        int x, y;
        boolean[] flag = new boolean[num];
        //初始化
        for (int i = 0; i < num; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            d[i] = new Position();
            d[i].x = x;
            d[i].y = y;
        }
        //检查
        int dd = 0;
        for (int i = 0; i < num; i++) {
            x = d[i].x;
            y = d[i].y;
            dd = 0;
            for (int j = 0; j < num; j++) {
                //先判断是否符合选址
                if (j == i) {
                    continue;
                }
                //上下
                if (d[j].x == x) {
                    if( Math.abs(d[j].y-y)==1){
                        dd++;
                    }
                }
                //左走
                if(d[j].y == y){
                    if(Math.abs(d[j].x - x) == 1){
                        dd++;
                    }
                }
            }
            if(dd == 4){
                flag[i] = true;
            }
            if(flag[i]){
                int cnt = 0;
                for(int k = 0; k < num; k++){
                    if(Math.abs(d[k].x - x) == 1
                        && Math.abs(d[k].y - y) == 1){
                        cnt++;
                    }
                }
                res[cnt]++; //相应点的个数+1;
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(res[i]);
        }

    }
}
