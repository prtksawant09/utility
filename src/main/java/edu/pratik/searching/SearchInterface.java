package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

import java.util.Scanner;

public interface SearchInterface {
    public Integer search(Integer[] searchArray, Integer n) throws ItemNotFoundException;
}
