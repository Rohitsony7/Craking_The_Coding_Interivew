package BinarySearchAlgoNQn;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50, 60, 70,  80, 90 , 100}; // this array is sorted so now we can apply BS

        System.out.println(searchNumber(arr,7 ));

    }

    public static int searchNumber(int arr[], int target){


        int start=0;
        int end = arr.length-1;

        while(start <= end){

            int mid = (start + end)/2;

            if(arr[mid] ==target) return  mid;
            else if(arr[mid] < target) start = mid+1;
            else end = mid-1;

        }

        return -1;
    }


}