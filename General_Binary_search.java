// Iterative Binary Search 


import java.util.Scanner;
class bs{
    int binary_search(int a[], int t) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
             if(t == a[mid])
                 return mid;
            else if (t < a[mid]) {
                right = mid - 1;
            }
             else 
                left = mid + 1;
        
            }
         return -1;
    }
   
}

public class General_Binary_search{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        bs a1 = new bs();
        int[] a = { 10, 12, 15, 18, 22, 25, 28, 30, 35 };
        if(a1.binary_search(a, t)==-1){
            System.out.println("Not Found");
        }
        else
        System.out.println("Found in index :" + a1.binary_search(a, t));
        input.close();
    }

}