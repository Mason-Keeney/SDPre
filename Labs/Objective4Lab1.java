//import utility
import java.util.Scanner;

public class Objective4Lab1{
    public static void main(String[] args){

// declare scanner
      Scanner keyboard = new Scanner(System.in);

//declare and initialize variables without distinct information
      String fname = "";
      String lname = "";
      String favoriteAnimal = "";
      String favoriteFood = "";
      String favoriteSong = "";

//output for question
      System.out.println("What is your first name?");
//input from keyboard scanner to add information to variables
      fname = keyboard.nextLine();

      System.out.println("What is your last name?");
      lname = keyboard.nextLine();

      System.out.println("What is your favorite animal?");
      favoriteAnimal = keyboard.nextLine();

      System.out.println("What is your favorite food?");
      favoriteFood = keyboard.nextLine();

      System.out.println("What is your favorite song?");
      favoriteSong = keyboard.nextLine();

//final output
      System.out.println("My name is " + fname + " " + lname);
      System.out.println("My favorite animal is the " + favoriteAnimal);
      System.out.println("My favorite food is " + favoriteFood);
      System.out.println("My favorite song is " + favoriteSong);

    }
}
