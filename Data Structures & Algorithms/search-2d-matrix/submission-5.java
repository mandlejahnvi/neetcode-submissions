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
            int left=0, right=column-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
                if(matrix[i][mid]==target)
                    return true;
                else if(matrix[i][mid]>target)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            break;
        }
        return false;
    }
}
