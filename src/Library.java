public class Library {

    String tittle;
    String author ;
    String yearOfPublisment ;
    int pages ;
    String numberIsbn ;
    String color ;

    Library(String bookTittle, String bookAuthor, String bookYearOfPublisment, int bookPages, String bookNumberISBN,
         String bookColor) {
        tittle=bookTittle;
        author=bookAuthor;
        yearOfPublisment=bookYearOfPublisment;
        pages=bookPages;
        numberIsbn=bookNumberISBN;
        color=bookColor;


    }

    void printInfo(){
        String info = tittle  + " ; " + author + " " + yearOfPublisment + " ; " + pages + " ; " + numberIsbn + " ; " +
                color;
        System.out.println(info);
    }

}
