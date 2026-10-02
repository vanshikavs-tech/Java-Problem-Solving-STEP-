package Week-8.PRACTICEPROBLEMS;

import java.util.*;
import java.time.LocalDate;

abstract class LibraryItem {
    protected String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(14);
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(7);
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(3);
    }
}

public class LibraryDueDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String type = line.substring(0, line.indexOf(" "));
            String title = line.substring(line.indexOf(" ") + 1);

            title = title.replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }

            System.out.println(title + ": " + item.getDueDate());
        }

        sc.close();
    }
}