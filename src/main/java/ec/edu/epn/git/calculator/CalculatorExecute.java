package ec.edu.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] args){

        System.out.println("Calculator execute");
        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("Addition: " + addition);

        int substraction = c.subtraction(7,1);
        System.out.println("Subtraction: " + substraction);

        System.out.println("Esto es un cambio en calculatorExecute");

    }
}
