package edu.pratik.searching;

import edu.pratik.searching.exception.ItemNotFoundException;

import java.util.Scanner;

public class SearchRunner {
    final static int [] searchArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20};
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        n=scanner.nextInt();

        SearchInterface si;

        try {
            si = new LinearSearch();
            System.out.println("Item present at index: "+si.search(searchArray, n));
        } catch (ItemNotFoundException e) {
            System.out.println("Sequential Search: ");
            e.printErrorMessage();
        }
        try {
            si = new IntervalSearch();
            System.out.println("Item present at index: " + si.search(searchArray, n));
        } catch (ItemNotFoundException e) {
            System.out.println("Binary Search: ");
            e.printErrorMessage();
        }

    }
}
