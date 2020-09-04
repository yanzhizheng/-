package ccf;

import java.util.Scanner;

/**
 *图像的旋转
 * 2 3
 * 1 5 3     (i-1,j)
 * 3 2 4     (i,j) (i,j+1)
 *
 * 3 4
 * 5 2
 * 1 3
 */
public class CCF2015031 {
    static int row;
    static int col;
    static int N = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt(); //行数
        col = sc.nextInt(); //列数
        int[][] d = new int[N][N];
        for(int i = 0; i < row;i++){
            for(int j = 0;j < col;j++){
                d[i][j] = sc.nextInt();
            }
        }
        for(int i = col-1; i >= 0;i--){
            //先定位的第一行的最右边，向下输出
            for(int j = 0; j < row; j++){
                System.out.printf("%d ",d[j][i]);
            }
            System.out.println();
        }
    }
}
