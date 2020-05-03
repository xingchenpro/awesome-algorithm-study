package com.hly.offer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/5/4
 * @QQ :1136513099
 * @desc : AC 面试题05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class ReplaceSpace {

    //解法1：使用 StringBuilder
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(new ReplaceSpace().replaceSpace("We are happy."));
    }
}
