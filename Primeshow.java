import java.util.Scanner;
public class Primeshow {
    static String prime(long number) {
        int x = 1;
        int counter = 0;
        for (x = 1; x <= number; x++) {
            long f = number % x;
            if (f == 0) {
                counter = counter + 1;
            }
        }
        if (counter > 2) {
            return "Composite";
        } else {

            return "Prime";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        System.out.print("from:");
        long lf = input.nextInt();
        System.out.print("till:");
        long fl = input.nextInt();
        long lol = lf;
            while (lf < 2||lf>fl) {
                if(lf<2) {
                    System.out.println("Sorry, you can't enter anything below two! Please try again!");
                    System.out.print("from:");
                    lf = input.nextInt();
                    System.out.print("till:");
                    fl = input.nextInt();
                    lol = lf;
                }
                if(lf>fl){
                    System.out.println("\"from\" has to be smaller than \"till\"! Please try again!");
                    System.out.print("from:");
                    lf = input.nextInt();
                    System.out.print("till:");
                    fl = input.nextInt();
                    lol = lf;
                }
            }
            for (lol = lf; lol <= fl; ++lol) {
                if (prime(lol) == "Prime") {
                    cnt = cnt + 1;
                    System.out.println(lol);
                }
            }
            System.out.println(cnt + " prime numbers found" + " between " + lf + " and " + fl);
    }
}


