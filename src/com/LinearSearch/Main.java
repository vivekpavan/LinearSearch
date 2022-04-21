package com.LinearSearch;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {3,4,2,5,7,9,0};
        var linearsearch = new LinearSearch();
        var number = linearsearch.LinearSearch(numbers,1);
        System.out.println(number);
    }
}
