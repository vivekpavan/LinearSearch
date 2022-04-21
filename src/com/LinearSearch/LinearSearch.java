package com.LinearSearch;

public class LinearSearch {
    public int LinearSearch(int[] array,int number){
        for(var i = 0;i < array.length;i++){
            if(array[i] == number)
                return i;
        }
        return -1;
    }
}
