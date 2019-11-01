package com.hly.backup.review.review8_13.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/13
 * @QQ :1136513099
 * @desc :
 */
public class HammingWeight {


    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }

}
