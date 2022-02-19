public class Objective3Lab2{
  public static void main(String[] args){
    //declare and initialize!
    double side1 = 3;
    double side2 = 4;

    /*
      if a specific form was needed for grading, just uncomment the other line,
      but I thought it'd be fun to try it with a different math function.
    */
    //double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

    double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

    //output
    System.out.println(hypotenuse);    
  }
}
