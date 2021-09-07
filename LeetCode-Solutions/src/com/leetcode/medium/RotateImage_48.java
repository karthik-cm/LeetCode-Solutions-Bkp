package com.leetcode.medium;

public class RotateImage_48 {

	public static void main(String[] args) {
		
	}
	
	
	public void rotate(int[][] matrix) {
        transpose(matrix);
		reflect(matrix);
    }
    
    private void transpose(int [][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	private void reflect(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n; i++) {
			int row[] = matrix[i];
			
			int left = 0;
			int right = n-1;
			
			while(left <= right) {
				int temp = row[left];
				row[left] = row[right];
				row[right] = temp;
				
				left++;
				right--;
			}
		}
	}

}
