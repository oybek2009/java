package OYBEK.list;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.in;

public class Llist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Book book = new Book();
        int count = 0;
        LinkedList<Book> list =new LinkedList<>();
        list.add(new Book(count++,"Java",15000));
        list.add(new Book(count++,"C++",13000));
        list.add(new Book(count++,"Java S",25000));
        list.add(new Book(count++,"IT",16000));



        while (true) {
            System.out.println("1->Search");
            System.out.println("2->List");
            System.out.println("3->Add");
            System.out.println("4->Remove");
            System.out.println("5->Quit");
            System.out.print("= ");
            int t = scanner.nextInt();
            if (t == 5) {
                System.out.println("You quit programma!!!");
                break;
            }


            switch (t) {
                case 1 -> {
                    book.search(list);
                }
                case 2 -> {
                    book.list(list);
                }
                case 3 -> {
                    book.add(list);
                }
                case 4 -> {
                  book.remove(list);

                }

            }
        }

    }
}

