package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/9/10
 * @desc : 500. 键盘行
 * https://leetcode-cn.com/problems/keyboard-row/
 */
public class FindWords {

    public String[] findWords(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.split("q|w|e|r|t|y|u|i|o|p|Q|W|E|R|T|Y|U|I|O|P").length == 0) {
                sb.append(word).append(",");
            } else if (word.split("a|s|d|f|g|h|j|k|l|A|S|D|F|G|H|J|K|L").length == 0) {
                sb.append(word).append(",");
            } else if (word.split("z|x|c|v|b|n|m|Z|X|C|V|B|N|M").length == 0) {
                sb.append(word).append(",");
            }
        }
        return sb.length() == 0 ? new String[]{} : sb.toString().split(",");
    }

    public static void main(String[] args) {
        String[] strings = new FindWords().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
