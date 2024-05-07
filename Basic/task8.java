//pattern printing
public class task8{
  public static void main(String[] args){
    int m=5;
    int n=5;
    System.out.println("Square : ");
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
    
    System.out.println("Triangle : ");
    for(int i=1;i<=m;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}