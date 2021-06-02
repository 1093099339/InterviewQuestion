/**
 * @program: basics
 * @description:
 * @author: 全栈者也
 * @create: 2021 - 04 - 20 11:38
 **/
public class LeetCode28 {

    public static void main(String[] args) {
        String haystack = "liuya";
        String needle = "ys";
        System.out.println( strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {

       int index =  haystack.indexOf(needle);
       return  index;
    }

}
