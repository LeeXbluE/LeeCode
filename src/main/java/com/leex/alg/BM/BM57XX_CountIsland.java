package com.leex.alg.BM;

import java.util.Objects;

/**
 * @title: BMXX_CountIsland
 * @Author LeeX
 * @Date: 2022/7/16 22:47
 * @Version 1.0
 */
public class BM57XX_CountIsland {



    /**
     * dfs
     *
     * @param grid
     * @return
     */
    public int solveDFS(char[][] grid) {
        if (Objects.isNull(grid)) {
            return -1;
        }
        int height = grid.length;
        int width = grid[0].length;
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (Objects.equals(grid[i][j], '1')) {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int x, int y) {
        int height = grid.length;
        int width = grid[0].length;
        grid[x][y] = '0';
        if (x - 1 >= 0 && Objects.equals(grid[x - 1][y], '1')) {
            //上
            dfs(grid, x - 1, y);
        }
        if (x + 1 < height && Objects.equals(grid[x + 1][y], '1')) {
            //下
            dfs(grid, x + 1, y);
        }
        if (y - 1 >= 0 && Objects.equals(grid[x][y - 1], '1')) {
            //左
            dfs(grid, x, y - 1);
        }
        if (y + 1 < width && Objects.equals(grid[x][y + 1], '1')) {
            //右
            dfs(grid, x, y + 1);
        }
    }

    /**
     * BFS
     *
     * @param grid
     * @return
     */
    public int solveBFS(char[][] grid) {

        return -1;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},{'0','1','0','1','1'},{'0','0','0','1','1'},{'0','0','0','0','0'},{'0','0','1','1','1'}};
        BM57XX_CountIsland test = new BM57XX_CountIsland();
        System.out.println(test.solveDFS(grid));
    }
}
