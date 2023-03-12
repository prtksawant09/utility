package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

import java.util.Scanner;

public class SearchRunner {
    final static Integer [] searchArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    public static void main(String args[]) {
        Integer n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        n=scanner.nextInt();

        try {
            SearchInterface si = new LinearSearch();
            System.out.println("Item present at index: "+si.search(searchArray, n));
        } catch (ItemNotFoundException e) {
            e.printErrorMessage();
        }

    }
}
