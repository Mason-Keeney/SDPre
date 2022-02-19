import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args){
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");

    age = input.nextInt();
    currentYear = 2022;
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();


    /*
    This returns the wrong year for me, since I was born in July
    System.out.println("How old will you be at the end of this calendar year?")
    would make it work.
    */
  }
}
