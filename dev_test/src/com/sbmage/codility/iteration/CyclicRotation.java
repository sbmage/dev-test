package com.sbmage.codility.iteration;

/**
 * A zero-indexed array A consisting of N integers is given. 
 * Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, 
each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }


that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

•N and K are integers within the range [0..100];
•each element of array A is an integer within the range [−1,000..1,000].

 * @author home
 *
 */
public class CyclicRotation {
	
	public int[] solution(int[] A, int K) {
		
		if (A.length == 0)
			return A;
     
//		int[] temp = new int[A.length];
		for (int i = 0; i < K; i++) {
			rightRotation(A, A.length);
		}
		return A;
    }
	
	public void rightRotation(int[] arr, int length){
		int tmp = arr[length-1];
		for (int i = length-2; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = tmp;
	}
	
	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		int[] temp = {3, 8, 9, 7, 6};
		System.out.println(cr.solution(temp, 3).toString());
	}
}
