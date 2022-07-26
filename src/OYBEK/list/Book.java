package OYBEK.list;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Book implements BookInt {
    String name;
    int price;
    int count = 0;


    public Book(int count, String name, int price) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Book() {

    }


    @Override
    public void search(LinkedList<Book> list) {
        boolean b = false;
        System.out.println("===Search book===");
        Scanner scanner = new Scanner(in);
        System.out.print("Book name write: ");
        String name = scanner.nextLine();
        for (Book book : list) {
            if (Objects.equals(book.name, name)) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("Book have");
            System.out.println();
        } else {
            System.out.println("Book no");
            System.out.println();
        }
    }

    @Override
    public void list(LinkedList<Book> list) {
        System.out.println("===List===");
        for (Book book : list) {
            System.out.println(book.count + " " + book.name + " " + book.price);
            count++;


        }


    }


    @Override
    public void add(LinkedList<Book> list) {
        System.out.println("===Add list===");
        Scanner scanner = new Scanner(in);
        System.out.print("Book name write: ");
        String bookName = scanner.nextLine();
        System.out.print("Book price write: ");
        int bookPrice = scanner.nextInt();
        list.add(new Book(count, bookName, bookPrice));

        System.out.println("Success");
    }

    @Override
    public void remove(LinkedList<Book> list) {
        System.out.println("===Remove===");
        Scanner scanner = new Scanner(in);
        System.out.println("1->Clear");
        System.out.println("2->Remove");
        System.out.print("= ");
        int r = scanner.nextInt();
        if (r == 1) {
            list.clear();
        } else if (r == 2) {
            scanner = new Scanner(in);
            for (Book bok : list) {
                System.out.println(bok.count + " " + bok.name + " " + bok.price);
                System.out.print("Index write: ");
                int index = scanner.nextInt();
                list.remove(index);
                System.out.println("Success");
                            }


        }
    }
}

