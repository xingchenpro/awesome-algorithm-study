package com.hly.backup.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :5、替换空格
 */
public class ReplaceBlank {

    public String replaceBlank(String str) {
        if (str == null)
            return null;
        int p1 = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("  ");
            }
        }
        int p2 = sb.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = sb.charAt(p1--);
            if (c == ' ') {
                sb.setCharAt(p2--, '0');
                sb.setCharAt(p2--, '2');
                sb.setCharAt(p2--, '%');
            } else {
                sb.setCharAt(p2--, c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new ReplaceBlank().replaceBlank("We Are Happy"));
        System.out.println(new ReplaceBlank().replaceBlank("We Are"));
        System.out.println(new ReplaceBlank().replaceBlank(null));
        System.out.println(new ReplaceBlank().replaceBlank(""));
    }
}
