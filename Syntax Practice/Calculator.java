/* 
Basic Calculator: 

In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

- Add two integers
- Subtract two integers
- Multiply two integers
- Divide two integers
- Apply the modulo operator on two integers

*/

public class Calculator {
  public Calculator(){}

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a + b;
  }

  public int divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    
    // Add numbers
    System.out.println("The sum of 5 and 7 is: " + myCalculator.add(5,7));
    
    // Divide numbers
    System.out.println("104 divided by 4 is: " + myCalculator.divide(104,4));
  }

}