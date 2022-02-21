public class O9MethodsEx {
  public static void main(String[] args){
    printSquare();
    //printRectangle();
  }
  public static void printSquare(){
    int i = 0;
    for(i = 1; i <= 10; i++){
      System.out.println("XXXXXXXXXXXXXXXXXXXX");
    }
  }
  public static void printRectangle(){
    printSquare();
    printSquare();
  }
}
