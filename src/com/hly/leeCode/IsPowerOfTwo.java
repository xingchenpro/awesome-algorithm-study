package com.hly.leeCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/19
 */
//231. 2的幂
//&操作，相同位的两个数字都为1，则为1；若有一个不为1，则为0
//4的二进制是100，只要是2的倍数，二进制最高位是1，其余是0。4-1的二进制是011，可以看见，刚好所有的位置01对换。4和3相与，就是0。
public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        return (n&(n-1))==0;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(64));
    }
}
