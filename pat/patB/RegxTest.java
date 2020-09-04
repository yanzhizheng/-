package patB;

import java.util.Arrays;

/**
 * @Author: yanzz
 * @Date: 2020/02/23 14:18
 * @Description:正则表达式的用法 1. \\d表示一个数字
 */
public class RegxTest {
    public static String knights = "Then, when you have found the shrubbery, " +
            "you must cut down the mighties tree in the forest... with... a " +
            "herring";

    public static void split(String regx) {
        System.out.println(Arrays.toString(knights.split(regx)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+"); //切分原则是n后面跟着一个或者多个字
        System.out.println(knights.replaceFirst("f\\w+", "123456")); //String
        // 类自带的替换功能
        System.out.println(knights.replaceAll("the|tree|you", "aaaaa"));
    }
}
