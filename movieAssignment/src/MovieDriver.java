import java.util.Scanner;

public class MovieDriver {

    static Scanner  scanner;

    static Movie movie;

    static String name;
    static String rating;
    static  int tickets;
    static char response;
/**
Create a new object of type Scanner that reads from the keyboard
Create a new movie object
Prompt the user to enter the title of a movie
Read in the line that the user types
Set the title in the movie object
Prompt the user to enter the movie’s rating
Read in the line that the user types
Set the rating in the movie object
Prompt the user to enter the number of tickets sold at a (unnamed) theater
Read in the integer that the user types
Set the number of tickets sold in the movie object
Print out the information using the movie’s toString method

* */
public MovieDriver(){

}
    public static void main(String[] args) {
	// write your code here
        scanner = new Scanner(System.in);
        movie = new Movie();
        do {
            System.out.println("Enter the name of a movie ");
            name = scanner.next();
//            scanner.next();
            System.out.println("Enter the rating of the movie ");
            rating = scanner.next();
//            scanner.next();
            System.out.println("Enter the number of tickets sold for this movie ");
            tickets = scanner.nextInt();
//            scanner.next();

            movie.setTitle(name);
            movie.setRating(rating);
            movie.setSoldTickets(tickets);
            System.out.println(movie);
            System.out.println("Do you want  to enter another? (y or n)");
            response = scanner.next().charAt(0);
        } while (response != 'n' && response != 'N');

        System.out.println("Goodbye");
    }
}
