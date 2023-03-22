package Demo;

//6
// 110
//   1
// ..0

class HelloWorld {
    public static void main(String args[]) {
                        //0 1 2 3 4 5 6 7 8 9 10 11 12 13
        int arr[] = {12,34,1,12,4,5,6,566,5,45,3,6,67,7};

        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            if(i %2 ==1){
                sum = sum+arr[i];
            }

        }

        System.out.println(sum);





    }

}
