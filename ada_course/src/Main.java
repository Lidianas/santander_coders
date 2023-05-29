// Back to Java by (not so) popular demand

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String introduction = "Santander Coders 2023";

        System.out.println("Welcome to " + introduction);
        System.out.println("---------------------------------");
        System.out.println("Playing with variable types");
        int a;
        int b = 2;
        a = 3;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        // Java comprehends that a division of two integer values is an integer valur,
        // therefore is necessary to implement a cast operation
        float div = (float) a / b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(div);

        System.out.println("---------------------------------");

        boolean p = true;
        boolean q = true;
        boolean and = p && q;
        boolean or = p || q;
        String ternary = p ? "it is true": "it is not true";
        System.out.println(and);
        System.out.println(or);
        System.out.println(ternary);
        System.out.println("---------------------------------");

        System.out.println("Conditionals");

        float grade = 9;
        String l = "B";

        if(grade >= 5 && grade < 6){
            System.out.println("E");
        } else if (grade >=6 && grade < 7){
            System.out.println("D");
        } else if (grade  >= 7 && grade < 8){
            System.out.println("C");
        } else if (grade >=8 && grade < 9){
            System.out.println("B");
        } else if (grade >=9 && grade <= 10){
            System.out.println("A");
        } else if (grade < 5 && grade >= 0){
            System.out.println("Reproved");
        } else {
            System.out.println("Not a valid value to grade");
        }

        switch(l){
            case "A":
                System.out.println("Congrats");
                break;
            case "B":
                System.out.println("Wonderful");
        }

        System.out.println("---------------------------------");
        System.out.println("Handling strings");

        String name = "Lidiana";
        String msg;
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String anotherName = "Lidiana";
        System.out.println(name.equals(anotherName));

        // ISO 8601, standard to represent data
        LocalDate weekday = LocalDate.now();
        // Locale brazil = new Locale();
        System.out.println(weekday.getDayOfWeek());
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() >=0 && now.getHour() < 12){
            msg = "Good Morning";
        } else if(now.getHour() >= 12 && now.getHour() < 18){
            msg = "Good Afternoon";
        } else if(now.getHour()>=8 && now.getHour()<=24){
            msg = "Good night";
        } else {
            msg = "not defined";
        }

        // printf do not print in a new line
        System.out.printf("Hi, %s. Today is %s, %s.%n", name, weekday, msg);
        System.out.println("---------------------------------");
        System.out.println("Remembering loops");


    }
}