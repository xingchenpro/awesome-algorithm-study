package com.hly.backup.leetCode;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/21
 * @QQ :1136513099
 * @desc : 973. 最接近原点的 K 个点
 */

import java.util.Arrays;
/**
 * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
 *（这里，平面上两点之间的距离是欧几里德距离。）
 *你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
 */
public class KClosest {

    //排序 (O)nlogn
    public static int[][] kClosest(int[][] points, int K) {
        int [] dists = new int [points.length];
        for(int i=0;i<points.length;i++)
            dists[i] = dist(points[i]);
            Arrays.sort(dists);
            int distK = dists[K-1];

            int res [][] = new int [K][2];
            int t = 0;
            for(int i=0;i<points.length;i++)
                if(dist(points[i])<=distK)
                    res[t++] = points[i];
            return res;
    }
    public static int dist(int point[]){
        return point[0]*point[0]+point[1]*point[1];
    }

    public static void main(String[] args){
        int [][] result = kClosest(new int [][]{{3,3},{5,-1},{-2,4}},2);
        for(int i=0;i<result.length;i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        System.out.println();
    }
}
