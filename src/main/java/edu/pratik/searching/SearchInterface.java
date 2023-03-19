package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

import java.util.Scanner;

public interface SearchInterface {
    public int search(int[] searchArray, int n) throws ItemNotFoundException;
}
