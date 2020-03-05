package com.hly.leetCode.everyday;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/4
 * @QQ :1136513099
 * @desc : TODO 994. 腐烂的橘子
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 * 输入：[[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 */
public class OrangesRotting {

    int[][] grid;

    //解法1：BFS
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length, n = grid[0].length;
        int cnt1 = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(i * n + j); // 将腐烂的橘子入队
                } else if (grid[i][j] == 1) {
                    cnt1++; // 统计新鲜橘子的数量
                }
            }
        }
        int time = 0;
        while (!queue.isEmpty() && cnt1 > 0) { // 当队列空了 或者 没有新鲜橘子了，停止循环
            time++; // 一层一层的传染，每传染一层，时间+1
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int p = queue.poll();
                int x = p / n, y = p % n;
                if (x - 1 >= 0 && grid[x - 1][y] == 1) { // 上
                    cnt1--; // 每传染一个，更新新鲜橘子的数量
                    grid[x - 1][y] = 2;
                    queue.offer((x - 1) * n + y);
                }
                if (x + 1 < m && grid[x + 1][y] == 1) { // 下
                    cnt1--;
                    grid[x + 1][y] = 2;
                    queue.offer((x + 1) * n + y);
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) { // 左
                    cnt1--;
                    grid[x][y - 1] = 2;
                    queue.offer(x * n + y - 1);
                }
                if (y + 1 < n && grid[x][y + 1] == 1) { // 右
                    cnt1--;
                    grid[x][y + 1] = 2;
                    queue.offer(x * n + y + 1);
                }
            }
        }
        return cnt1 == 0 ? time : -1;
    }

    //解法2：DFS
    public int orangesRotting2(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(i, j, 2); // 开始传染
                }
            }
        }

        // 经过dfs后，grid数组中记录了每个橘子被传染时的路径长度，找出最大的长度即为腐烂全部橘子所用的时间。
        int maxLevel = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1; // 若有新鲜橘子未被传染到，直接返回-1
                } else {
                    maxLevel = Math.max(maxLevel, grid[i][j]);
                }
            }
        }
        return maxLevel == 0 ? 0 : maxLevel - 2;
    }

    private void dfs(int i, int j, int level) { // level用来记录传染路径的长度（当然最后要减2）
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] != 1 && grid[i][j] < level) { // 只有新鲜橘子或者传播路径比当前路径长的橘子，才继续进行传播。
            return;
        }
        grid[i][j] = level; // 将传染路径的长度存到grid[i][j]中
        level++;
        dfs(i - 1, j, level);
        dfs(i + 1, j, level);
        dfs(i, j - 1, level);
        dfs(i, j + 1, level);
    }

    public static void main(String[] args) {

        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println("");
    }


}
