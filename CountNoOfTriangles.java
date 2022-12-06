// Given an unsorted array of positive integers, find the number of triangles 
// that can be formed with three different array elements as three sides of triangles. 
// For a triangle to be possible from 3 values, the sum of any of the two values 
// (or sides) must be greater than the third value (or third side). 
// Input: arr= {4, 6, 3, 7}
// Output: 3
// Explanation: There are three triangles 
// possible {3, 4, 6}, {4, 6, 7} and {3, 6, 7}. 
// Note that {3, 4, 7} is not a possible triangle.  

// Input: arr= {10, 21, 22, 100, 101, 200, 300}.
// Output: 6
// Explanation: There can be 6 possible triangles:
// {10, 21, 22}, {21, 100, 101}, {22, 100, 101}, 
// {10, 100, 101}, {100, 101, 200} and {101, 200, 300}

import java.util.*;

class CountNoOfTriangles {
	static void CountTriangles(int[] A) {
		int n = A.length;

		Arrays.sort(A);

		int count = 0;

		for (int i = n - 1; i >= 1; i--) {
			int l = 0, r = i - 1;
			while (l < r) {
				if (A[l] + A[r] > A[i]) {
					count += r - l;
          r--;
				}
				else {
					l++;
				}
			}
		}
		System.out.print("No of possible solutions: "+ count);
	}

	// Driver Code
	public static void main(String[] args) {
		int[] A = { 10, 21, 22, 100, 101, 200, 300 };
		CountTriangles(A);
	}
}