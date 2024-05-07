//Write a Java program to print the sum (addition),
//multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner pk=new Scanner(System.in);
    System.out.println("Please enter the first number");
    int num1=pk.nextInt();
    System.out.println("Please enter the second number");
    int num2=pk.nextInt();
    int sum=num1+num2;
    System.out.println("Sum Result : "+sum);
    int difference=num1-num2;
    System.out.println("Substraction Result : "+difference);
    int mult=num1*num2;
    System.out.println("Multiplication Result : "+mult);
    int div=num1/num2;
    System.out.println("Division Result : "+div);
    int rem=num1%num2;
    System.out.println("Remainder Result : "+rem);
  }
}