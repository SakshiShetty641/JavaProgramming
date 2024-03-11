package OOPS;
import java.util.ArrayList;

import java.util.ArrayList;


class Review{

    private  int id;
    private String description;
    private int rating;

    public Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public  String toString(){
        return String.format("id - %d description - %d rating - %d", id, description, rating);
    }
}

public class Book {

    private  int id;
    private String description;
    private String author;

    private final ArrayList<Review> reviews = new ArrayList<>();


    public Book(int id, String description, String author) {
        this.id = id;
        this.description = description;
        this.author = author;
    }

    public static void main(String[] args) {
        Book book = new Book(123, "OOPS book", "John");
        book.addReview(new Review(3, "Popular", 8));
    }

    private void addReview(Review review) {
        this.reviews.add(review);

    }
}
