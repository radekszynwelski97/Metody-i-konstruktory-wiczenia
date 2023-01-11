public class Library {

    String tittle;
    String author ;
    String yearOfPublisment ;
    int pages ;
    String numberIsbn ;
    String color ;

     Library(String tittle, String author, String yearOfPublisment, int pages, String numberIsbn) {
        this.tittle = tittle;
        this.author = author;
        this.yearOfPublisment = yearOfPublisment;
        this.pages = pages;
        this.numberIsbn = numberIsbn;
    }

     Library(String tittle, String author, String yearOfPublisment, int pages, String numberIsbn, String color) {
        this(tittle , author , yearOfPublisment , pages  , numberIsbn);
        this.color = color;
    }

    void printInfo(){
        String info = tittle  + " ; " + author + " " + yearOfPublisment + " ; " + pages + " ; " + numberIsbn + " ; " +
                color;
        System.out.println(info);
    }

}
