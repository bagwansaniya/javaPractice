package javaPractice;

import java.util.Scanner;

// Sum Of A Digits Of Number
// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //--------------------------------------------------------------------------------------------------------------
        // Sum Of A Digits Of Number
        // int n,sum=0,d;
        // System.out.println("Enter a number :");
        // n=sc.nextInt();
        // while (n!=0) {
        //     d=n%10;
        //     sum=d+sum;
        //     n=n/10;
        // }
        // System.out.println("sum of digits is : "+sum);
        
        // //------------------------------------------------------------------------------------------------------------------
        // // Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        // int i,c=0;
        // for(i=0;i<31;i++){
        //     if (i%2==0) {
        //         c++;
        //     }
        // }
        // System.out.println("number of days we can o out is : "+c);

        //----------------------------------------------------------------------------------------------------------------------------
        // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        int num,negSum=0,evSum=0,odSum=0;
        System.out.println("Enter numbers: ");
        do {
            num=sc.nextInt();
            if(num<0){
                negSum=num+negSum;
            }
            else if (num%2==0) {
                evSum=num+evSum;
            } else {
                odSum=num+odSum;
            }
        } while (num!=0);
        System.out.println("Sum of Negative numbers: "+negSum +" Sum of Even numbers : "+evSum +" Sum of Odd numbers : "+odSum);
    }
    
}
