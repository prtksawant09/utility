package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

public class IntervalSearch implements SearchInterface {

    @Override
    public int search(int[] searchArray, int n) throws ItemNotFoundException {
        int start = 0;
        int end = searchArray.length-1;
        int mid;

        while(start<end) {
            if((end-start)==1) {
                if(searchArray[end]==n) {
                    return end;
                } else if (searchArray[start]==n) {
                    return start;
                } else {
                    break;
                }
            }
            mid = (end+start)/2;
            if(searchArray[mid]==n) {
                return mid;
            } else if (searchArray[mid]>n) {
                end = mid;
            } else if (searchArray[mid]<n) {
                start = mid;
            }
        }
        throw new ItemNotFoundException(n);
    }
}
