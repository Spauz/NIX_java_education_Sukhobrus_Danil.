package nix.education.java.chatbot;
import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        System.out.println("Hello my name is Spzbot.");
        System.out.println("I was created in 2021.");
        //Chatbot 1 stage
        System.out.println("Please, remind me your name.");
        Scanner bot = new Scanner(System.in);
        String name = bot.nextLine();
        System.out.println("What a great name you have, " + name);
        //Chatbot 2 stage
        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age1 = bot.nextInt();
        int age2 = bot.nextInt();
        int age3 = bot.nextInt();
        int age =  (age1%3 * 70 + age2%5 * 21 + age3%7 * 15) % 105;
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");
        //Chatbot 3 stage
        System.out.println("Now i will prove you that i can count any number you want");
        int number = bot.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + " !");
        }
        //Chatbot 4 stage
        System.out.println("Lets test your programming knowledge");
        System.out.println("Why do we use methods?");
        System.out.println("1.To repeat a statement multiple times.");
        System.out.println("2.To decompose a program into several small subroutines");
        System.out.println("3.To determine the execution time of a program.");
        System.out.println("4.To interrupt the execution of a program.");
        while (true) {
            String answer = bot.next();
            if (answer.equals("2")){
                System.out.println("Great, you right!");
                System.out.println("Goodbye, have a nice day!");
                break;
            }
            else {
                System.out.println("Please,try again.");
            }
        }
    }
//Chatbot 5 stage
}