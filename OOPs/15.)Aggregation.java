class Library{
    String name;
    int year;
    Book[] books;

    Library(String name,int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;

    }

    void showInfo(){
        System.out.println("The "+ this.year+ " " + this.name);
        System.out.println("Books Available : ");
        for(Book book:books){
            book.displayInfo();
        }
    }

}

    

class Book{
    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.println("The name of book is "+this.name+" and is "+this.pages+ " pages long");
        
    }
}



public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a " has - a " relationship between objects.
        //               One object contains another object as part of its srtructure
        //               but the contained object/s can exist independently.


        Book b1 = new Book("The Lion King", 423);
        Book b2 = new Book("No F*cks Given", 353);
        Book b3 = new Book("Psychology of Money", 250);


        Book[] books ={b1,b2,b3};

        // This is Aggregation

        Library lib = new Library("Newton Library",1993 , books);

        lib.showInfo();

        
    }
}
