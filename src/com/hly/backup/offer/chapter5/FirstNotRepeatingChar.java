package com.hly.backup.offer.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :50、只出现一次的字符
 */
public class FirstNotRepeatingChar {


    public char firstNotRepeatingChar(String s){

        int count[] = new int[256];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        for(int i = 0;i<s.length();i++)
            if(count[s.charAt(i)]==1)
                return s.charAt(i);
        return ' ';
    }

    public int firstNotRepeatingChar2(String s){
        if(s==null||s.length()==0)
            return -1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(new FirstNotRepeatingChar().firstNotRepeatingChar("abaccdeff"));
    }
}
