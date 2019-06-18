package com.hly.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/29
 * @QQ :1136513099
 * @desc :
 */
public class Test {

    public static void main(String[] args){
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(2);
        HashSet set = new HashSet(list);
        set.forEach(s->System.out.println(s));

    }
}
