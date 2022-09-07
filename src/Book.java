import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Timer;

public class Book {
    private String Title, NumberOfPage, Edition, Publisher, Author, Year;
    ArrayList<Book> listBook = new ArrayList<Book>();
    private ArrayList<String> category = new ArrayList<String>(Arrays.asList("Art","Business","Cooking","Health","History","Horor"));

    //section constructer
    public Book(String title, String numberOfPage, String edition, String publisher,
                String author, String year) {
        Title = title;
        NumberOfPage = numberOfPage;
        Edition = edition;
        Publisher = publisher;
        Author = author;
        Year = year;
    }
    public Book() {

    }

    //section Books
    public void addBook(String title, String numberOfPage, String edition, String publisher, String author, String year) {
        listBook.add(new Book(title, numberOfPage, edition, publisher, author, year));
    }
    public void countBook(){
       for (int i = 0 ; i < listBook.size(); i++){
           System.out.println(listBook.get(i).getTitle());
           System.out.println("-------------------");
           System.out.println("Title : "+listBook.get(i).getTitle()+
                        "\nPage number : "+ listBook.get(i).getNumberOfPage()+
                        "\nEdition : "+listBook.get(i).getEdition()+"\nPublisher : "+
                        listBook.get(i).getPublisher()+"\nAuthor : " + listBook.get(i).getAuthor()+"\nYear: "+listBook.get(i).getYear());
           System.out.println("-------------------");
       }
        System.out.println();
        System.out.print("Enter your command : ");
    }

    // section Search
    public void searchByKey(String key , String subject ) {
        boolean flag = false;
        int count = 1;
        String answer = null;
        for (Book b : listBook) {
            switch (key){
                case "title":
                    answer = b.getTitle();
                    break;
                case "numberOfPage":
                    answer = b.getNumberOfPage();
                    break;
                case "edition":
                    answer = b.getEdition();
                    break;
                case "publisher":
                    answer = b.getPublisher();
                    break;
                case "author":
                    answer = b.getAuthor();
                    break;
                case "year":
                    answer = b.getYear();
                    break;
                default:
                    System.out.println("You Entered Wrong command\nTry Again\n");
                    break;
            }
            if (subject.equals(answer)) {
                System.out.println("--------------------------------- \n \t\tBook number " + count);
                System.out.println("---------------------------------");
                System.out.println("Title : "+b.getTitle()+
                        "\nPage number : "+ b.getNumberOfPage()+
                        "\nEdition : "+b.getEdition()+"\nPublisher : "+
                        b.getPublisher()+"\nAuthor : " + b.getAuthor()+"\nYear: "+b.getYear());
                        count ++ ;
                flag = true;
            }
        }
        if (flag == false)
            System.out.println("book is not in the list ");
        System.out.println();
        System.out.print("Enter your command : ");
    }

    //section Delete
    public void deleteBook(String title) {
        for(int i = 0 ; i < listBook.size();i++){
            if(listBook.get(i).getTitle().equals(title)){
                System.out.printf("Removing %s from the list \n", title);
                listBook.remove(i);
            }
        }
    }
    // section category
    public void addCategory(String name){
        this.category.add(name);
        System.out.print("Enter your command : ");
    }
    public void showCategory(){
        System.out.print(Arrays.toString(new ArrayList[]{category}));
//        for (int i = 0 ; i <= category.size();i++){
//            System.out.println(category.get(i));
//        }
        System.out.println();
        System.out.print("Enter your command : ");
    }




    //section Getter and setter
    public String getTitle() {
        return Title;
    }

    public String getNumberOfPage() {
        return NumberOfPage;
    }

    public String getEdition() {
        return Edition;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public String getYear() {
        return Year;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }



}










//        Iterator<Book> iterator = listBook.iterator();
//        while (iterator.hasNext()){
//            Book next = iterator.next();
//            if(next.getTitle().equals(title))
//                iterator.remove();
//        }





