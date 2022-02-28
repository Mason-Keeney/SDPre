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
      case "sword.":
        weapon = "Sword";
        i = 256;
        break;
      case "bow":
      case "bow.":
        weapon = "Bow";
        i = 256;
        break;
      case "axe":
      case "axe.":
        weapon = "Axe";
        i = 256;
        break;
      case "spear":
      case "spear.":
        weapon = "Spear";
        i = 256;
        break;
      default:
     }
      }
      System.out.println("You have chosen the " + weapon);
    }
  }
