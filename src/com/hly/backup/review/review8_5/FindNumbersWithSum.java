package com.hly.backup.review.review8_5;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/2
 * @QQ :1136513099
 * @desc :57、和为 s 的数字
 */
public class FindNumbersWithSum {

    public int[] findNumbersWithSum(int array[], int sum) {
        if(array==null||array.length==0)
            return null;
     int i=0,j = array.length-1;
     while (i<j){
         int n = array[i]+array[j];
         if(n==sum){
             return new int[]{array[i],array[j]};
         }else if(n>sum){
             j--;
         }else{
             i++;
         }
     }
        return null;
    }

    public static void main(String[] args) {

        int res[] = new FindNumbersWithSum().findNumbersWithSum(new int[]{1, 2, 4, 7, 11, 15}, 15);
        int res2[] = new FindNumbersWithSum().findNumbersWithSum(null, -1);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }


}
