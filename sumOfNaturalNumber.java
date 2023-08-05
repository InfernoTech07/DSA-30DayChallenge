import java.util.Scanner;
public class sumOfNaturalNumber {
    public static void main(String args[]){
      int n;
      int sum=0;
      System.out.println("Enter number:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
        sum=sum+i;
      }
      System.out.println("sum:"+sum);
    }
}
