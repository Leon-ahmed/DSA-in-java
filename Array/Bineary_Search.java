import java.util.Scanner;
class bs{
    int binary_search(int a[], int t, int left, int right) {
       
        while (left <= right) {
            int mid = (right + left) / 2;
             if(t == a[mid])
                 return mid;
            else if (t < a[mid]) {
               return binary_search( a,  t, left, right=mid-1);
            }
             else 
                return binary_search( a, t, left=mid+1, right);
        
            }
         return -1;
    }
   
}
public class Bineary_Search {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        bs a1 = new bs();
        int[] a = { 10, 12, 15, 18, 22, 25, 28, 30, 35 };
         int left = 0;
        int right = a.length - 1;
        if(a1.binary_search(a, t,left,right)==-1){
            System.out.println("Not Found");
        }
        else
        System.out.println("Found in index :" + a1.binary_search(a, t,left,right));
        input.close();
    }
}
