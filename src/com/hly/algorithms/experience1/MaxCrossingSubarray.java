package com.hly.algorithms.experience1;
import java.io.*;
/**
 * @author :黄良运
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/4/23
 */
public class MaxCrossingSubarray {

    public static  int array[];
    static {
        array = new int[1000];
        for(int i=0;i<1000;i++){
            array[i] = 100-(int)(Math.random()*200);
        }
    }
    private static class Result {
        private int maxLeft;
        private int maxRight;
        private int max;
    }

    public Result findMaxCrossingSubarray(int low, int mid, int high) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        Result result = new Result();

        for (int i = mid; i >= low; i--) {
            sum = array[i] + sum;
            if (sum > leftSum) {
                leftSum = sum;
                result.maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int j = mid + 1; j < high; j++) {
            sum = sum + array[j];
            if (sum > rightSum) {
                rightSum = sum;
                result.maxRight = j;
            }
        }
        result.max = leftSum+rightSum;
        return result;
    }

    public Result findMaximumSubarray(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            Result left = findMaximumSubarray(low, mid);
            Result right = findMaximumSubarray(mid+1, high);
            Result cross = findMaxCrossingSubarray(low,mid,high);
            if(left.max>right.max&&left.max>+cross.max)
                return left;
            if(right.max>left.max&&right.max>=cross.max)
                return right;
            if(cross.max>=left.max&&cross.max>=right.max)
                return cross;
        }
        Result result = new Result();
        result.maxLeft=low;
        result.maxRight = high;
        result.max = array[low];
        return result;
    }

    public static void main(String[] args) throws IOException {
        MaxCrossingSubarray mcs = new MaxCrossingSubarray();
        File file = new File("d:/findMaxCrossingSubarray.txt");
        FileWriter f=new FileWriter(file);
        BufferedWriter out=new BufferedWriter(f);

        for(int i=0;i<array.length;i++){
            out.write((String.valueOf(array[i])));
            out.write(" ");
            System.out.print(array[i]+" ");
        }
        System.out.println();
        out.close();
	    Result result = mcs.findMaximumSubarray(0,array.length-1);
        File file2 = new File("d:/findMaxCrossingSubarray2.txt");
        FileWriter f2=new FileWriter(file2);
        BufferedWriter out2=new BufferedWriter(f2);
        for(int i=result.maxLeft;i<=result.maxRight;i++){
            out2.write((String.valueOf(array[i])));
            out2.write(" ");
            System.out.print(array[i]+" ");
        }
        out2.close();
        System.out.println();
        System.out.println(result.maxLeft+"到"+result.maxRight+",最大值为："+result.max);
    }
}
