package OYBEK.list2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class User implements Kr {
    String name;
    String phone;
    String productName;
    ArrayList<User> arrayList = new ArrayList<>();

    public User(String name, String phone, String productName) {
        this.name = name;
        this.phone = phone;
        this.productName = productName;
    }

    public User() {
    }

    @Override
    public void product(ArrayList<User> arrayList) {
        Scanner scanner = new Scanner(in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        System.out.print("Write your phone number: ");
        String num = scanner.nextLine();
        System.out.print("Write your productName: ");
        String productName = scanner.nextLine();
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User(name,num,productName));
    }

    @Override
    public void history(ArrayList<User> arrayList) {
        System.out.println("===History===");
        for (User name : arrayList) {
            System.out.println(name.productName);

        }


    }

    @Override
    public void list(ArrayList<User> arrayList) {
        System.out.println("===List===");
        System.out.println();
        for (User user : arrayList) {
            System.out.println(user.name + " " + user.phone + " " + user.productName);
        }
    }
}
