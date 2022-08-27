class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0 || grid == null) {
            return 0;
        }
        
        int numOfIslands = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    numOfIslands += getNumberOfIslands(grid,i,j);
                }
            }
        }
        
        return numOfIslands;
        
    }
    
    public int getNumberOfIslands(char[][] grid, int i, int j) {
        
        while(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        
        grid[i][j] = '0';
        getNumberOfIslands(grid, i, j +1);
            getNumberOfIslands(grid, i, j - 1);
            getNumberOfIslands(grid, i + 1, j);
            getNumberOfIslands(grid, i - 1, j);
        return 1;
    }
}