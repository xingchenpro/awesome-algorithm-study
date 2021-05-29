package com.hly.backup.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/2
 * @QQ :1136513099
 * @desc :
 */
//AC 884. 两句话中的不常见单词
//给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
//如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
//返回所有不常用单词的列表。
//您可以按任何顺序返回列表。
//输入：A = "this apple is sweet", B = "this apple is sour"
//输出：["sweet","sour"]
public class NncommonFromSentences {

    public static String[] uncommonFromSentences(String A, String B) {
        String[] stringsA = A.split(" ");
        String[] stringsB = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < stringsA.length; i++) {
            if (map.get(stringsA[i]) == null) {
                map.put(stringsA[i], 1);
            } else {
                map.put(stringsA[i], map.get(stringsA[i]) + 1);
            }
        }
        for (int i = 0; i < stringsB.length; i++) {
            if (map.get(stringsB[i]) == null) {
                map.put(stringsB[i], 1);
            } else {
                map.put(stringsB[i], map.get(stringsB[i]) + 1);
            }
        }
        List<String> list = new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        String []res = new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args){
        String[] res = uncommonFromSentences("this apple is sweet","this apple is sour");
        for(String str:res){
            System.out.println(str);
        }
    }
}
