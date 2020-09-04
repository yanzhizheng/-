package patB;

import java.util.*;

/**
 * @Author: yanzz
 * @Date: 2020/02/23 22:08
 * @Description:
 *
 * 返回0 相对
 * - 小于
 * + 大于
 */
class People implements Comparable<People>{

    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(People o) {
        int dis = this.age - o.age;
        if(dis != 0){ //当年龄不同时候按照名字字典序排序
            return dis;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
/*
       Scanner sc = new Scanner(System.in);
        System.out.println("2.32".length());
        System.out.println("2.35".length() - "2.35".indexOf('.'));
        System.out.println(Double.valueOf("-1000") > -1000);
        System.out.println("aaaa".matches("[(a-z)+|(A-z)+]"));
*/
        People[] pp = new People[6];
        pp[0] = new People(10,"b");
        pp[1] = new People(10,"aaa");
        pp[2] = new People(53,"baa");
        pp[3] = new People(23,"3aa");
        pp[4] = new People(101,"ea");
        pp[5] = new People(1,"na");
        Arrays.sort(pp);
        for(People p : pp){
            System.out.println(p.toString());
        }
    }
}

class SS implements Comparator<SS>{

    //Comparator是java.util  而 Comparable是java.lang包
    @Override
    public int compare(SS o1, SS o2) {
        return 0;
    }
}