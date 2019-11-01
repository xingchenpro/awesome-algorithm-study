package com.hly.backup.review.review8_4.offer;

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

    //累加
    public int findGreatestSumOfSubArray2(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(max<sum)
                max = sum;
            //负数，赋值为 0 ，不然越加越小
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
