class Solution {
    static int rows;
    static int cols;

    public boolean checkValidGrid(int[][] grid) {
        //M1: DFS
        //tc:O(N^2)
        //sc: O(1)

        rows = grid.length;
        cols = grid[0].length;

        // must start at (0,0) with step 0
        if (grid[0][0] != 0) return false;

        int[] x = { 2, 1, -2, -1, -2, -1, 2, 1 };
        int[] y = { 1, 2, -1, -2, 1, 2, -1, -2 };

        return solve(grid, 0, 0, 0, x, y);

        //return reached;
    }

    static boolean solve(int[][] grid, int i, int j, int step, int[] x, int[] y) {
        //// invalid or already visited
        //grid[i][j]=1 => visited cell
        //REASON: Marking cells as visited in the Knight's Tour problem is necessary to track the knight's path, enforce the rule that no cell is visited twice, and prevent infinite loops
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != step) {
            return false;
        }

        //base case
        if (step == rows * cols - 1) {
            return true;
        }

        // explore all knight moves
        for (int move = 0; move < 8; move++) {
            //1. do something
            int newx = i + x[move];
            int newy = j + y[move];

            if(            solve(grid, newx, newy, step + 1, x, y)){
            return true;}
        }

        return false;
    }
}