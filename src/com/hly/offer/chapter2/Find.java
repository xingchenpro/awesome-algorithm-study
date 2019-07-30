package com.hly.offer.chapter2;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/29
 * @QQ :1136513099
 * @desc :4、二维数组中的查找
 */
public class Find {

    public boolean find(int target, int[][] matrix) {

        if (matrix == null)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1;//左上角开始
        while (r < rows - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int matrix[][]={{12,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(new Find().find(8, matrix));
        System.out.println(new Find().find(28, matrix));
        System.out.println(new Find().find(8, null));
    }
}
