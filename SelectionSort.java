import java.util.Random;
import java.util.Scanner;

public class SelectionSort{
    public static int size=7000;
    public static void main(String [] args){
        int a[]= new int[size];
        System.out.println("enter the total number of elements for sorting");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Random m = new Random();
            for (int i = 0; i < n; i++) {
                a[i]=m.nextInt(10)+1;
            }
            System.out.println("the elements before sorting");
            for (int i = 0; i < n; i++) {
                System.out.println(""+a[i]);
            }
            long start,end;
            start=System.nanoTime();
            selectionSort(a,n);
            end=System.nanoTime();
            System.out.println("\n the elements after sorting");
            for(int i=0;i<n;i++){
                System.out.println(""+a[i]);
            }
            System.out.println("\n the time required for sorting"+n+ "numbers is:"+(end-start)+"ns");
        }
    }
    static void selectionSort(int[]a,int n){
        int i,j,minV=0,minI=0,temp;
        for (i = 0; i < n; i++) {
            minV=a[i];
            minI=i;
            for ( j = i; j < n; j++) {
                if (a[j]<minV) {
                    minV=a[j];
                    minI=j;
                }
            }
            if (minV<a[i]) {
                temp=a[i];
                a[i]=a[minI];
                a[minI]=temp;
            }
        }
    }
}