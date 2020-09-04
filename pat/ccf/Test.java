package ccf;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static void ff(int n){
        System.out.println(n);
        ff(n-1);
    }
}
