class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=row-1;i>-1;i--)
        {
            if(matrix[i][0]>target)
                continue;
            if(matrix[i][column-1]< target)
                return false;
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==target)
                    return true;
            }
            break;
        }
        return false;
    }
}
