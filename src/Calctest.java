public class Calctest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 50;
        int b = 30;
        int c = 10 ;

       int add =  calculator.add(a , b);
        int add2 = calculator.add(a , b , c );
        int substract = calculator.substract(a , b );
         int substract2= calculator.substract(a , b , c );

        System.out.println("A = " +  a + " "  + "B = " +  b + " " + "C = "  + c);
        System.out.println(add);
        System.out.println(add2);
        System.out.println(substract);
        System.out.println(substract2);
    }
}
