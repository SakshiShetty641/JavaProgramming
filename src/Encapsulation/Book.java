package Encapsulation;

//Exercise 1 -> Create 3 instances of a class
class Studies {

    private int noOfCopies;

    void nameOfBook(String name) {
        System.out.println("Name of the book is : " + name);
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }
}

public class Book {

    public static void main(String[] args) {
        Studies book1 = new Studies();
        Studies book2 = new Studies();
        Studies book3 = new Studies();

        book1.nameOfBook("Art of Computer Programming");
        book1.setNoOfCopies(70);
        System.out.println("No of copies :" + book1.getNoOfCopies());
        book2.nameOfBook("Effective Java");
        book2.setNoOfCopies(20);
        System.out.println("No of copies :" + book2.getNoOfCopies());
        book3.nameOfBook("Clean Code");
        book3.setNoOfCopies(30);
        System.out.println("No of copies :" + book3.getNoOfCopies());
    }
}


