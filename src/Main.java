import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.*;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;





public class Main {
    public static boolean secuation = true;
    static Book book = new Book();
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
            String input = scanner.nextLine();
            switch (input) {
                case "h":
                    System.out.println("press  'q'  to quit");
                    System.out.println("press  'a'  to add book");
                    System.out.println("press  's'  to search");
                    System.out.println("press  'ac' to add category");
                    System.out.println("press  'sc' to show category");
                    System.out.println("press  'd' to delete a book ");
                    System.out.println("press  'c' to count all books ");
                    System.out.println();
                    System.out.print("Enter your command : ");
                    break;
                case "c":
                    book.countBook();
                    break;
                case "d":
                    System.out.print("Enter your title : ");
                    book.deleteBook(scanner.nextLine());
                    break;
                case "s":
                    System.out.print("Enter your key : for example (title/year) : ");
                    String key = scanner.nextLine();
                    System.out.print("Enter your subject : for example (1995/horor) : ");
                    String subject = scanner.nextLine();
                    book.searchByKey(key,subject);
                    break;
                case "sc":
                    book.showCategory();
                    break;
                case "q":
                    System.out.println("Good bye :) ");
                    secuation = false;
                    break;
                case "ac":
                    System.out.print("Enter your category name to add it : ");
                    book.addCategory(scanner.nextLine());
                    break;
                default:
                    System.out.println("Wrong command press 'h' for help or 'q' for quit !!! ");
                    break;
            }

    }
    public static void addBook(){


    }

    public static void main(String[] args) {
        book.addBook("Wild", "150", "First", "AsrNovin", "Omid", "2001");
        book.addBook("Harry Pater", "250", "second", "England", "Pitter", "1935");
        book.addBook("Walking Dead", "1000", "Final", "Global", "Victor", "2020");
        book.addBook("Walking Dead", "500", "First", "Global", "Victor", "2010");
        System.out.println("Welcome to version 1 managing library ");
        System.out.println("Enter your command : (h for help)");
        while (secuation == true){
            run();
       }
        scanner.close();
    }
}