package com.preparation.siliconvalley.excercises;

public class MatrixCountries {
	static class Solution {
		
	    public int solution(int[][] A) {
	    	if (A != null) {
	    		// visitedValues is an array to determine the coordinates already visited
	    		boolean[][] visitedValues = new boolean[A.length][A[0].length];
	    		// number of countries to return
	    		int numberOfCountries = 0;
	    		
	    		// iteration of the two dimensional array A
	    		for (int x = 0; x < A.length; x++) {
	    		    for (int y = 0; y < A[x].length; y++) {
	    		    	
	    		    	// if the current coordinate was not visited then enters
	    		        if (!visitedValues[x][y])  {
	    		        	// increase by one the number of countries visited
	    		        	numberOfCountries++;
	    		        	// mark as visited all the coordinates that belong to the current country
	    		        	iterateCountry(A, visitedValues, A[x][y], x, y);
	    		        }
	    		    }
	    		}
	    		return numberOfCountries;
	    	}
	    	
	    	// if array is null return 0
	        return 0;
	    }
	    
	    /**
	     * Method that iterates to east, south, west and north the A array looking for
	     * current country value on the x and y coordinates and if so then marks as 
	     * visited the coordinate on the visitedValues array
	     * 
	     * @param A = Array of values from the solution method
	     * @param visitedValues = Visited value flags for each coordinate
	     * @param countryValue = Country value looking to iterate
	     * @param x = current X coordinate
	     * @param y = current Y coordinate
	     */
	    private void iterateCountry(int[][] A, boolean[][] visitedValues, int countryValue, int x, int y) {
	    	// mark as visited the current coordinate
	    	visitedValues[x][y] = true;
	    	
	    	// move to the east
	    	if (A.length > (x+1) && !visitedValues[x+1][y] && A[x+1][y] == countryValue) {
	    		iterateCountry(A, visitedValues, countryValue, x+1, y);
	    	}
	    	
	    	// move to the south
	    	if (A[x].length > (y+1) && !visitedValues[x][y+1] && A[x][y+1] == countryValue) {
	    		iterateCountry(A, visitedValues, countryValue, x, y+1);
	    	}
	    	
	    	// move to the west
	    	if ((x-1) > -1 && !visitedValues[x-1][y] && A[x-1][y] == countryValue) {
	    		iterateCountry(A, visitedValues, countryValue, x-1, y);
	    	}
	    	
	    	// move to the north
	    	if ((y-1) > -1 && !visitedValues[x][y-1] && A[x][y-1] == countryValue) {
	    		iterateCountry(A, visitedValues, countryValue, x, y-1);
	    	}
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int A[][] = new int[][] {
				{5,4,4},
				{4,3,4},
				{3,2,4},
				{2,2,2},
				{3,3,4},
				{1,4,4},
				{4,1,1}
		};
		
		System.out.println(s.solution(A));
	}
}
