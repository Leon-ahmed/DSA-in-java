
import java.util.Scanner;
import java.util.Vector;

class Search {
    void linear_search(Vector<Integer> a, int n) {
        int c = 0;
        for (Integer b : a) {

            if (b == n) {
                System.out.println("The Value is Found ");
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("The Value is not Found ");
        }
    }

}

public class Linear_search{
    public static void main(String[] args) {
        int t, n;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        n = input.nextInt();

        Vector<Integer> a = new Vector<>();
        for (int i = 0; i < t; i++) {
            int x;
            x = input.nextInt();
            a.add(x);
        }
        Search c = new Search();
        c.linear_search(a, n);

        input.close();
    }

}
