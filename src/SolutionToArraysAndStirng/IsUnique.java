package SolutionToArraysAndStirng;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(isUnique(a));


        }

        // O(n)

        public static boolean isUnique(@NotNull String a){

            boolean[]  arr = new boolean[128];

            for (int i = 0; i < a.length(); i++) {

                int charAscii = (int)a.charAt(i);

                if(arr[charAscii]) return false;
                else arr[charAscii] = true;
        }
            return true;
    }

}

// other way, sort both of the array, check the size (return false if !equal), s1.equals(s2)
