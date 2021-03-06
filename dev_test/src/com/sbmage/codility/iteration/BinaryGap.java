package com.sbmage.codility.iteration;

/** 
 * 
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }


that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

•N is an integer within the range [1..2,147,483,647].

Complexity:

•expected worst-case time complexity is O(log(N));
•expected worst-case space complexity is O(1).
 */
public class BinaryGap {

	public int solution(int n){
		
		String num = Integer.toBinaryString(n); //이진수로 변환하여 문자열로 
		System.out.println(num);
		int count = 0;
		int maxGap = 0;
		
		for(int i=0; i < num.length(); i++){
			if (num.charAt(i) == '1'){ //1일 경우에는 리셋을 하는데
				if (count > maxGap){ 
					maxGap = count; //현재가 맥스보다 클 경우 스왑
					count = 0; //하고 초기화
				} else {
					count = 0;
				}
			} else {
				count++; //0일 경우 증가
			}
		}
		return maxGap;
	}
	
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(16));
	}
	
}
