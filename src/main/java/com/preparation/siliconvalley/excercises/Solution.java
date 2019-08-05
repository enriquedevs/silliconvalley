package com.preparation.siliconvalley.excercises;
import java.util.ArrayList;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
/*	ArrayList<Integer> IDsOfSongs(int rideDuration, 
	                              ArrayList<Integer> songDurations)
	{
		// WRITE YOUR CODE HERE
		List<List<Integer>> songPairs = new ArrayList<>();
		
		Map<Integer, List<Integer>> passedDurations = new TreeMap<>();
		
		for(int i = 0; i < songDurations.length; i++) {
		    int currentDuration = songDurations[i];
		    ArrayList matchedIndexElements = passedElements.get(target - currentDuration);
		    if (matchedIndexElements != null) {
		        for (int matchedIdx: matchedIndexElements) {
		            songPairs.add(Arrays.asList(matchedIdx, i));
		        }
		    }
		    indexValues = passedElements.get(currentDuration);
		    if (indexValues != null) {
		        indexValues.add(i);
		    } else {
		        indexValues = Arrays.asList(i);
		    }
		    passedElements.put(currentDuration, indexValues);
		}
		
		if (songPairs.length == 1) {
		    return songPairs.get(0);
		} else {
		    for (int duration: passedDurations.descendingKeySet()){
		        indexes = passedDurations.get(duration);
		        for(int idx: indexes) {
 		        for(List<Integer> songPair: songPairs) {
 		            for (int songPairIdx: songPair) {
 		                if(idx == songPairIds)
 		                    return songPair;
 		            }
 		        }
		        }
		    }
		}
		return null;
	}
*/
	// METHOD SIGNATURE ENDS
}