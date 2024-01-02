package javaPractice;

import java.math.*;
import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
// Take name as input and print a greeting message for that particular name.
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// Take 2 numbers as input and print the largest number.
// Input currency in rupees and output in USD.
// To calculate Fibonacci Series up to n numbers.
// To find out whether the given String is Palindrome or not.
// To find Armstrong Number between two given number.
//Take integer inputs till the user enters 0 and print the largest number from all.

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //---------------------------------------------------------------------------------------------------
        // Write a program to print whether a number is even or odd, also take input from the user.
        // int n;
        // System.out.println("Enter number:");
        // n=sc.nextInt();
        // if (n%2==0) {
        //     System.out.println("even no. it is"+ n);
        // }
        // else{
        //     System.out.println("odd no. it is"+ n);
        // }

        //---------------------------------------------------------------------------------------------------
        // Take name as input and print a greeting message for that particular name.

        String name;
        System.out.println("Enter your name please:");
        name=sc.nextLine();
        System.out.println("Heyy Good morning seems good to see you again "+name+ " Have a great day dear!!");
   
        //----------------------------------------------------------------------------------------------------
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        // float p,r;
        // int n;
        // System.out.println("enter Principle, Rate of interest and no. of years");
        // p=sc.nextFloat();
        // r=sc.nextFloat();
        // n=sc.nextInt();
        // float i=(p*r*n)/100;
        // System.out.println("Simple Interest : "+i);

        //------------------------------------------------------------------------------------------------------
        // Take 2 numbers as input and print the largest number.

        // int a,b;
        // System.out.println("Enter 2 numbers:");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // if (a>b) {
        //     System.out.println("Greater number is: "+a);
        // }
        // else{
        //     System.out.println("Greater number is: "+b);
        // }

        //---------------------------------------------------------------------------------------------------------
        // Input currency in rupees and output in USD.

        // float rs,d;
        // System.out.println("Enter Rupeess: ");
        // rs=sc.nextFloat();
        // d=rs/64;
        // System.out.println("this Much Dollers : "+d);

        //----------------------------------------------------------------------------------------------------------
        // To calculate Fibonacci Series up to n numbers.
        // int i,n,sum=0,a=0,b=1;
        // System.out.println("Enter the no. up to which you want to print fibonacci series :");
        // n=sc.nextInt();
        // System.out.println(a);
        // System.out.println(b);
        // for(i=0;i<n;i++){
        //     sum=a+b;
        //     System.out.println(sum);
        //     a=b;
        //     b=sum;
        // }
        
        //-----------------------------------------------------------------------------------------------------------
        // To find out whether the given String is Palindrome or not.
        // String str,nstr="";
        // char c;
        // System.out.println("Enter a String :");
        // str=sc.nextLine();
        // for(int i=0; i<str.length(); i++){
        //     c=str.charAt(i);
        //     nstr=c+nstr;
        // }
        // System.out.println("New String is:"+nstr);
        // if (str.equals(nstr)) {
        //     System.out.println("palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }

        //-----------------------------------------------------------------------------------------------------------
        // To find Armstrong Number between two given number.
        //do it again..!
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // int originalNum = num;
        // int result = 0;
        // int count = 0;

        // while (originalNum != 0) {
        //     originalNum /= 10;
        //     count++;
        // }

        // originalNum = num;

        // while (originalNum != 0) {
        //     int remainder = originalNum % 10;
        //     result += Math.pow(remainder, count);
        //     originalNum /= 10;
        // }

        // if (result == num) {
        //     System.out.println(num + " is an Armstrong number.");
        // } else {
        //     System.out.println(num + " is not an Armstrong number.");
        // }

        //----------------------------------------------------------------------------------------------------------------
        //Take integer inputs till the user enters 0 and print the largest number from all.
        // int n,a=0;
        // System.out.println("Enter numberss!!");
        // do {
        //   n=sc.nextInt();
        //   if(n>a){
        //     a=n;
        //   }  

        // } while (n!=0);
        // System.out.println(a);



   
    }
    
}
