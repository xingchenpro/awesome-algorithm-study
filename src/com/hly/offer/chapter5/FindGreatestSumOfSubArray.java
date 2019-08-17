package com.hly.offer.chapter5;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/1
 * @QQ :1136513099
 * @desc :43、连续子数组的最大和
 * max( dp[ i ] ) = getMax( max( dp[ i -1 ] ) + arr[ i ] ,arr[ i ] )
 */
public class FindGreatestSumOfSubArray {

    //todo 动态规划
    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
       return -1;
    }

    //累加
    public int findGreatestSumOfSubArray2(int[] array) {
        int max = Integer.MIN_VALUE,sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(sum>max)
                max= sum;
            //当sum小于0时，就不要在继续往后累加了，因为这样只会越来越小。
            if(sum<0)
                sum = 0;
        }
        return max;
    }


    public static void main(String[] args) {
        int array[] = {1, -2, 3, 10, -4, 7, 2, -5};//18
        System.out.println(new FindGreatestSumOfSubArray().findGreatestSumOfSubArray2(array));
    }
}
