package patB;

import java.util.Scanner;

/**
 * 1025 反转链表
 */
public class PAT1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pf = sc.nextInt();  //第一个元素地址
        int num = sc.nextInt(); //静态链表长度
        int k = sc.nextInt();   //步长
        Data[] dd = new Data[100001];
        for (int i = 0; i < num; i++) {
            int address = sc.nextInt();
            int data = sc.nextInt();
            int next = sc.nextInt();
            dd[address] = new Data(address, data, next);
        }

        //对数据进行排序
        int start = 0;
        for (Data temp = dd[pf]; temp.next != -1; temp = dd[temp.next]) {
            if (num - start < k) {
                break;
            } else {
                //翻转链表
            }

        }
    }

}

class Data {
    int address;
    int data;
    int next;

    public Data(int address, int data, int next) {
        this.address = address;
        this.data = data;
        this.next = next;
    }
}
