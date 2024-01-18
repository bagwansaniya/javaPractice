import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,e;
        System.out.println("Enter number of elements do you want to enter in an array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            e=sc.nextInt();
            arr[i]=e;
        }

        //-----------------------------------------------------------------------------------------
        //Find pairs of elements from array whoes sum is equal to given number
        // int sum;
        // System.out.println("Enter Sum : ");
        // sum=sc.nextInt();
        // FindPairs(arr,sum);

        //-----------------------------------------------------------------------------------------
        //find the unique element in array were others are repeating twice
        // System.err.println("unique element is: ");
        // uniqueNum(arr); 

        //-----------------------------------------------------------------------------------------
        //find second largest element in array
        // int l=SecLargest(arr);
        // System.out.println("Second Largest element is: "+l);

        //------------------------------------------------------------------------------------------
        //return the first repeating value in array
        //FirstRepeating(arr);

        //---------------------------------------------------------------------------------------------
        //swap two numbers
        // int a,b;
        // System.out.println("Enter two numbers : ");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // //with temp variable
        // swap(a,b);
        // //without temp variable
        // nswap(a,b);

        //--------------------------------------------------------------------------------------------
        //create new array with contains reverse array elemenets
        // System.out.println("new array with rev element is : ");
        // revarray(arr);

        //------------------------------------------------------------------------------------
        //rotate array with z index 
        // int z;
        // System.out.println("Enter the index from which you want to rotate array : ");
        // z=sc.nextInt();
        // rotateArr(arr,z);

        //------------------------------------------------------------------------------------------
        //search number in array at given number of time

        // int num,s;
        // System.out.println("enter the no of time you want to search number : ");
        // s=sc.nextInt();
        // System.out.println("enter the element which you want to search : ");
        // do {
        //     num=sc.nextInt();
        //     searchNum(arr,num);
        //     s--;
        // } while (s!=0);

        //----------------------------------------------------------------------------------------
        //sort binary array without inbuilt function
        // System.out.println("sorted binary array is : ");
        // sortb(arr);

        //-----------------------------------------------------------------------------------
        //sort array using only one loop
        // System.out.println("sorted binary array is : ");
        // sortA(arr);

        //------------------------------------------------------------------------------------
        //sort array in such a way put even numbers first follwed by odd ones
        // System.out.println("Sorted array elements as per given condition are : ");
        // sortN(arr);

        //---------------------------------------------------------------------------------------
        //A Non-decresing order array is given we have to print squares 
        //of each element in non decresing order. Note:negtive number allowed!
        // System.out.println("array elements are : ");
        // sortC(arr); 

        //------------------------------------------------------------------------------------------
        //print an arry which returns prefix sum of each element
        System.out.println("presix sum array is : ");
        prearray(arr);



    }
    public static void prearray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
            
        }
        PrintArray(arr);
    }
    public static void sortC(int[] arr){
        int i=0;
        int j=arr.length-1;
        int narr[]=new int[arr.length];
        int p=0;
        while (i<=j) {
            if (Math.abs(arr[i])>Math.abs(arr[j])) {
                narr[p++]=arr[i]*arr[i];
                i++;
            }
            else{
                narr[p++]=arr[j]*arr[j];
                j--;
            }
        }
        PrintArray(narr);
        

    }
    
    public static void sortN(int[] arr){
        int j=arr.length-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
            
                if (arr[k]%2!=0&&arr[j]%2==0) {
                    int t=arr[k];
                    arr[k]=arr[j];
                    arr[j]=t;
                    j--;
                    k++;
                }
                else if (arr[k]%2==0) {
                    k++;
                }
                else if (arr[j]%2!=0) {
                    j--;
                }
                if (k>j) {
                    break;
                }
            
        }
        PrintArray(arr);
    }
    public static void sortA(int[] arr){
        int j=arr.length-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
            
                if (arr[k]==1&&arr[j]==0) {
                    int t=arr[k];
                    arr[k]=arr[j];
                    arr[j]=t;
                    j--;
                    k++;
                }
                else if (arr[k]==0) {
                    k++;
                }
                else if (arr[j]==1) {
                    j--;
                }
                if (k>j) {
                    break;
                }
            
        }
        PrintArray(arr);
    }
    public static void sortb(int[] arr){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) {
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1) {
                System.out.println(arr[i]);
            }
        }
       
    }
    public static void searchNum(int[] arr,int num){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num) {
                flag=1;
                System.out.println("Number is found at "+i+"th location on array");
                break;
            }
        }
        if (flag==0) {
            System.out.println("number not found in given array");
        }
    }
    public static void rotateArr(int[] arr,int z){
        int n=arr.length;
        z=z%n;
        int narr[]=new int[n];
        int j=0;
        //in this way we use nex extra array element to rotate
        for(int i=z-1;i<n;i++){
            narr[j++]=arr[i];
        }
        for(int i=0;i<z-1;i++){
            narr[j++]=arr[i];
        }
        System.out.println("Rotated array is :");
        PrintArray(narr);
        //without using extra array space
        System.out.println("without new array element :");
         for(int i=z-1;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<z-1;i++){
            System.out.println(arr[i]);
        }


    }
    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void revarray(int[] arr){
        int narr[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
        
            narr[j]=arr[i];
            j++;
            
        }
       PrintArray(narr);
    }
    public static void nswap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped values without temp are : a = "+a+" b = "+b);

    }
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped values are : a = "+a+" b = "+b);
    }
    public static void FirstRepeating(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
           
        }

    }
    public static int SecLargest(int[] arr){
        //1st way
        // Arrays.sort(arr);
        // return arr[arr.length-2];

        //------------------------------------------------------------------------------------
        //2nd way
        int g=0,s=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>g) {
                g=arr[i];
            }
        }
         for(int i=0;i<arr.length;i++){
            if (arr[i]==g) {
                arr[i]=0;
            }
        }
         for(int i=0;i<arr.length;i++){
            if (arr[i]>s) {
                s=arr[i];
            }
        }
        return s;
    }
    public static void uniqueNum(int[] arr){
        int f=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    arr[i]=arr[j]=-1;
                }
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void FindPairs(int[] arr,int s) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==s) {
                    System.out.println("("+arr[i]+" , "+arr[j]+")");
                }
            }

        }
        
    }
}
