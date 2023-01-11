public class Book {

    public static void main(String[] args) {
        Library library1 = new Library("W pustyni i w puszczy" , "Henryk Sienkiewicz" ,
                "1992" , 294 , "212121" , "Red");
        library1.printInfo();

        Library library2 = new Library("Magiczna moc perfum ", "Penny Jordan" , "1255" ,
                450 , "2112121" , "Yellow");
        library2.printInfo();
        Library library3 = new Library("Najbogatszy Hiszpan " , "Susan Stephens " , "1252" ,
                410 ,  "Blue");
        library3.printInfo();



    }


}
