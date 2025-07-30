package Arrays;

import java.util.Arrays;
//
//public class EvenNumberOfDigit {
//    public static void main(String[] args) {
//        int[] myArray = {12,43,1,456,23};
//
////        System.out.println(numCount(131231));
////        System.out.println(findEven(myArray));
//        System.out.println(findEvenDigit(myArray));
//    }
////    static int findEven(int[] arr){
////        int count = 0;
////        for (int i = 0; i < arr.length; i++){
////            int digit = numCount(i);
////            if(digit % 2 == 0){
////                count ++;
////            }
////
////        }
////        return count;
////    }
//
//    static int numCount(int num){
//        int count = 0;
//        while (num > 0){
//            count ++;
//            num = num/10;
//        }
//        return count;
//    }
//
//
//    // TODO: 29/07/25 function to find num of even digits in an array
//    static int findEvenDigit(int[] arr){
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//            int digitCount  = countNum(arr[i]);
//            if (digitCount % 2 == 0){
//                count ++;
//            }
//        }
//        return count;
//    }
//
//    static int countNum(int num){
//        int count = 0;
//        while(num > 0){
//            count ++;
//            num = num / 10;
//        }
//        return count;
//    }
//}
class EvenNumberOfDigit{
    public static void main(String[] args) {
        int[] myArray = {12,44,1124,54,1,23232,4};
        System.out.println(findEvenInArray(myArray));
    }

    static int findDigitInNum(int num){
        int count = 0;
        while(num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }

    static int findEvenInArray(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int digit = findDigitInNum(arr[i]);
            if (digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
}