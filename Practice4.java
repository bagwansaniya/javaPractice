package javaPractice;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
// Define a program to find out whether a given number is even or odd.
// Write a program to print the sum of two numbers entered by user by defining your own method.
// Define a method to find out if a number is prime or not.
// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 
// Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1
// Write a function to find if a number is a palindrome or not. Take number as parameter.
// Write a function that returns all prime numbers between two given numbers.
// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //-------------------------------------------------------------------------------
        //sum of first n natural numbers
        //  int n;
        //  System.out.println("Enter number : ");
        //  n=sc.nextInt();
        //  sum(n);

        //-------------------------------------------------------------------------------
        //prime no
        // int a,b;
        // System.out.println("Enter number : ");
        // a=sc.nextInt();
        // isPrime(a);

        //-------------------------------------------------------------------------------
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        // int a,b,c;
        // System.out.println("Enter 3 numbers : ");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // c=sc.nextInt();
        // isGreater(a, b, c);
        // isSmaller(a,b,c);

        //-----------------------------------------------------------------------------------
        // Define a program to find out whether a given number is even or odd.
        // int num;
        // System.out.println("Enter number : ");
        // num=sc.nextInt();
        // isEven(num);
     
        //----------------------------------------------------------------------------------------
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        // int a,b;
        // System.out.println("Enter two numbers :");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // System.out.println("Sum is : "+sum(a,b));

        //-----------------------------------------------------------------------------------------
        // Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        // Marks        Grade 
        // 91-100         AA 
        // 81-90          AB 
        // 71-80          BB 
        // 61-70          BC 
        // <=40          Fail 
        // float marks;
        // System.out.println("Enter Marks (out of 100) : ");
        // marks=sc.nextFloat();
        // displayGrade(marks);

        //-----------------------------------------------------------------------------------------
        // Write a program to print the factorial of a number by defining a method named 'Factorial'.
        // Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        // 4! = 1 * 2 * 3 * 4 = 24 
        // 3! = 3 * 2 * 1 = 6 
        // 2! = 2 * 1 = 2 
        // Also, 
        // 1! = 1 
        // 0! = 1
        // int n;
        // System.out.println("Enter number :");
        // n=sc.nextInt();
        // System.out.println("Factorial of given number is "+ printFact(n));

        //----------------------------------------------------------------------------------
        // Write a function to find if a number is a palindrome or not. Take number as parameter.
        // int num;
        // System.out.println("Enter number : ");
        // num=sc.nextInt();
        // isPalindrome(num);

        //------------------------------------------------------------------------------------
        // Write a function that returns all prime numbers between two given numbers.
        int s,e;
        System.out.println("Enter range to print Prime numbers InBetween : ");
        s=sc.nextInt();
        e=sc.nextInt();
        printPrimes(s,e);

}  
public static void printPrimes(int s, int e) {
    // Check for invalid inputs
    if (s < 0 || e < 0 || s > e) {
        System.out.println("Invalid input: s and e should be non-negative integers with s <= e");
        return;
    }

    // Iterate through numbers from s to e
    for (int i = s; i <= e; i++) {
        boolean isPrime = true;

        // Check for divisibility only up to the square root of i
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        // Print i if it's prime
        if (isPrime) {
            System.out.println(i);
        }
    }
}
public static void isPalindrome(int num){
    int n=num;
    int rn=0,l;
    while (num!=0) {
        l=num%10;
        rn=rn*10+l;
        num=num/10;
      
    }
    System.out.println(rn);
    if (rn==n) {
        System.out.println("palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}
public static int printFact(int n){
    int i,f=1;
    if (n==0) {
        return 1;
    }
    for(i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}
public static void displayGrade(float m){
    if (m>=91&& m<=100) {
        System.out.println("AA "+ m);
    }
    else if (m>=81 && m<=90) {
        System.out.println("AB "+m);
    }
    else if (m>=71 && m<=80) {
        System.out.println("BB "+m);
    }
    else if (m>=41 && m<=70) {
        System.out.println(" BC "+m);
    }
    else if (m<=40) {
        System.out.println("fail .....");
    }
}
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public static void isGreater(int a,int b,int c){
    if (a>b && a>c) {
        System.out.println("Greater number is : "+a);
    }
    else if (b>a && b>c) {
        System.out.println("Greater number is : "+b);
    }
    else{
        System.out.println("Greater number is : "+c);
    }

}
public static void isSmaller(int a,int b,int c){
    if (a<b && a<c) {
        System.out.println("Greater number is : "+a);
    }
    else if (b<a && b<c) {
        System.out.println("Greater number is : "+b);
    }
    else{
        System.out.println("Greater number is : "+c);
    }
}
public static int sum(int a,int b){
    return a+b;
}
public static void isEven(int num){
    if (num%2==0) {
        System.out.println("even number it is "+num);
    }
    else{
        System.out.println("Odd number it is "+num);
    }
}
public static void sum(int n){
    int i,s=0;
    for(i=0;i<n;i++){
        s=s+i;
    }
    System.out.println("sum is : "+s);
}
public static void isPrime(int a){
  int i,c=0;
  for(i=2;i<a;i++){
    if (a%i==0) {
        c++;
        break;
    }
  }
  if (c==0) {
    System.out.println("Prime number it is : "+a);
  }
  else{
    System.out.println("Not a Prime number :");
  }
}
}
