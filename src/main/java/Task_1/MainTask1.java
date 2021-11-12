package Task_1;

import java.util.Scanner;

public class MainTask1 {
        public static void main(String[] args) {
                String s1 = "21474836473";
                String s2 = "54321";
                String s3 = "1234";
                String s4 = "-00458";
                String s5 = "-00";
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
