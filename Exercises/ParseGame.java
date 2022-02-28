import java.util.Scanner;


public class ParseGame{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String weapon = "null";

    System.out.println("Welcome to the parse games!");
    System.out.println("They are pretty short");
    System.out.println("What weapon do you want?");
    System.out.println("--------------------");
    System.out.println("|      Sword       |");
    System.out.println("|      Bow         |");
    System.out.println("|      Spear       |");
    System.out.println("|      Axe         |");
    System.out.println("--------------------");

    String weaponI = s.nextLine();
    String weaponIL = weaponI.toLowerCase();
    String weaponA[] = weaponIL.split(" ");
    for(int i = 0; i < weaponA.length; i++){
     switch(weaponA[i]){
      case "sword":
        weapon = "Sword";
        break;
      case "bow":
        weapon = "Bow";
        break;
      case "axe":
        weapon = "Axe";
        break;
      case "spear":
        weapon = "Spear";
        break;
      default:
     }
      }
      System.out.println("You have chosen the " + weapon);
    }
  }
