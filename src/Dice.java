import java.util.Random;

public class Dice {

    int top;


    Dice() {
        Random random = new Random();


        top = random.nextInt();
    }

    Dice(int top) {
        this.top = top;
    }

    void roll(){
        Random random = new Random();
        top = random.nextInt(6) + 1 ;
    }

    void  printInfo(){
        System.out.println("Liczba oczek na kostce to : " + top);
    }


}
