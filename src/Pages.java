import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int yourAge = inputAge.nextInt();
        System.out.println(yourAge + " year olds should read at least " + (100-yourAge) + " pages of a book before giving up.");
    }
}