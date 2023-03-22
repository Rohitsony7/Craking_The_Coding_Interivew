package Demo;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int arr[] = {1,2,3,3,3,4,5,5,6,7,8,9,9,10, 12, 243, 55, 55, 7, 89, 0, 0};

        findTotalUniqueNoArr(arr);
        System.out.println(Arrays.toString( findTotalUniqueNoArr(arr)));


    }



    private static int[] findTotalUniqueNoArr(int[] arr) {



        int max = findMaxDigit(arr);

        int count = 0;

        boolean isExsits[] = new boolean[max+1];

        for (int i = 0; i < arr.length; i++) {

            isExsits[arr[i]] =true;

        }

//        System.out.println(Arrays.toString(isExsits));



        int res[] = new int[count];

        int resCount=0;
        for (int i = 0; i < isExsits.length; i++) {

         if(isExsits[i])  res[resCount++] = i;

        }


        return res;

    }

    private static int findMaxDigit(int[] arr) {

        int max =0;
        for (int i = 0; i < arr.length ; i++) {

            max = Math.max(max, arr[i]);

        }

        return max;
    }


}



//int arr[] = {1,2,3,3,3,4,5,5,6,7,8,9,9,10, 12, 243, 55, 55, 7, 89, 0, 0};
/// {1 : 1, 2:1, 3:3, 4:1, 5:2, 6:1, 7:2, 8:1, 9:2, 10:1, 12:1, 243:1, 55:2, 89:1, 0:2 }