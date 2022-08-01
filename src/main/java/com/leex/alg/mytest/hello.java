package com.leex.alg.mytest;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author 李翔
 * @date 2022/5/31
 * @description
 */
public class hello {
    public static void main(String[] args) {

/*        String s ="abcd";

        String regex = "a*";
        boolean flag = s.matches(regex);
        System.out.println("flag:"+flag);*/

/*        String content = "hello abc hello, 中国人";
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);

        System.out.println("整体匹配="+ matches);*/


        String content = "cabcbc";

        String pattern = "[*ab*]";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);


    }
}
