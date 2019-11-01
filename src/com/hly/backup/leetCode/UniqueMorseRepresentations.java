package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/15
 * @QQ :1136513099
 * @desc : todo 804. 唯一摩尔斯密码词
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * 返回我们可以获得所有词不同单词翻译的数量。
 */
public class UniqueMorseRepresentations {


    public int uniqueMorseRepresentations(String[] words) {
        String morseString[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<Character, Object> map = new HashMap<>();
        char ac = 'a';
        for (String s : morseString) {
            map.put(ac++, s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i<words.length;i++){
            stringBuilder.append(map.get(words[i]));
        }
        return -1;
    }

    public static void main(String[] args) {


    }


}
