//Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner pk=new Scanner(System.in);
    System.out.println("Please enter the number");
    int num=pk.nextInt();
    for(int i=1;i<=10;i++){
      int res=i*num;
      System.out.println(num+"x"+i+"="+res);
    }
  }
}