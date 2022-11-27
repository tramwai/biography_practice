import java.util.Scanner;

public class BiographySolution2 {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        Author favAuthor1 = new Author();
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite author's first name?");
        favAuthor1.firstName = input.nextLine();

        System.out.println("What is your favorite author's last name?");
        favAuthor1.lastName = input.nextLine();

        System.out.println("Where is your favorite author from?");
        favAuthor1.country = input.nextLine();

        System.out.println("Is your favorite author alive? Y/N");
        if(input.next().toLowerCase().startsWith("y")) {
            favAuthor1.isAlive = true;
            System.out.println("How old is your favorite author?");
            favAuthor1.age = input.nextInt();
        } else favAuthor1.isAlive = false;

        input.nextLine();

        String enterBooks;
        do{
            System.out.println("Would you like enter book information? (Y/N)");
            enterBooks = input.nextLine();
            if (enterBooks.toLowerCase().startsWith("y")) {
                Book book = new Book();
                System.out.println("What is the book name?");
                book.name = input.nextLine();
                System.out.println("What is genre of the book?");
                book.genre = input.nextLine();
                System.out.println("How many pages does book have?");
                book.totalPage = input.nextInt();
                favAuthor1.listOfBooks.add(book);
                input.nextLine();
            } else break;
        }while(enterBooks.startsWith("y"));

        System.out.println("Author's information = " + favAuthor1);
        if (!favAuthor1.listOfBooks.isEmpty()) {
            System.out.println("Author's books are as listed below: ");
            favAuthor1.listOfBooks.forEach(System.out::println);
        }

    }
}