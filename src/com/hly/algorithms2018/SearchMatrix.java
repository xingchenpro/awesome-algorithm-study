package com.hly.algorithms2018;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/3
 */
//todo 搜索二维矩阵 II
//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
//每行的元素从左到右升序排列。
//列的元素从上到下升序排列。
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;//行长度，多少行
        if(m==0)
            return false;
        int n = matrix[0].length;//列长度，每一行多少列
        if(n==0)
            return false;
        int i = m-1;
        int j=0;
        while (i>=0&&j<n){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                j=j+1;
            }
            else{
                i=i-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                };
        int[][] matrix2={{-5}};
        System.err.println(searchMatrix(matrix,5));
        System.err.println(searchMatrix(matrix,20));
        System.err.println(searchMatrix(matrix2,-5));


    }
}

//左下角的元素是这一行中最小的元素，同时又是这一列中最大的元素。比较左下角元素和目标：
//若左下角元素等于目标，则找到
//若左下角元素大于目标，则目标不可能存在于当前矩阵的最后一行，问题规模可以减小为在去掉最后一行的子矩阵中寻找目标
//若左下角元素小于目标，则目标不可能存在于当前矩阵的第一列，问题规模可以减小为在去掉第一列的子矩阵中寻找目标
//若最后矩阵减小为空，则说明不存在