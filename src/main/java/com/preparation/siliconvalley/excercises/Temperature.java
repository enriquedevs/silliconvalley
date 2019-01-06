package com.preparation.siliconvalley.excercises;

public class Temperature {
	static class Solution {
	    public int solution(int[] T) {
	    	if (T != null && T.length > 0) {
	    		final int yearLength = T.length;
	    		switch(yearLength) {
		        	case 1: return 1;
		        	default: return Math.round(yearLength / 2) + 1;
		        }
	    	}
	        
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution(null));
		System.out.println(s.solution(new int[] {}));
		System.out.println(s.solution(new int[] {1}));
		System.out.println(s.solution(new int[] {1,2}));
		System.out.println(s.solution(new int[] {1,2,3}));
		System.out.println(s.solution(new int[] {1,2,3,4}));
		System.out.println(s.solution(new int[] {1,2,3,4,5}));
		System.out.println(s.solution(new int[] {1,2,3,4,5,6}));
	}
}
