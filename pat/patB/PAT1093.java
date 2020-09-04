package patB;

import java.util.Scanner;

/**
 * @Author: yanzz
 * @Date: 2020/02/23 22:02
 * @Description: AUB  16分代码  4.5测试点超时
 * 给定两个字符串 A 和 B，本题要求你输出 A+B，即两个字符串的并集。要求先输出 A，再输出 B，但重复的字符必须被剔除。
 * 0 48
 * a的ascall码97
 * A 65
 * Z 128
 */
public class PAT1093 {

    static int[] data = new int[128];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        pj(A + B);

    }

    private static void pj(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (data[ch[i]] == 0) {
                System.out.print(ch[i]);
                data[ch[i]] = 1;
            }
        }
    }
}
/**
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * <p>
 * public class Main {
 * private static void output(char[] arr, boolean[] ascii) {
 * for (int i = 0; i < arr.length; ++i) {
 * if (false == ascii[arr[i]]) {
 * System.out.print(arr[i]);
 * ascii[arr[i]] = true;
 * }
 * }
 * }
 * <p>
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * char[] a = br.readLine().toCharArray();
 * char[] b = br.readLine().toCharArray();
 * boolean[] ascii = new boolean[127];
 * output(a, ascii);
 * output(b, ascii);
 * }
 * }
 */