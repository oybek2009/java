package OYBEK.list2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {

        User user = new User();
        ArrayList<User> arrayList = new ArrayList<>();
        System.out.println(" Welcome to our shop ");
        while (true) {
            System.out.println("Product [1]");
            System.out.println("History [2]");
            System.out.println("Product List [3]");
            System.out.print("= ");
            int t = scanner.nextInt();
            switch (t) {
                case 1 -> {
                    user.product(arrayList);
                }
                case 2 -> {
                    user.history(arrayList);
                }
                case 3 -> {
                    user.list(arrayList);
                }
            }
        }
    }


}









