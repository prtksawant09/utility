package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

public class LinearSearch implements SearchInterface{
    public int search(int[] searchArray, int n) throws ItemNotFoundException {
        for(int i=0; i<searchArray.length; i++ ) {
            if(searchArray[i]==n)
                return i;
        }
        throw new ItemNotFoundException(n);
    }
}
