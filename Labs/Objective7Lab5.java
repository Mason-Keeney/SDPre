import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;
    //int counter = 3;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection == 1){
        System.out.println("Hello World... or human, it's unclear");
      }
      else if(selection == 2){
        System.out.println("Apples, Bananas, and Coconuts");
      }
      else if(selection == 3){
        System.out.println("Goodbye!");
        break;
      }
      /*
      else{
        if(counter > 1){
            System.out.println("Invalid selection");
            counter--;
            System.out.println("Program will end with " + counter + " more invalid selections");
        }
        else if(counter == 1){
          break;
        }
      }
      */
    }
  }
}
