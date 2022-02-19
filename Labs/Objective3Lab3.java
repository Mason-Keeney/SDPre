public class Objective3Lab3{
  public static void main(String[] args){
    //declare
    int first, second, third;

    //initialize
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);

    //declare and initialize
    int sum = first + second + third;

    //output
    System.out.println(first + " + " + second + " + " + third + " = " + sum);
  }
}
