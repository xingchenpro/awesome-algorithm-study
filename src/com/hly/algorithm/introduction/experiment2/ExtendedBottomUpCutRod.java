package com.hly.algorithm.introduction.experiment2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/6
 */
//钢条切割(自底向上)
public class ExtendedBottomUpCutRod {
    private static class Result {
        private int r[];
        private int s[];
    }

    public static Result extendedBottomUpCutRod(int p[], int n) {

        //0,1, 5, 8, 9, 10, 17, 17, 20, 24, 30
        int s[] = new int[n+1];
        int r[] = new int[n+1];

        r[0]=0;
        //长度为j的最优解
        for (int j = 1; j <= n; j++) {
            int q = Integer.MIN_VALUE;
            //第i次的所有解
            for (int i = 1; i <= j; i++) {
                //取第i次所有解的最大值,p[i]本次分割的长度，r[j-i]为子钢条的最优解
                if(q<p[i]+r[j-i]){
                    q=p[i]+r[j-i];
                    s[j]=i;//长度为j最优解中第一段钢条的切割长度
                }
            }
            //记录最优解
            r[j]=q;
        }
        Result result = new Result();
        result.r =r;
        result.s=s;
        return result;
    }

    public static void main(String[] args) {

        //4:10,7:18,10:30
        int p[] = {0,1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int m=10;
        Result result = extendedBottomUpCutRod(p,m);
       for(int i:result.s)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("最优解："+result.r[m]);
    }
}
