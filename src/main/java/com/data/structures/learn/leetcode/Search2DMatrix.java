package com.data.structures.learn.leetcode;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        if (rowLength == 1 && columnLength == 1) {
            return matrix[0][0] == target;
        }

        for (int i = 0; i < rowLength; i++) {
            if (target < matrix[i][0] || target > matrix[i][columnLength - 1]) {
                continue; // Skip rows that cannot contain the target
            }
            int start = 0;
            int end = columnLength - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3}
        };
        int target = 3;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found in matrix: " + result);
    }

}
