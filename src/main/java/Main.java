import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                String s1 = "123345";
                String s2 = "-5023345";
                String s3 = "+0";
                String s4 = "-00458";
                String s5 = "-1";
                System.out.println(NumberFormatter.parseInt(s1));
                System.out.println(NumberFormatter.parseInt(s2));
                System.out.println(NumberFormatter.parseInt(s3));
                System.out.println(NumberFormatter.parseInt(s4));
                System.out.println(NumberFormatter.parseInt(s5));

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter string of integers: ");
                String s = scanner.nextLine();
                System.out.println(NumberFormatter.parseInt(s));
        }
}
