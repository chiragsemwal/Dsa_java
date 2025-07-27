package Patterns;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
//        System.out.println(count);
        for(int i = 0; i<=count; i++){
            System.out.println(" ");

            for (int j = 0; j<=count; j++){
                System.out.println("*");
            }
        }
    }
}
