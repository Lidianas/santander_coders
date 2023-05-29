// Back to Java by (not so) popular demand

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();

        // constructors


        myDog.setName("Tita");
        myDog.setWeight(21);
        myDog.setColor("Orange");
        myDog.setHeight(110);

        myDog.latir();
        myDog.playWith("smile");
        myDog.playWith("pet");

    }

}