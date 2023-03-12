package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

import java.util.Scanner;

public class LinearSearch implements SearchInterface{
    public Integer search(Integer[] searchArray, Integer n) throws ItemNotFoundException {
        for(Integer i=0; i<searchArray.length; i++ ) {
            if(searchArray[i]==n)
                return i;
        }
        throw new ItemNotFoundException("Element "+n+" not found in array");
    }


}
