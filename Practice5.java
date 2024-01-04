package javaPractice;

import java.util.Scanner;
import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //----------------------------------------------------------------------------------------------
        //sum of all elements in array
        // int[] arr;
        // arr=new int[5];
        // int sum=0;
        // int num;
        // System.out.println("enter array element : ");
        // for(int i=0;i<5;i++){
        //     num=sc.nextInt();
        //     arr[i]=num;
        // }
        // for (int i : arr) {
        //     sum=sum+i;
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("sum of each element : "+sum);

        //----------------------------------------------------------------------------------------------
        //largest number in array
    //     int n,e,g=0;
    //     System.out.println("Enter number of elements do you want to enter in an array : ");
    //     n=sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("Enter Elements : ");
    //     for(int i=0;i<n;i++){
    //         e=sc.nextInt();
    //         arr[i]=e;
    //     }
    //    for(int i=0;i<n;i++){
    //         if(g<arr[i]){
    //             g=arr[i];
    //         }
    //    }
    //    System.out.println("Largest array element is : "+g);

    //-------------------------------------------------------------------------------------------
    //search given element in array 
        // int n,e,s;
        // System.out.println("Enter number of elements do you want to enter in an array : ");
        // n=sc.nextInt();
        // int arr[]=new int[n];
        // System.out.println("Enter Elements : ");
        // for(int i=0;i<n;i++){
        //     e=sc.nextInt();
        //     arr[i]=e;
        // }
        // System.out.println("Enter element to search : ");
        // s=sc.nextInt();
        // for (int i : arr) {
        //     if (i==s) {
        //         System.out.println("Element is present :"+i);
        //     }
        //     else{
        //         System.out.println("Element is not present..!");
        //     }
        // }

       
        //-----------------------------------------------------------------------------------------
        //find last occurance of element in array
        int n,e,s;
        System.out.println("Enter number of elements do you want to enter in an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            e=sc.nextInt();
            arr[i]=e;
        }
        // System.out.println("Enter element whoes Last occurance you want : ");
        // s=sc.nextInt();
        // LastOccurance(arr, s);

        //-----------------------------------------------------------------------------------------------
        //number of time element in array is repeated or count of element in array
        // System.out.println("Enter element whoes count you want : ");
        // s=sc.nextInt();
        // CountOfOccurances(arr, s);

        //-------------------------------------------------------------------------------------
        //Print numbers which are strictly greater than given number
        // System.out.println("Enter the number :");
        // s=sc.nextInt();
        // GreaterNum(arr,s);
        //isSorted(arr);
        
        //-----------------------------------------------------------------------------------------------
        //return array containing sorted array ascending array and decemding array
        // int aArr[]=ascArray(arr);
        // decArray(arr);
        // PrintArray(aArr);
        
       


    }
    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] ascArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("smallest element is: "+arr[0]);
        return arr;
    }
    public static void decArray(int[] arr){
        Arrays.sort(arr);
        
        System.out.println("Largest element is: "+arr[arr.length-1]);
        
        
    }
    public static void isSorted(int[] arr){
        int c=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]) {
                c++;
                break;
            }
        }
        if (c==0) {
            System.out.println("Array is Sorted : ");
        }
        else{
            System.out.println("array is Not Sorted : ");
        }

    }
    public static void GreaterNum(int[] arr,int s){
        System.out.println("Numbers Greater than "+s+" are : ");
        for(int i=0;i<arr.length;i++){
            if (arr[i]>s) {
                System.out.println(arr[i]);
            }
          
        }
    }
    public static void CountOfOccurances(int[] arr,int s){
        int c=0;
         for (int i : arr) {
            if (i==s) {
                c++;
            }
        }
        System.out.println("count of element "+s +"is : "+c);

    }
    public static void LastOccurance(int[] arr,int s){
        int c=0;
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]==s) {
                c++;
                System.out.println("Last occurance of element "+s+" is at : "+i);
                break;
            }
            else{
                break;
            }
            
        }
        if (c==0) {
            System.out.println("Element not Present");
        }
    }
}
