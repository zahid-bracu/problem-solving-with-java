//Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner pk=new Scanner(System.in);
    System.out.println("Please enter the first number");
    int num1=pk.nextInt();
    System.out.println("Please enter the second number");
    int num2=pk.nextInt();
    int result=num1*num2;
    System.out.println("Result : "+result);
  }
}