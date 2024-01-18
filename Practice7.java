import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c,r;
        System.out.println("Enter no. of columns and rows : ");
        c=sc.nextInt();
        r=sc.nextInt();
        //----------------------------------------------------------------------------------------

        //Creating 2D array
        //int arr1[][]=CreateArray(c,r);
        
        //-----------------------------------------------------------------------------------------
        //Printing 2D array
        //PrintArray(r,c,arr1);

        //--------------------------------------------------------------------------------------------
        //Adding 2D arrays
        //int arr2[][]=CreateArray(c, r);
        // PrintArray(r, c, arr2);
        // int arr3[][]=AddArray(arr1,arr2,c,r);
        // PrintArray(r, c, arr3);

        //----------------------------------------------------------------------------------------------------
        //Multiplying 2D Arrays
        // int arr1[][]=CreateArray(c,r);
        // int arr2[][]=CreateArray(c,r);
        // int arr3[][]=MulArray(arr1,arr2,c,r);

        //-------------------------------------------------------------------
        //transpose 2d array
        // int arr1[][]=CreateArray(c,r);
        // PrintArray(r, c, arr1);
        // int[][] arr2=Transpose(r, c, arr1);
        // PrintArray(r, c, arr2);
        
        //----------------------------------------------------------------------------------
        //rotate array by 90*
        // int arr1[][]=CreateArray(c,r);
        // PrintArray(r, c, arr1);
        // int[][] arr2=Transpose(r, c, arr1);
        // PrintArray(r, c, arr2);
        // Rotate(r,c,arr2);

        //----------------------------------------------------------------------------------------
        //pascal's triangle
        int n;
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        PascalTriangle(n);


        sc.close();
    }
    public static void PascalTriangle(int n){
        int arr[][]=new int[n][];
        System.out.println("pascal triangle is: ");
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        PrintArray(arr);
        
    }
    public static void Rotate(int r,int c,int[][] arr){
        System.out.println("Rotated Array Elemenys are : ");
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        } 
    }
    public static int[][] Transpose(int r ,int c, int[][] arr ) {
        System.out.println("Transposed Array Elemenys are : ");
        int[][] arr2=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=arr[j][i];
            }
           
        }
        return arr2;
        
    }
    public static int[][] MulArray(int [][] arr1,int [][] arr2,int c,int r){
        int arr3[][]=new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int a=0;a<i;a++)
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return arr3;
    }
    public static int[][] AddArray(int [][] arr1,int [][] arr2,int c,int r){
        int arr3[][]=new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return arr3;

    }
    public static int[][] CreateArray(int c,int r){
        Scanner sc=new Scanner(System.in);
        int e;
        int arr[][]=new int[r][c];
        System.out.println("Enter array Elements : ");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                e=sc.nextInt();
                arr[i][j]=e;
            }
        }
        return arr;
    }
    public static void PrintArray(int r,int c,int[][] arr){
        System.out.println("Array Elemenys are : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void PrintArray(int[][] arr){
        System.out.println("Array Elemenys are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
   
}
