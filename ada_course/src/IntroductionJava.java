import java.time.LocalDate;
import java.time.LocalDateTime;

public class IntroductionJava {
    public void IntroductionJava() {
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

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.println("i is "+i+" and j is "+j);
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Handling arrays");

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        float medium = 0;

        String[] letters = {"A", "B", "C", "D", "E"};

        for (int i=0; i<numbers.length; i++){
            System.out.println("In position "+i+" of the array we have the following value "+numbers[i]);
            medium += (float) numbers[i];
        }

        System.out.println("The medium of the value in the array is "+medium/numbers.length);
        System.out.println();
        for (int i=0; i<letters.length; i++){
            System.out.println("In position "+i+" of the array we have the following value "+letters[i]);
        }

        String anotherAnotherName = "Lidiana";
        msg(anotherAnotherName);

        int res = sum(2,3);
        System.out.println("The sum is "+res
        );
    }

    public static void msg(String name){
        System.out.println("Hi, "+name+"!");
    }

    public static int sum(int a, int b){
        return a + b;
    }
}