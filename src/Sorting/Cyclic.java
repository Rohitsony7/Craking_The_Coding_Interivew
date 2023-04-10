package Sorting;

import java.util.Arrays;

public class Cyclic {

    public static void main(String[] args) {

        int [] arr = {0,6,7,4,2,8,1,3,9,5};
        int i =0;
        while(i < arr.length){

            if(arr[i] != i) {
                swap(arr, i, arr[i]);
            }
            else{
                i++;
            }

    }
        System.out.println(">>>" + Arrays.toString(arr));
}

    private static void swap(int[] arr, int i, int j) {

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    }
