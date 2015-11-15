/*
Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]

 NOTE : k is 0 based. k = 0, corresponds to the row [1]. 
*/

public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<ArrayList<Integer>> allLists = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> addRow = new ArrayList<Integer>();
	    
	    if (a == 0){
	        addRow.add(1);
	        return addRow;
	    }
	    
	    if (a >= 1){
	        addRow.add(1);
	        addRow.add(1);
	        allLists.add(addRow);
	        if (a == 1){
	            return addRow;
	        }
	    }
	    
	    for (int i = 1; i < a; i++){
	        ArrayList<Integer> temporary = new ArrayList<Integer>();
	        temporary.add(1);
	        for (int j = 1; j < allLists.get(i-1).size(); j++){
	            temporary.add(allLists.get(i-1).get(j-1) + allLists.get(i-1).get(j)); 
	        }
	        temporary.add(1);
	        allLists.add(temporary);
	    }
	    return allLists.get(a - 1);
	}
}