
public class solution {
    public boolean SearchMatrix(int[][] matrix, int target){
        int n  = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = n * m - 1;

        while(left <= right){
            int mid  = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[0][2] = 4;
        matrix[1][0] = 6;
        matrix[1][1] = 8;
        matrix[1][2] = 9;

        int target = 4;

        System.out.print("solution is : ");

        solution obj = new solution();

        boolean result = obj.SearchMatrix(matrix, target);
        
        System.out.print(result);

     }
}
