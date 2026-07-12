class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        int left=0, right=row*column-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int r=mid/column;
            int c=mid%column;
            if(matrix[r][c]==target)
                return true;
            else if(matrix[r][c]>target)
                right--;
            else
                left++;
        }
        return false;
    }
}
