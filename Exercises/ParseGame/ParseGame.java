import java.util.Scanner;



public class ParseGame{


  public static void main(String[] args){
    String weapon = "null";
    Scanner s = new Scanner(System.in);

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
    String weaponA[] = weaponI.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split(" ");
    /*
    String weaponIL = weaponI.toLowerCase;
    String weaponNoPunc = noPunc(weaponIL);
    String weaponA[] = weaponNoPunc.split(" ");
    the above method is way simpler though, no for loop needed!
    */

    for(int i = 0; i < weaponA.length; i++){
     switch(weaponA[i]){
      case "sword":
        weapon = "Sword";
        i = 256;
        break;
      case "bow":
        weapon = "Bow";
        i = 256;
        break;
      case "axe":
        weapon = "Axe";
        i = 256;
        break;
      case "spear":
        weapon = "Spear";
        i = 256;
        break;
      default:
     }
      }
      System.out.println("You have chosen the " + weapon);
    }
/*
    public static String noPunc(String str){
      for(int i = 0; i < str.length(); i++){
        switch(str.charAt(i)){
          case ',':
            str = str.replace(",", "");
            break;
          case '.':
            str = str.replace(".", "");
            break;
          case '!':
            str = str.replace("!", "");
            break;
          case '?':
            str = str.replace("?", "");
            break;
          case '%':
            str = str.replace("%", "");
            break;
          case '&':
            str = str.replace("&", "");
            break;
          case '\"':
            str = str.replace("\"", "");
            break;
          case '\\':
            str = str.replace("\\", "");
            break;
          case '/':
            str = str.replace("/", "");
            break;
          case ';':
            str = str.replace(";", "");
            break;
          case ':':
            str = str.replace(":", "");
            break;
          default:
        }
      }
      return str;
    }
    */
  }
