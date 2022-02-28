import java.util.Scanner;

public class Substring{
  public static void main(String[] args){
    /*
    turns out it's harder to use substrings than to research an entirely
    new concept to do this, parsing for the win!
    */
    Scanner kbS = new Scanner(System.in);
    String name = "na";

    System.out.println("What is your name?");
    String input = kbS.nextLine();
    String parsed[] = input.split(" ");
    if(parsed.length > 3){
      name = parsed[3];
    } else if(parsed.length == 3){
      name = parsed[2];
    } else if(parsed.length == 2){
      name = parsed[1];
    }
    else{
      name = input;
    }
      System.out.println("Your name is " + name);
    }
}
